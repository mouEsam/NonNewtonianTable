package com.flowapp.NonNewtonianTable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        showMainWindow(primaryStage);
    }

    private void showMainWindow(Stage primaryStage) throws java.io.IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Views/MainWindow.fxml")));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}