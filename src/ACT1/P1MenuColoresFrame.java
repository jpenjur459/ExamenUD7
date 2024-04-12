package ACT1;

import javax.swing.*;

public class P1MenuColoresFrame {
    public static void main(String[] args) {
        ActionSalir salir = new ActionSalir();

        JFrame ventana = new JFrame("ut8_02_26");
        JMenuBar menuBar = new JMenuBar();
        JMenu menuColores = new JMenu("Colores");
        JMenuItem menuVerde = new JMenuItem("Verde");
        JMenuItem menuAzul = new JMenuItem("Azul");

        ActionRojo rojo = new ActionRojo(ventana);



        menuColores.add(rojo);
        menuColores.add(menuVerde);
        menuColores.add(menuAzul);
        menuColores.addSeparator();
        menuColores.add(salir);
        menuBar.add(menuColores);
        ventana.setJMenuBar(menuBar);
        ventana.setSize(640, 480);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
