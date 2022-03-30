package com.example.javafx.homework_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SummationApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    //AnchorPane root= FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("fxml/Summation.fxml")));
    //SummationController controller = new SummationController();
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("summation-view.fxml"));
    //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
    Scene scene = new Scene(fxmlLoader.load());
    //fxmlLoader.setRoot(root);
    //fxmlLoader.setController(controller);
    //fxmlLoader.load();
    stage.setTitle("Basic calculator which executes only summation!");
    stage.setScene(scene);
    stage.show();

  }

  public static void main(String[] args) {
    launch();
  }
}