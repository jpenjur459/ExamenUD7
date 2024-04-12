package ACT3;

import javax.swing.*;
import java.awt.*;

public class P3TresEnRayaFrame {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("tres en rayas");
        ventana.setLayout(new GridLayout(3, 3));
        for (int i = 1; i < 10; i++) {
            ventana.add(new JButton(String.valueOf(i)));
        }


        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
