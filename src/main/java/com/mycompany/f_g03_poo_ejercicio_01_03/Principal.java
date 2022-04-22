/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.f_g03_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
public class Principal {
    public static void main(String[] args) {
        
        var cliente = new Cliente();
        cliente.setNombre("Andres Mejia");
        cliente.setCedula("0106513153");
        cliente.setFechaNacimiento("22/12/2002");
        
        System.out.println("   DATOS CLIENTE   ");
        System.out.println("Nombre: "+cliente.getNombre()+ " Cedula: "
                +cliente.getCedula()+" Fecha Nacimiento: "+cliente.getCedula());
        
        System.out.println("La cedula es valida: "+cliente.esCedulaValida());
        
        var producto = new Producto();
        producto.setNombreProducto("Arroz");
        producto.setCodigoBarras(12356789);
        producto.setPrecio(22.21);
        
        System.out.println("   DATOS PRODUCTOS   ");
        System.out.println("Nombre: "+producto.getNombreProducto()+"|"+
                " Codigo de Barras: "+producto.getCodigoBarras()+"|"+
                " Precio: "+producto.getPrecio());

        System.out.println("El producto: "+producto.esCostoso(100));
        
        var factura = new Factura();
       factura.setPrecio(22.21);
       factura.setIva(0.12);
       factura.getTotalPagar();

        System.out.println("Precio del Producto: "+factura.getPrecio());
        System.out.println("Total Iva: "+factura.getIva());
        System.out.println("El Total a Pagar es de: "+factura.totalValorAPagar());
        System.out.println("-------------------------------------------------------");
        
        
        var cliente2 = new Cliente();
        cliente2.setNombre("Jonathan Coronel");
        cliente2.setCedula("0106513145");
        cliente2.setFechaNacimiento("22/12/1995");
        
        System.out.println("   DATOS CLIENTE 2   ");
        System.out.println("Nombre: "+cliente2.getNombre()+ " Cedula: "
                +cliente2.getCedula()+" Fecha Nacimiento: "+cliente2.getCedula());
        
        System.out.println("La cedula es valida: "+cliente2.esCedulaValida());
       
        
        var producto2 = new Producto();
        producto2.setNombreProducto("Paquete de Coca Cola");
        producto2.setCodigoBarras(1237893);
        producto2.setPrecio(30.00);
        
        System.out.println("   DATOS PRODUCTO 2   ");
        System.out.println("Nombre: "+producto2.getNombreProducto()+"|"+
                " Codigo de Barras: "+producto2.getCodigoBarras()+"|"+
                " Precio: "+producto2.getPrecio());

        System.out.println("El producto: "+producto2.esCostoso(100));
        
       var factura2 = new Factura();
       factura2.setPrecio(30.00);
       factura2.setIva(0.12);
       factura2.getTotalPagar();

        System.out.println("Precio del Producto: "+factura2.getPrecio());
        System.out.println("Total Iva: "+factura2.getIva());
        System.out.println("El Total a Pagar es de: "+factura2.totalValorAPagar());
        
        
    }
   
}
