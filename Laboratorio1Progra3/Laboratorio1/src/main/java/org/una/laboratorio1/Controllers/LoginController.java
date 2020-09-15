/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio1.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.una.laboratorio1.App;
import org.una.laboratorio1.dto.AuthenticationRequest;
import org.una.laboratorio1.dto.UsuarioDTO;
import org.una.service.UsuarioService;

/**
 * FXML Controller class
 *
 * @author andre
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtCedula;
    @FXML
    private Button btnIniciar;
    @FXML
    private PasswordField txtfPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Ingresar(ActionEvent event) throws IOException, InterruptedException, ExecutionException {
        
//       UsuarioDTO udto = new UsuarioDTO() ;
//       udto.setCedula("fsd");
//      
//       udto.setEstado(true);
//       udto.setFechaModificacion(new Date(0));
//       udto.setFechaRegistro(new Date(0) );
//     
//       udto.setDepartamentoId(Long.MIN_VALUE);
//       udto.setNombreCompleto("Carlos");
//       
//       UsuarioService.getInstance().add(udto);
        
        
//        
       
        try {
        
            AuthenticationRequest aure = new AuthenticationRequest(txtCedula.getText(),txtfPassword.getText());
        UsuarioService.getInstance().Login(aure);
        
        Parent root = FXMLLoader.load(App.class.getResource("Dashboard.fxml"));
        Scene creacionDocs = new Scene(root);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(creacionDocs);
        window.show();
            
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "", ButtonType.OK);
                alert.setTitle("Mensaje");
                alert.setHeaderText("Usuario no autenticado.");
                alert.show();
        }
        
        
        System.out.println(UsuarioService.getInstance().finByNombre("Usuario Admin"));
//        
//        if(UsuarioService.getInstance().getAll().equals())
        
    }
    
    
    
}
