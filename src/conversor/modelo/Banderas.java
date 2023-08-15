
package conversor.modelo;


import java.util.Hashtable;
import javax.swing.ImageIcon;

public class Banderas {
   
    Hashtable<Integer, ImageIcon> IconoBandera = new Hashtable<>();
    
    public Banderas(){
        IconoBandera.put(0,new javax.swing.ImageIcon("src/Assets/img/Dolar.png"));
        IconoBandera.put(1,new javax.swing.ImageIcon("src/Assets/img/Euros.png"));
        IconoBandera.put(2,new javax.swing.ImageIcon("src/Assets/img/LibraEsterlina.png"));
        IconoBandera.put(3,new javax.swing.ImageIcon("src/Assets/img/WonKoreano.png"));
        IconoBandera.put(4,new javax.swing.ImageIcon("src/Assets/img/YenJapones.png"));
        IconoBandera.put(5,new javax.swing.ImageIcon("src/Assets/img/PesoColombiano.png"));
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
     * @param indice recibe el indice del combobox para consultar en la Hashtable.
     * @return El valor de la llave (key).
     */
    public ImageIcon GetIcono(int indice){
        return this.IconoBandera.get(indice);
    }
    
    
}
