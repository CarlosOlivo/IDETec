package idetec;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class IniciarSesionGUIController implements Initializable{
    
    @FXML public Button bIniciar;
    @FXML public Button bRegistrar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        bIniciar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    FXMLLoader loader = new FXMLLoader();
                    Stage ventana = new Stage();
                    loader.setResources(ResourceBundle.getBundle("bundle.Idioma"));
                    Parent root = loader.load(this.getClass().getResource("abrirProyectoGUI.fxml").openStream());

                    Scene scene = new Scene(root);

                    ventana.setScene(scene);
                    ventana.setResizable(false);
                    ventana.setTitle(ResourceBundle.getBundle("bundle/Idioma").getString("tAbrirProyecto"));
                    ventana.show();
                }catch(Exception e){
                    System.err.println(e);
                }
            }
        });
        
        bRegistrar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    FXMLLoader loader = new FXMLLoader();
                    Stage ventana = new Stage();
                    loader.setResources(ResourceBundle.getBundle("bundle.Idioma"));
                    Parent root = loader.load(this.getClass().getResource("registrarseGUI.fxml").openStream());

                    Scene scene = new Scene(root);

                    ventana.setScene(scene);
                    ventana.setResizable(false);
                    ventana.setTitle(ResourceBundle.getBundle("bundle/Idioma").getString("tRegistrarse"));
                    ventana.show();
                }catch(Exception e){
                    System.err.println(e);
                }
            }
        });
    }
}
