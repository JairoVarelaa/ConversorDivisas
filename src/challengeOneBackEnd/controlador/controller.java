
package challengeOneBackEnd.controlador;

import challengeOneBackEnd.modelo.Banderas;
import challengeOneBackEnd.modelo.Monedas;
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
    public double CambioDeDivisa(double valor , String opcion ){
        
        switch(opcion){
            case "dolar":
                    valor *= monedas.GetMoneda(opcion);
                break;
            case "euro":
                    valor *= monedas.GetMoneda(opcion);
                break;
            case "libraEsterlina":
                    valor *= monedas.GetMoneda(opcion);
                break;
            case "won":
                    valor *= monedas.GetMoneda(opcion);
                break;
            case "yen":
                    valor *= monedas.GetMoneda(opcion);
                break;
            default:
                break;
        }
        return valor;
    }
    /**
     * 
     * @param moneda
     * @return 
     */
    public ImageIcon CambioIcono(String moneda){
        return iconos.GetIcono(moneda);
    }
    
    
}
