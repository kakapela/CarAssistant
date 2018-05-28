package com.drools;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/layouts/mainView.fxml"));

        primaryStage.setTitle("Car Expert System");
        Scene scene = new Scene(root, 300, 275);
        primaryStage.setScene(scene);

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}