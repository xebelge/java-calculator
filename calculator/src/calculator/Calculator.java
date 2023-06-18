/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package calculator;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author DERYA
 */
public class Calculator extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        /*public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("loancalculator.fxml"));
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            stage.show();
        
        } catch (IOException ex) {
            Logger.getLogger(LoanCalcMain.class.getName()).log(Level.SEVERE, null, ex);*/
                    
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
       
      
        stage.setScene(scene);
        stage.show();
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
