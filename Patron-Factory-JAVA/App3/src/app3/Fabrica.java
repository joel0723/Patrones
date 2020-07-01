
package app3;


public class Fabrica {
    
    
    public MyConexion getConexion(String motor){
        if(motor == null){
            return new ConexionLibre();
        }
        if(motor.equalsIgnoreCase("SQL SERVER")){
            return new ConexionSqlServer();
        }
        else if(motor.equalsIgnoreCase("ORACLE")){
            return new ConexionOracle();
        }
        else if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySql();
        }
        
        return new ConexionLibre();
    }
    
}
