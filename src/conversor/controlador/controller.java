
package conversor.controlador;

import conversor.modelo.Banderas;
import conversor.modelo.Monedas;
import java.util.Hashtable;
import javax.swing.ImageIcon;

public class controller {
    
    Monedas monedas = new Monedas();
    Banderas iconos = new Banderas();
     /**
      * 
      * @param valor
      * @param opcion
      * @return 
      */ 
    public double CambioDeDivisa(double cantidad , int indice_De, int indice_A ){
        Hashtable<Integer, Double> dolar = monedas.getDolar();
        
       
        return cantidad;
    }
    
    public ImageIcon GetIconoMoneda(int indice){
        //System.out.println("clase controller : valor indice : " + indice);
        //System.out.println("valor del metodo GetIcono" + this.iconos.GetIcono(indice));
        return this.iconos.GetIcono(indice);
    }
    
}
