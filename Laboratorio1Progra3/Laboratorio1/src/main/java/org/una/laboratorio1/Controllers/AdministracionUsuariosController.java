/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio1.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class AdministracionUsuariosController implements Initializable {

    @FXML
    private Button btnBuscarInformacion;
    @FXML
    private TableView<?> tviewInformacion;
    @FXML
    private Button btnCerrar;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnBuscarAutorizaciones;
    @FXML
    private TableView<?> tviewAutorizaciones;
    @FXML
    private Label lblUsuario;
    @FXML
    private Label lblCedula;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnGuardar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
