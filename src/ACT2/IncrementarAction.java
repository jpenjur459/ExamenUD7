package ACT2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class IncrementarAction extends AbstractAction {
    private final JButton lblContador;
    private final int repeticiones;


    public IncrementarAction(JButton lblContador, int repeticiones) {
        super("+1");
        this.lblContador = lblContador;
        this.repeticiones = repeticiones;
        putValue(MNEMONIC_KEY, KeyEvent.VK_D);
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
                KeyEvent.VK_2, InputEvent.CTRL_DOWN_MASK));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (repeticiones == 5){
            JToggleButton tglToggle = new JToggleButton("1");
        }
        int cuenta = Integer.parseInt(lblContador.getText()) + 1;
        lblContador.setText(String.valueOf(cuenta));
    }
}