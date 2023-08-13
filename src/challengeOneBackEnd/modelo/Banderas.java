
package challengeOneBackEnd.modelo;


import java.util.Hashtable;
import javax.swing.ImageIcon;

public class Banderas {
   
    Hashtable<Integer, ImageIcon> IconoBandera = new Hashtable<>();
    
    void Banderas(){
        IconoBandera.put(0,new ImageIcon(Banderas.class.getResource("img/Dolar.png")));
        IconoBandera.put(1,new ImageIcon(Banderas.class.getResource("img/Euros.png")));
        IconoBandera.put(2,new ImageIcon(Banderas.class.getResource("img/LibraEsterlina.png")));
        IconoBandera.put(3,new ImageIcon(Banderas.class.getResource("img/YenJapones.png")));
        IconoBandera.put(4,new ImageIcon(Banderas.class.getResource("img/WonKoreano.png")));
        IconoBandera.put(5,new ImageIcon(Banderas.class.getResource("img/PesoColombiano.png")));
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
     * @param indice recibe el indice del combobox para consultar en la Hashtable
     * @return El valor de la llave (key).
     */
    public ImageIcon GetIcono(int indice){
        
        return this.IconoBandera.get(indice);
    }
    
    
}
