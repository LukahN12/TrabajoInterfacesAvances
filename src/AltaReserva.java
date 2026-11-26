import javax.swing.*;
import java.awt.*;

public class AltaReserva extends JDialog {

    private GridBagLayout layout;
    private GridBagConstraints constraints;
    DatosCliente dc;

    public AltaReserva(){
        this.setTitle("Alta Reservas");
        this.setModal(true);
        this.setMinimumSize(new Dimension(400, 300));
        layout = new GridBagLayout();
        this.setLayout(layout);

        dc = new DatosCliente();

        this.add(dc);

        this.pack();
        this.setVisible(true);
    }
}
