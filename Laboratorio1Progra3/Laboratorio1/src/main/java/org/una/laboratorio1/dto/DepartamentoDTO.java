/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio1.dto;

import java.util.Date;

/**
 *
 * @author andre
 */
public class DepartamentoDTO {
    private Long id; 
    private String nombre; 
    private boolean estado; 
    private Date fechaRegistro; 
    private Date fechaModificacion;

    public DepartamentoDTO() {
    }

    public DepartamentoDTO(Long id, String nombre, boolean estado, Date fechaRegistro, Date fechaModificacion) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
