/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_ventas2;

/**
 *
 * @author xergg
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private String puesto;

    public Empleado(String nombre, String apellido, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
    }

    public String getNomvre() {
        return nombre;
    }

    public void setNomvre(String nomvre) {
        this.nombre = nomvre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    
}
