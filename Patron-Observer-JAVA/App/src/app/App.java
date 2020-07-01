
package app;


public class App {

  
    public static void main(String[] args) {
        
        
vuelo vuelo = new vuelo("DR474-Destino Santo Domingo");
viajero Joel = new viajero("Joel", vuelo);
vuelo.suscribirObservador(Joel);
viajero Juan = new viajero("Juan", vuelo);
vuelo.suscribirObservador(Juan);
vuelo.setUltimoSuceso("Llegada del vuelo.");
vuelo.eliminarObservador(Juan);
vuelo.setUltimoSuceso("Salida de viajeros");
    }
    
}
