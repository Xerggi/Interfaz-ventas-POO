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
public class Factura {
    
    private int numero;
    private Pedido pedido;
    private double total;
    private ArrayList <DetalleVenta> listaventa = new ArrayList<DetalleVenta>();

    public Factura() {
    }

    
    public Factura(int numero, Pedido pedido, double total) {
        this.numero = numero;
        this.pedido = pedido;
        this.total = total;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<DetalleVenta> getListaventa() {
        return listaventa;
    }

    public void setListaventa(ArrayList<DetalleVenta> listaventa) {
        this.listaventa = listaventa;
    }
    
    
    
}
