package com.drools;

import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.Optional;

public class MainController {

    public Label result;
    private KieServices ks;
    private KieContainer kc;
    public MainController() {
        ks = KieServices.Factory.get();
        kc = ks.getKieClasspathContainer();
    }

    public void start(ActionEvent actionEvent) {
        KieSession ksession = kc.newKieSession("RomanticKS");
        ksession.setGlobal( "result",
                this.result );
        ksession.fireAllRules();
    }
}

