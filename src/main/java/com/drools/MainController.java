package com.drools;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class MainController {

    @FXML
    private JFXButton nextButton;
    private KieServices ks;
    private KieContainer kc;

    @FXML
    public void next(MouseEvent event) {
        ks = KieServices.Factory.get();
        kc = ks.getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("ksession-rules");
        ksession.fireAllRules();
    }
}

