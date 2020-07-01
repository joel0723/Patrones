
package app3;


public class App3 {

   
    public static void main(String[] args) {
       
        Fabrica fabrica = new Fabrica();
        
        
        MyConexion C1 = fabrica.getConexion("SQL SERVER");
        C1.Conectar();
        C1.Desconectar();
        
        MyConexion C2 = fabrica.getConexion("ORACLE");
        C2.Conectar();
        C2.Desconectar();
        
        MyConexion C3 = fabrica.getConexion("MYSQL");
        C3.Conectar();
        C3.Desconectar();
        
        MyConexion C4 = fabrica.getConexion("MARIA BD");
        C4.Conectar();
        C4.Desconectar();
        
        
        
    }
    
}
