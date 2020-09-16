/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio1.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.una.laboratorio1.App;
import org.una.laboratorio1.dto.DepartamentoDTO;
import org.una.service.DepartamentoService;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class DetalleInfoDepartamentoController implements Initializable {

    @FXML
    private TextField txtId;
    @FXML
    private TextField txtNombre;
    @FXML
    private ComboBox<?> cbxEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ActionBtnCancelar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("InformacionDepartamentos.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void ActionBtnGuardar(ActionEvent event) throws InterruptedException, ExecutionException, IOException {
        DepartamentoDTO depadto = new DepartamentoDTO();
        
        depadto.setEstado(true);
        depadto.setFechaModificacion(new Date());
        depadto.setFechaRegistro(new Date());
        depadto.setNombre("Informatica");
        
        DepartamentoService.getInstance().add(depadto);
    }
    
}
