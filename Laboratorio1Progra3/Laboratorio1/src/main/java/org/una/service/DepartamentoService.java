/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.service;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import org.una.laboratorio1.dto.DepartamentoDTO;
import org.una.laboratorio1.dto.PermisoDTO;
import org.una.laboratorio1.utils.ConnectionUtils;

/**
 *
 * @author andre
 */
public class DepartamentoService {
    private final String urlstring = "http://localhost:8099/departamentos/";
    
    public void add(DepartamentoDTO object) throws InterruptedException, ExecutionException, IOException {
        ConnectionUtils.ObjectToConnection(urlstring, object);
    }
    
    public static DepartamentoService getInstance() {
        return DepartamentoServiceHolder.INSTANCE;
    }

    private static class DepartamentoServiceHolder {

        private static final DepartamentoService INSTANCE = new DepartamentoService();
    }
}
