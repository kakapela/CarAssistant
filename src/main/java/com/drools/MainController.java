package com.drools;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private JFXRadioButton choice1;

    @FXML
    private ToggleGroup choices;

    @FXML
    private JFXRadioButton choice3;

    @FXML
    private JFXRadioButton choice4;

    @FXML
    private JFXRadioButton choice5;

    @FXML
    private JFXRadioButton choice6;

    @FXML
    private JFXRadioButton choice7;

    @FXML
    private JFXRadioButton choice8;

    @FXML
    private JFXRadioButton choice9;

    @FXML
    private JFXRadioButton choice10;

    @FXML
    private JFXRadioButton choice11;

    @FXML
    private JFXRadioButton choice12;

    @FXML
    private JFXRadioButton choice2;

    @FXML
    private Label question;
    public Label wynik;

    @FXML
    private JFXButton nextButton;
    private KieServices ks;
    private KieContainer kc;
    private String userChoice;


    @Override
    public void initialize(URL location, ResourceBundle resources) {



    }
    @FXML
    public void next(MouseEvent event) {

        ks = KieServices.Factory.get();
        kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("ksession-rules");
        ksession.setGlobal( "choice1",choice1);
        ksession.setGlobal( "choice2",choice2);
        ksession.setGlobal( "choice3",choice3);
        ksession.setGlobal( "choice4",choice4);
        ksession.setGlobal( "choice5",choice5);
        ksession.setGlobal( "choice6",choice6);
        ksession.setGlobal( "choice7",choice7);
        ksession.setGlobal( "choice8",choice8);
        ksession.setGlobal( "choice9",choice9);
        ksession.setGlobal( "choice10",choice10);
        ksession.setGlobal( "choice11",choice11);
        ksession.setGlobal( "choice12",choice12);
        ksession.setGlobal( "question",question);
        ksession.setGlobal( "nextButton",nextButton);
        ksession.setGlobal( "togglegroup",choices);
        ksession.setGlobal( "wynik",wynik);

        ksession.fireAllRules();


    }
}

