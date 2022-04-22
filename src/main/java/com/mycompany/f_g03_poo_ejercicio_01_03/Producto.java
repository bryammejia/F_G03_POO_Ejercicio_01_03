/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.f_g03_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
public class Producto {
    String nombreProducto;
    long codigoBarras;
    double precio;
    
    public String esCostoso(int costoMaximo){
        var retorno = "IBD";
        if(this.precio > costoMaximo){
            retorno = " es costoso";
        }else{
            if(this.precio < costoMaximo)
            retorno = " No es costoso";
        }
        return retorno;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
    
    
}
