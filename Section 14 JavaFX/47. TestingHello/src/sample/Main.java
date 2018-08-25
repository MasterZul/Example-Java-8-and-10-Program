package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;


import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello Zul");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//        Label greeting = new Label("Welcome to MasterZul World");
//        greeting.setTextFill(Color.GREEN);
//        root.getChildren().add(greeting);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));


    }


    public static void main(String[] args) {
        launch(args);
    }
}
