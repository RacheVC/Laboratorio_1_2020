/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.service;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.una.laboratorio1.dto.PermisoDTO;
import org.una.laboratorio1.utils.ConnectionUtils;

/**
 *
 * @author rache
 */
public class PermisoService {
    PermisoDTO permiso = new PermisoDTO();
    private final String urlstring = "http://localhost:8099/permisos/";
//    private final String urlstringCodigo = "http://localhost:8099/permisos/";

    private PermisoService() {
    }

    public List<PermisoDTO> getAll() throws InterruptedException, ExecutionException, IOException {
        return ConnectionUtils.ListFromConnection(urlstring, PermisoDTO.class);
    }

    public void add(PermisoDTO object) throws InterruptedException, ExecutionException, IOException {
        ConnectionUtils.ObjectToConnection(urlstring, object);
    }

    public static PermisoService getInstance() {
        return PermisoServiceHolder.INSTANCE;
    }

    private static class PermisoServiceHolder {

        private static final PermisoService INSTANCE = new PermisoService();
    }

//    public List<PermisoDTO> finByCodigo(String Codigo) throws IOException {
            String codigo = permiso.getCodigo();
//        return ConnectionUtils.ConnectionToObjectByCedula(urlstringCedula, codigo);
//    }
}
