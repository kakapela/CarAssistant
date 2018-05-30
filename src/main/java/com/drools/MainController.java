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
public void check(MouseEvent event) throws IOException, DroolsParserException {


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // white.setOnAction(e->gowno.setKolor("biały"));
        //brown.setOnAction(e->gowno.setKolor("brazowy"));
        //black.setOnAction(e->gowno.setKolor("czarny"));

    }
}

