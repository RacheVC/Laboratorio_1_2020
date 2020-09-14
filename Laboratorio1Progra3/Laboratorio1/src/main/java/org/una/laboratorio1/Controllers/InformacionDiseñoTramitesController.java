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
import javafx.stage.Stage;
import org.una.laboratorio1.App;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class InformacionDiseñoTramitesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionBtnCerrar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("Dashboard.fxml"));
        Scene creacionDocs = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionAgregarVariaciones(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("DetalleInfoVariaciones.fxml"));
        Scene creacionDocs = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionAgregarRequisitos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("DetalleInfoRequisitos.fxml"));
        Scene creacionDocs = new Scene(root);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void actionBtnGuardar(ActionEvent event) {
    }
    
}
