/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.*;


/**
 *
 * @author dell
 */
public class vuelo extends Observado{
    public vuelo(){};
 
    private String codigoDestino;
    private List<viajero> viajeros;
    private String ultimoSuceso;
    
    public vuelo(String codigoDestino) {
        super();
        this.codigoDestino = codigoDestino;
        viajeros = new ArrayList<viajero>();
        ultimoSuceso = "";
    }
    
    public String getUltimoSuceso() {
    return codigoDestino + ":" + ultimoSuceso;
}

public void setUltimoSuceso(String ultimoSuceso) {
    this.ultimoSuceso = ultimoSuceso;
    notificarObservadores();
}

}
