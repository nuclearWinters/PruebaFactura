/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.factura;

/**
 *
 * @author Armando
 */
public class Factura {
    private String descripcion;
    private String numero;
    private double precio;
    private int cantidad;
    public Factura() {}
    public String getDescripcion () { return descripcion; } 
    public String getNumero () { return numero; } 
    public double getPrecio () { return precio; } 
    public int getCantidad () { return cantidad; } 
    //método para asignar nombre pais en el objeto Pais.
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio){
        if (precio <= 0) {
            this.precio = 0.0;
        } else {
            this.precio = precio;
        }
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public void obtenerMontoFactura(){
        if (this.cantidad * this.precio <= 0) {
            System.out.println("La facutura es de: 0.0");
        } else {
            System.out.println("La facutura es de: " + this.cantidad * this.precio);
        }
    }
    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.setNumero("HT8438GH");
        factura.setCantidad(-2);
        factura.setPrecio(-435.50);
        factura.setDescripcion("Este producto sirve para instalar redes electricas");
        factura.obtenerMontoFactura();
    }
}
