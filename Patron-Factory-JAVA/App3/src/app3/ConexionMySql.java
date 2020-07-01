
package app3;

public class ConexionMySql implements MyConexion{
    
    
    private String host;
    private String puerto;
    private String usuario;
    private String contraseña;
    
    
    
    public ConexionMySql(){
    
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contraseña= "123";
                
    }

    @Override
    public void Conectar() {
        System.out.println("Se conecto a MySql");  
    }

    @Override
    public void Desconectar() {
        System.out.println("Se conecto a MySql");
    }
    
}
