/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idetec;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author edson
 */
public class IDETec extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setResources(ResourceBundle.getBundle("bundle.Idioma"));
        Parent root = loader.load(this.getClass().getResource("iniciarSesionGUI.fxml").openStream());
        
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle(ResourceBundle.getBundle("bundle/Idioma").getString("tIniciarSesion"));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
