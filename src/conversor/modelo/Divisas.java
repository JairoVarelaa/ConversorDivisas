
package conversor.modelo;

import java.util.Hashtable;

/**
 *
 * @author JairoV
 */
public class Divisas {
    private final Hashtable<Integer, String> Divisas = new Hashtable<>();
    /**
     * Constructor
     */        
    public  Divisas(){
        this.Divisas.put(0, "$ USD - Dolares");
        this.Divisas.put(1, "€ EUR - Euros");
        this.Divisas.put(2, "£ GBP - Libras Esterlinas");
        this.Divisas.put(3, "₩ KRW - Won SurCoreano");
        this.Divisas.put(4, "¥ JPY - Yen Japones");
        this.Divisas.put(5, "$COP - Pesos Colombianos");
    }
    /**
     * Metogo para obtener toda las Hashtable
     * @return Devuelve toda la Hashtable
     */
    public Hashtable<Integer, String> getDivisas() {
        return Divisas;
    }
    /**
     * Metodo para obtener solo 1 valor de la Hahstable apartir de una llave.
     * @param key clave para traer un valor de la Hashtable.
     * @return Retorna solo 1 valor de la Hashtable.
     */
    public String GetDivisa(int key){
        return this.Divisas.get(key);
    }        
}
