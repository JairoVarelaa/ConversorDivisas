
package conversor.controlador;

import conversor.modelo.Banderas;
import conversor.modelo.Monedas;
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
    
    public ImageIcon GetIconoMoneda(int indice){
        //System.out.println("clase controller : valor indice : " + indice);
        //System.out.println("valor del metodo GetIcono" + this.iconos.GetIcono(indice));
        return this.iconos.GetIcono(indice);
    }
    
}
