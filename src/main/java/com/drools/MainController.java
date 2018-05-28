package com.drools;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.drools.compiler.compiler.DroolsParserException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class MainController implements  Initializable {


    @FXML
    private Button black;

    @FXML
    private Label label;

    @FXML
    private Button brown;

    @FXML
    private Button white;
    @FXML
    private Button check;


    Gowno gowno = new Gowno();
    Message message = new Message();

    public void executeGownoRules() throws IOException,
            DroolsParserException {
        // Obiekt typu KieServices to singleton umożliwiający dostęp do usług Kie.
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(MainController.class).setLevel(Level.OFF);
        // Pobierz kontener - obiekt grupujący wszystkie bazy wiedzy danego modułu.
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Obiekt sesji pozwala na interakcję z silnikiem Droolsa
        // i jest wypełniany początkowymi obiektami.
        KieSession session = kContainer.newKieSession("ksession-rules");

        label.setText(message.getPrintMessage());
        // Dodaj do pamięci roboczej obiekt typu gowno i message
        session.insert(gowno);
        session.insert(message);

        // Uruchom wnioskowanie.
        session.fireAllRules();
    }

    @FXML
public void check(MouseEvent event) throws IOException, DroolsParserException {
        executeGownoRules();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        white.setOnAction(e->gowno.setKolor("biały"));
        brown.setOnAction(e->gowno.setKolor("brazowy"));
        black.setOnAction(e->gowno.setKolor("czarny"));

    }
}

