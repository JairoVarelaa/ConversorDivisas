
package challengeOneBackEnd.modelo;


import java.util.Hashtable;
import javax.swing.ImageIcon;

public class Banderas {
   
    Hashtable<String, ImageIcon> IconoBandera = new Hashtable<>();
    
    void Banderas(){
        IconoBandera.put("dolar",new ImageIcon(Banderas.class.getResource("img/Dolar.png")));
        IconoBandera.put("euro",new ImageIcon(Banderas.class.getResource("img/Euros.png")));
        IconoBandera.put("libraEsterlina",new ImageIcon(Banderas.class.getResource("img/LibraEsterlina.png")));
        IconoBandera.put("yen",new ImageIcon(Banderas.class.getResource("img/YenJapones.png")));
        IconoBandera.put("won",new ImageIcon(Banderas.class.getResource("img/WonKoreano.png")));
        IconoBandera.put("pesoColombiano",new ImageIcon(Banderas.class.getResource("img/PesoColombiano.png")));
    }
    /**
     * Metodo Get para obtener todos los iconos a manera de hashtable
     * @return la Hashtable IconoBandera.
     */
    public Hashtable GetBanderas(){
        
        return this.IconoBandera;
    }
    /**
     * Metodo get para obtener solo 1 valor de la Hashtable a partir de la clabe (key) por parametro.
     * @param nombreMoneda recibe el valor a consultar en la Hashtable.
     * @return El valor de la llave (key).
     */
    public ImageIcon GetIcono(String nombreMoneda){
        
        return this.IconoBandera.get(nombreMoneda);
    }
    
    
}
