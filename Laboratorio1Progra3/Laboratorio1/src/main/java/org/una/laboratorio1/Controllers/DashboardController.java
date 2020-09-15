/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio1.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import org.una.laboratorio1.App;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class DashboardController implements Initializable {

    @FXML
    private Label lblNombreUsuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionBtnPermisos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("AdministracionPermisos.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionBtnParametros(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("AdministracionParametros.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionBtnDepartamentos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("InformacionDepartamentos.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionBtnTiposTramites(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("InformacionTiposTramites.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionbtnDisenoTramites(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("InformacionDiseñoTramites.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }  

    @FXML
    private void actionBtnUsuarios(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("AdministracionPermisos.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void OnActionCerrarSesion(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("Login.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
        
    }

  
}
