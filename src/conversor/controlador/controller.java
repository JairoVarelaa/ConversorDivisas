
package conversor.controlador;

import conversor.modelo.Banderas;
import conversor.modelo.Monedas;
import java.text.DecimalFormat;
import java.util.Hashtable;
import javax.swing.ImageIcon;

public class controller {
    
    Monedas monedas = new Monedas();
    Banderas iconos = new Banderas();
     /**
      * 
      * @param cantidad
      * @param indice_A
      * @return 
      */ 
    public void CambioDeDivisa(double cantidad ,int indice_De, int indice_A ){
        Hashtable<Integer, Double> moneda = monedas.getDolar();
        
         
        double valor_dolares = cantidad/moneda.get(indice_De);
       double resultado = (moneda.get(indice_A) * valor_dolares);
        
        System.out.println("El resultado es: "+ formatearNumero(resultado));
       
        //return resultado;
    }
    public String formatearNumero(double numero){
     
        DecimalFormat decimalFormat = new DecimalFormat("#.############"); // Define el formato
        String numero_formateado = decimalFormat.format(numero);
        
        return numero_formateado;
    }
    public ImageIcon GetIconoMoneda(int indice){
        //System.out.println("clase controller : valor indice : " + indice);
        //System.out.println("valor del metodo GetIcono" + this.iconos.GetIcono(indice));
        return this.iconos.GetIcono(indice);
    }
    
}
