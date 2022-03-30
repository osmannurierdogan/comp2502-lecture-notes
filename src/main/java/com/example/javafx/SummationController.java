package com.example.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SummationController {

  @FXML
  private Button add;

  @FXML
  private TextField number1;

  @FXML
  private TextField number2;

  @FXML
  private Label result;


  @FXML
  void calculate(MouseEvent event) {
    int n1 = Integer.parseInt(number1.getText());
    int n2 = Integer.parseInt(number2.getText());
    int sum = n1 + n2;
    result.setText(String.valueOf(sum));
  }
}