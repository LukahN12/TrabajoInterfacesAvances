import javax.swing.*;
import java.awt.*;

public class Cabecera extends JPanel {

    private JLabel texto;

    public Cabecera(){
        this.setLayout(null);
        // Tamaños recomendados
        this.setMinimumSize(new Dimension(400, 300));
        texto = new JLabel();
        texto.setText("HOTEL");
        this.add(texto);
    }
}
