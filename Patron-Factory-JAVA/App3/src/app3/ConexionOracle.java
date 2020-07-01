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
public class ConexionOracle implements MyConexion{
    
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    
    
    public ConexionOracle(){
    
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contraseña= "123";
                
    }
    
    
    
    
    

    @Override
    public void Conectar() {
        System.out.println("Se conecto a Oracle");
    }

    @Override
    public void Desconectar() {
        System.out.println("Se desconecto a Oracle");
    }
    
}
