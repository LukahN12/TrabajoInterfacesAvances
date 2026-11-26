import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class DatosReserva extends JPanel implements FocusListener {

    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JLabel fechaEntrada;
    private JLabel fechaSalida;
    private JLabel nochesEstancia;
    private JLabel tipoHabitacion;
    private JLabel cantidadHabitaciones;
    private JLabel crios;
    private JLabel extraCrios;
    private JLabel imagenes;
    private JLabel importeTotal;

    private JSpinner fechaEntradaSpinner;
    private JSpinner fechaSalidaSpinner;
    private JSpinner nochesEstanciaSpinner;
    private JComboBox<String> tipoHabitacionBox;
    private JSpinner cantidadHabitacionesSpinner;
    private JToggleButton botonCrios;
    private ExtraCrios extraCriosPanel;
    private JTextField telefonoField;

    public DatosReserva(){

    }

    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
