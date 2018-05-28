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

public class MainController {


    @FXML
    private Button button;

    @FXML
    private Label label;

    public void executeHelloWorldRules() throws IOException,
            DroolsParserException {
        KieServices ks = KieServices.Factory.get();
        BasicConfigurator.configure();
        Logger.getLogger(MainController.class).setLevel(Level.OFF);
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession session = kContainer.newKieSession("ksession-rules");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setPrintMessage("Test");
        session.insert(helloWorld);
        label.setText(helloWorld.getPrintMessage());
        session.fireAllRules();
    }


    @FXML
    public void test(MouseEvent event) throws IOException, DroolsParserException {
        executeHelloWorldRules();

    }

}

