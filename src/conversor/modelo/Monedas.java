
package conversor.modelo;


import java.util.Hashtable;


public class Monedas {
    private final Hashtable<Integer, Double> dolar;
    /**
     * Metodo Constructor
     * Hashtable que establece todas las monedas respecto al dolar.
     */
    public Monedas(){
    this.dolar = new Hashtable<>();
        dolar.put(0, 1.0);// Dolar.
        dolar.put(1, 0.91701);//Euros.
        dolar.put(2, 0.78720);//Libra Esterlina.
        dolar.put(3, 0.000747803);//won SurCoreano
        dolar.put(4, 145.55730);//yen Japones.
        dolar.put(5, 4094.85);//Peso Colombiano.
    }
    /**
     * metodo getter para obtener la Hashtable de la clase.
     * @return la variable Hashtable dolar.
     */
    public Hashtable<Integer, Double> getDolar() {
        return this.dolar;
    }
  
    
}
