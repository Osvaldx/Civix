package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class primerBotonControlador {
    @FXML
    private Button primerboton;
    
    public void saludar(ActionEvent s){
        System.out.println("Hola");
    }
}
