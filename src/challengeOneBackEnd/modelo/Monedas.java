
package challengeOneBackEnd.modelo;


import java.util.Hashtable;


public class Monedas {
    Hashtable<String, Double> monedaRespectoPesoColombiano = new Hashtable<>();
    
    public Monedas(){
    monedaRespectoPesoColombiano.put("dolar", 0.00025);
    monedaRespectoPesoColombiano.put("euro", 0.00023);
    monedaRespectoPesoColombiano.put("libraEsterlina", 0.00020);
    monedaRespectoPesoColombiano.put("won", 0.33);
    monedaRespectoPesoColombiano.put("yen", 0.036);
    }
    public Hashtable GetMonedas(){
        return this.monedaRespectoPesoColombiano;
    }
    
    
    
}
