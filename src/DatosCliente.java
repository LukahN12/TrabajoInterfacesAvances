import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class DatosCliente extends JPanel implements FocusListener {

    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JLabel nombre;
    private JLabel apellidos;
    private JLabel dni;
    private JLabel telefono;
    private JTextField nombreField;
    private JTextField apellidosField;
    private JTextField dniField;
    private JTextField telefonoField;

    public DatosCliente(){

        inicializadorComponentes();
        agregarComponentes();

        telefonoField.addFocusListener(this);
        dniField.addFocusListener(this);
    }


    private void inicializadorComponentes(){

        layout = new GridBagLayout();
        this.setLayout(layout);

        nombre = new JLabel("Nombre ");
        nombreField = new JTextField(20);
        nombreField.setToolTipText("Introduce tu nombre");

        apellidos = new JLabel("Apellidos ");
        apellidosField = new JTextField();
        apellidosField.setToolTipText("Introduce tus apellidos");

        telefono = new JLabel("Telefono ");
        telefonoField = new JTextField();
        telefonoField.setToolTipText("Introduce tu numero de telefono");

        dni = new JLabel("DNI ");
        dniField = new JTextField();
        dniField.setToolTipText("Introduce tu DNI");
    }

    private void agregarComponentes(){
        Insets insert = new Insets(0, 0, 0, 0);

        constraints = new GridBagConstraints(0, 0,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(nombre, constraints);
        this.add(nombre);

        constraints = new GridBagConstraints(8, 0,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(nombreField, constraints);
        this.add(nombreField);

        constraints = new GridBagConstraints(0, 4,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(apellidos, constraints);
        this.add(apellidos);

        constraints = new GridBagConstraints(8, 4,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(apellidosField, constraints);
        this.add(apellidosField);

        constraints = new GridBagConstraints(0, 8,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(dni, constraints);
        this.add(dni);

        constraints = new GridBagConstraints(8, 8,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(dniField, constraints);
        this.add(dniField);

        constraints = new GridBagConstraints(0, 12,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(telefono, constraints);
        this.add(telefono);

        constraints = new GridBagConstraints(8, 12,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(telefonoField, constraints);
        this.add(telefonoField);
    }


    private boolean verificadorDNI(){
        boolean valido = false;
        if (dniField.getText().matches("[0-9]{8}[A-Z]")){
            valido = true;
        }
        return valido;
    }

    private boolean verificadorTelefono(){
        boolean valido = false;
        if (telefonoField.getText().matches("[0-9]{9}")){
            valido = true;
        }
        return valido;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == telefonoField){
            telefonoField.setBorder(BorderFactory.createLineBorder( verificadorTelefono() ? Color.GREEN : Color.RED ));
        }

        if (e.getSource() == dniField){
            dniField.setBorder(BorderFactory.createLineBorder(verificadorDNI() ? Color.GREEN : Color.RED ));
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == telefonoField){
            telefonoField.setBorder(BorderFactory.createLineBorder( verificadorTelefono() ? Color.GREEN : Color.RED ));
        }

        if (e.getSource() == dniField){
            dniField.setBorder(BorderFactory.createLineBorder(verificadorDNI() ? Color.GREEN : Color.RED ));
        }
    }
}
