
package challengeOneBackEnd.modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Banderas {
    List<ImageIcon> iconosBanderas = new ArrayList<>();
    
    public void Banderas(){
        iconosBanderas.add(new ImageIcon(Banderas.class.getResource("img/Dolar.png")));
        iconosBanderas.add(new ImageIcon(Banderas.class.getResource("img/Euros.png")));
        iconosBanderas.add(new ImageIcon(Banderas.class.getResource("img/LibraEsterlina.png")));
        iconosBanderas.add(new ImageIcon(Banderas.class.getResource("img/YenJapones.png")));
        iconosBanderas.add(new ImageIcon(Banderas.class.getResource("img/WonKoreano.png")));
        iconosBanderas.add(new ImageIcon(Banderas.class.getResource("img/PesoColombiano.png")));
    }
    public List GetBanderas(){
        return this.iconosBanderas;
    }
    
    
}
