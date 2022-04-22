/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.f_g03_poo_ejercicio_01_03;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Cliente {
    
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    
    public boolean esCedulaValida(){
        
        if(cedula.length() == 10){
            return true;
    }else{
        return false;
    }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
}
