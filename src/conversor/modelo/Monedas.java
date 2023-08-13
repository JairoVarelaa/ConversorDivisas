
package conversor.modelo;


import java.util.Hashtable;


public class Monedas {
    Hashtable<String, Double> monedasDeCambio = new Hashtable<>();
    
    public Monedas(){
    monedasDeCambio.put("dolar", 0.00025);
    monedasDeCambio.put("euro", 0.00023);
    monedasDeCambio.put("libraEsterlina", 0.00020);
    monedasDeCambio.put("won", 0.33);
    monedasDeCambio.put("yen", 0.036);
    }
    public Hashtable GetAllMonedas(){
        return this.monedasDeCambio;
    }
    public Double GetMoneda(String nombreMoneda){
        
        return this.monedasDeCambio.get(nombreMoneda);
    }
    
    
}
