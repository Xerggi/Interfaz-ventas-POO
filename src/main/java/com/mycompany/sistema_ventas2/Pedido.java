/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_ventas2;

import java.util.ArrayList;

/**
 *
 * @author xergg
 */
public class Pedido {
    private ArrayList<Producto> listaProductosInterna;
    private String codigo;
    

    public Pedido(String codigo) {
        this.codigo = codigo;
         this.listaProductosInterna = new ArrayList<>(); 
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
     public ArrayList<Producto> getListaProductos() {
        return listaProductosInterna;
    }
    
    //Método para agregar producto
    public void agregarProducto(String nombre, int cantidad,double precio, int stock){
        Producto pro= new Producto(nombre,cantidad,precio,stock);
        pro.actualizarStock(cantidad);
        listaProductosInterna.add(pro);
    }
    
    public double TotalPagar() {
        double total = 0;
        for (Producto pro : listaProductosInterna) {
            total += pro.getPrecio() * pro.getCantidad(); 
        }
        return total;
    }
    
} 
    
    

