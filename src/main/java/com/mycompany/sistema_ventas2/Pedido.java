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
    private ArrayList<Producto> listaProductosInterna = new ArrayList<Producto>();
    private String codigo;
    

    public Pedido(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //Método para agregar producto
    public void agregarProducto(String nombre, int cantidad, int stock){
        Producto pro= new Producto(nombre,cantidad,stock);
        pro.actualizarStock(cantidad);
        listaProductosInterna.add(pro);
        
    }
    
    public void agregarCliente(String nombre,String dni,String telefono,String direccion){
        Cliente c = new Cliente(nombre,dni,telefono,direccion);
        //listaClientes.add(c);
    }
    
    //Método para mostrar productos
    public void mostrarPedido(){
        
        //for(Cliente c:listaClientes){
            //System.out.println("Cliente: " + c.getNombre());
            //System.out.println("Su pedido es el siguiente: ");
        }
        
        int i = 0;
        
        //for(Producto p : listaProductos){
           // System.out.println("Producto[" + i + "]");
            //System.out.println("\tId: " + p.getId());
            //System.out.println("\tNombre: " + p.getNombre());
            //System.out.println("\tStock Actual: " + p.getStock());
            //i++;
        }
   //}
    
    
    
//}
