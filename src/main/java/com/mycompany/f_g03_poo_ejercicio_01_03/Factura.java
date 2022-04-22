/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.f_g03_poo_ejercicio_01_03;

/**
 *
 * @author USER
 */
public class Factura {
    private double precio;
    private double iva;
    private double totalPagar;
    
    public double totalValorAPagar(){
        var multiplicacion = this.precio * this.iva;
        var suma = multiplicacion + this.precio;
        return suma;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }
    
}
