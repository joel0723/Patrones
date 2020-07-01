/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app3;

/**
 *
 * @author dell
 */
public class ConexionLibre implements MyConexion{

    @Override
    public void Conectar() {
        System.out.println("No se especifico el tipo de base de datos");    
    }

    @Override
    public void Desconectar() {
             System.out.println("No se especifico el tipo de base de datos");   
    }
    
}
