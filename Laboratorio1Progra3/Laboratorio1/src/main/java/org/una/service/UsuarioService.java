/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.una.laboratorio1.dto.AuthenticationRequest;

import org.una.laboratorio1.utils.ConnectionUtils;
import org.una.laboratorio1.dto.UsuarioDTO;

/**
 *
 * @author andre
 */
public class UsuarioService {
    

    private final String urlstring = "http://localhost:8099/usuarios/";
    private final String urlstringLogin = "http://localhost:8099/usuarios/login";
    private final String urlstringNombre = "http://localhost:8099/usuarios/nombre/Usuario%20Admin";

    
    private UsuarioService() {
    }

    public List<UsuarioDTO> getAll() throws InterruptedException, ExecutionException, IOException {
        return ConnectionUtils.ListFromConnection(urlstring, UsuarioDTO.class);
    }

    public void add(UsuarioDTO object) throws InterruptedException, ExecutionException, IOException {
        ConnectionUtils.ObjectToConnection(urlstring, object);
    }

    public List<UsuarioDTO> getUserById(Long id) throws IOException {
        return ConnectionUtils.ListFromConnection(urlstring, UsuarioDTO.class);
    }

    public List<UsuarioDTO> finByNombre(String Nombre) throws IOException {
        return ConnectionUtils.ConnectionToObjectByField(urlstringNombre, Nombre);
    }

    public void Login(AuthenticationRequest object) throws InterruptedException, ExecutionException, IOException {
        ConnectionUtils.ObjectToConnectionLogin(urlstringLogin, object);

    }

    public static UsuarioService getInstance() {
        return UsuarioServiceHolder.INSTANCE;
    }

    private static class UsuarioServiceHolder {

        private static final UsuarioService INSTANCE = new UsuarioService();
    }
}
