package ACT1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ActionRojo extends AbstractAction {
    private final JFrame rojo;
    public ActionRojo(JFrame rojo) {
        super("Rojo");
        this.rojo = rojo;
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            rojo.setForeground(Color.red);
        }


}
