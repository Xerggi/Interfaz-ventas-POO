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
    
    private Pedido pedido;
    private Cliente cliente;
    private double totalSinIGV;
    private double totalConIGV;
    private static final double IGV = 0.18;

    public Factura(Pedido pedido,Cliente cliente) {
        this.pedido = pedido;
        this.cliente=cliente;
        calcularTotales();
    }

    private void calcularTotales() {
        totalSinIGV = 0;
        for (Producto producto : pedido.getListaProductos()) {
            totalSinIGV += producto.getPrecio() * producto.getCantidad();
        }
        totalConIGV = totalSinIGV * (1 + IGV);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
    public double getTotalSinIGV() {
        return totalSinIGV;
    }

    public double getTotalConIGV() {
        return totalConIGV;
    }
}
    

