
package app2;


public class Conexion {
    
    public static Conexion instancia;
    
    private Conexion(){
    }
    
    public static Conexion getInstacia(){
    if(instancia == null){
    instancia = new Conexion();
    
    }
    
    return instancia;
    
    }
    
    public void conectar(){
    
        System.out.println("---Se conecto a la base de Datos---");
    }
    
    public void Desconectar(){
    
        System.out.print("---Se desconecto a la base de Datos---");
    }
    
    
}
