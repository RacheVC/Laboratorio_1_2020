/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio1.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author andre
 */

public class AuthenticationResponse {
    private String jwt;
 private UsuarioDTO usuario;
// private List<PermisoOtorgadoDTO> permisos;

    public AuthenticationResponse(String jwt, UsuarioDTO usuario) {
        this.jwt = jwt;
        this.usuario = usuario;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
    
}
