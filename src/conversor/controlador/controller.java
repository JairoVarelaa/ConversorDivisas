
package conversor.controlador;

import conversor.modelo.Banderas;
import conversor.modelo.Divisas;
import conversor.modelo.Monedas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class controller {
    
    Monedas monedas = new Monedas();
    Banderas iconos = new Banderas();
    Divisas divisas = new Divisas();
    /**
     * Metodo que realiza el calculo de la moneda que desea el usuario
     * @param cantidad Cantidad ingresada por el usuario atraves de JtextField
     * @param indice_De Indice del componente JcomboBox_1
     * @param indice_A Indice del componente JcomboBox_1
     * @return Retorna el valor convertido y formateado
     */
    public String CambioDeDivisa(double cantidad ,int indice_De, int indice_A ){
       Hashtable<Integer, Double> moneda = monedas.getDolar();

       double valor_dolares = cantidad/moneda.get(indice_De);
       double resultado = (moneda.get(indice_A) * valor_dolares);
       
       return formatearNumero(resultado);
    }
    /**
     * Metodo para formatear un numero elevado a la X potencia.
     * @param numero Parámetro que recibe el número a formatear
     * @return retorna el valor ya formateado
     */
    public String formatearNumero(double numero){
     
        DecimalFormat decimalFormat = new DecimalFormat("#.############"); // Define el formato
        String numero_formateado = decimalFormat.format(numero);
        
        return numero_formateado;
    }
    /**
     * Metodo para validar cada valor tecleado por el usuario y permitir o no su uso
     * Solo permite ingresar valores numericos con el metodo isDigit().
     * @param t representa el componente jTextField 
     */
    public void ValidarJTextField (JTextField t){
        t.addKeyListener(new KeyAdapter (){
            @Override
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
                if (c == '.' && t.getText().contains(".")) {
                    e.consume();
                }
            }   
        });
    }
    
    public String ModificarLabels(int indice){
        return divisas.GetDivisa(indice);
    }
    
    /**
     * Metodo para obtener un solo icono de la clase modelo
     * @param indice Envia el índice al modelo para obtener un icono específico
     * @return retorna el icono de la clase modelo 
     */
    public ImageIcon GetIconoMoneda(int indice){
       
        return this.iconos.GetIcono(indice);
    }
    
}
