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
public class ConexionSqlServer implements MyConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    
    
    public ConexionSqlServer(){
    
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contraseña= "123";
                
    }
    
    
    @Override
    public void Conectar() {
        System.out.println("Se conecto a SQL SERVER");
    }

    @Override
    public void Desconectar() {
        System.out.println("Se Desconecto de SQL SERVER");
    }
    
}
