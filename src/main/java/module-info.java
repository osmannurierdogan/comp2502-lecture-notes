module com.example.javafx {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.javafx.homework_1 to javafx.fxml;
  exports com.example.javafx.homework_1;
  //exports com.example.javafx.homework_1;
  //opens com.example.javafx.homework_1 to javafx.fxml;
}