/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_ventas2;

/**
 *
 * @author xergg
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private int stock;

    public Producto() {
    }
    
    
    public Producto(String nombre, int cantidad, int stock) {
        this.nombre = nombre;
        this.cantidad=cantidad;
        this.stock = stock;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public int actualizarStock(int cantidad){
        return stock -= cantidad;
    }
}
