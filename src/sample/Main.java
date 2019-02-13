package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        primaryStage.setTitle("Password Generator Nano");
        primaryStage.setScene(new Scene(root, 300, 500));
        primaryStage.show();

        


    }


        //System.out.println("Welcome To Password-Generator. Your app to savely generate Passwords.");
        //System.out.println("Please enter your specifications.");
        //System.out.println("Number of characters:");
        //System.out.println("Include numbers? (Yes/No)");
        //System.out.println("Include letters? (Yes/No)");


    public static void main(String[] args) {
        launch(args);
    }
}
