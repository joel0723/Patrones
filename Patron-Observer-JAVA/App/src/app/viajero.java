/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author dell
 */
public class viajero implements Observador{
    private String nombre;
    private vuelo vuelo;

    public viajero(){};
    
    public viajero(String nombre, vuelo vuelo) {
        super();
        this.nombre = nombre;
        this.vuelo = vuelo;
    
}
    public void notificar() {
    System.out.println(nombre + "<-- Notificar: " +
        vuelo.getUltimoSuceso());
}
    
}