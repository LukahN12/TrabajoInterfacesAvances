import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ExtraCrios extends JPanel implements ChangeListener {

    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JLabel edadCrios;
    private JLabel extras;
    private JLabel grupoEdad;

    private JSpinner edadSpinner;
    private JTextArea extrasArea;

    public ExtraCrios(){
        inicializarComponentes();
        agregarComponentes();

        edadSpinner.addChangeListener(this);
    }

    private void inicializarComponentes(){
        edadCrios = new JLabel("Edad del infante ");
        edadSpinner = new JSpinner(new SpinnerNumberModel(4,0,14,1));

        extras = new JLabel("Informacion de relevancia ");
        extrasArea = new JTextArea();

        grupoEdad = new JLabel("Grupo de edad del infante: ");
    }

    private void agregarComponentes(){
        Insets insert = new Insets(0, 0, 0, 0);

        constraints = new GridBagConstraints(0, 0,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(edadCrios, constraints);
        this.add(edadCrios);

        constraints = new GridBagConstraints(4, 0,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(edadSpinner, constraints);
        this.add(edadSpinner);

        constraints = new GridBagConstraints(0, 8,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(extras, constraints);
        this.add(extras);

        constraints = new GridBagConstraints(0, 11,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(extrasArea, constraints);
        this.add(extrasArea);

        constraints = new GridBagConstraints(0, 18,
                1, 3,
                0, 0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH, insert, 0, 0);
        layout.setConstraints(grupoEdad, constraints);
        this.add(grupoEdad);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
