
package app2;


public class App2 {

    public static void main(String[] args) {
        
        Conexion c = Conexion.getInstacia();
        c.conectar();
        c.Desconectar();
        
        
    }
    
}
