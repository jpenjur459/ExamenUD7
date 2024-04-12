package ACT2;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2RepetidorFrame extends JFrame {
    private int repeticiones;
    public P2RepetidorFrame() throws HeadlessException {
        repeticiones = 2;
        setTitle("2 repeticiones");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnlBotones = new JPanel(new FlowLayout());
        JButton btnMenos = null;
        JButton btnMas = null;

        add(pnlBotones, BorderLayout.PAGE_START);
        IncrementarAction inc = new IncrementarAction(btnMas,repeticiones);
        DecrementarAction dec = new DecrementarAction(btnMenos,repeticiones);
        btnMenos = new JButton(dec);
        btnMas = new JButton(inc);

        JPanel pnlCentral = new JPanel(new GridLayout(2, 2));
        pnlCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlCentral.add(new JLabel("Entrada:", SwingConstants.RIGHT));
        JTextField txtEntrada = new JTextField(20);
        pnlCentral.add(txtEntrada);
        pnlCentral.add(new JLabel("Salida:", SwingConstants.RIGHT));
        JTextField txtSalida = new JTextField(20);
        pnlCentral.add(txtSalida);
        add(pnlCentral, BorderLayout.CENTER);

        setVisible(true);
    }
}
