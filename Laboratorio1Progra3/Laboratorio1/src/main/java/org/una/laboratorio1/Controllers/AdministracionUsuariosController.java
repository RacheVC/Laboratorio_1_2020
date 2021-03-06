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
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.una.laboratorio1.App;
import org.una.laboratorio1.dto.UsuarioDTO;
import org.una.service.UsuarioService;

/**
 * FXML Controller class
 *
 * @author Luis
 */
public class AdministracionUsuariosController implements Initializable {

    @FXML
    private TextField txtBuscar;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void ActionBtnCerrar1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("Dashboard.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

    @FXML
    private void ActionBtnCerrar2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(App.class.getResource("Dashboard.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
    }

//      private void CargarDatosTableMuseos() {
//        this.JpaSala = new SalasJpaController();
//        this.ListSala = JpaSala.getSalas();
//        this.colNombre.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getNombre()));
//        this.colDescripcion.setCellValueFactory(value -> new SimpleStringProperty(value.getValue().getDescripcion()));      
//        this.TableSala.setItems(FXCollections.observableArrayList(this.ListSala));
//    }
//
//    public void FiltrarInformacion(String nombre) {
//        this.salaFiltrada = new Salas();
//        this.CargarDatosTableMuseos();
//        this.InfoSalaFiltrado = this.JpaSala.findSalasFilter(nombre);
//        this.TableSala.setItems(FXCollections.observableArrayList(this.InfoSalaFiltrado));
//   
//
//    }
    @FXML
    private void Buscar(ActionEvent event) throws IOException {
        UsuarioDTO cedula = new UsuarioDTO();
         cedula.setCedula(txtBuscar.getText());       
        System.out.println(UsuarioService.getInstance().finByCedula(cedula.getCedula()));
    }

}
