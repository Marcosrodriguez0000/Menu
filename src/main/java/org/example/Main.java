package org.example;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu archivo, gestion;
    JMenuItem abrir, grabar, salir, alta, consultar, borrar;

    Main() {
        abrir = new JMenuItem("Abrir archivo");
        grabar = new JMenuItem("Grabar");
        salir = new JMenuItem("Salir");
        alta = new JMenuItem("Alta");
        consultar = new JMenuItem("Consultar");
        borrar = new JMenuItem("Borrar");

        mb = new JMenuBar();
        archivo = new JMenu("Archivo");
        gestion = new JMenu("Gestion");

        archivo.add(abrir);
        archivo.add(grabar);
        archivo.add(salir);
        gestion.add(alta);
        gestion.add(consultar);
        gestion.add(borrar);

        mb.add(archivo);
        mb.add(gestion);

        salir.addActionListener(this);

        setJMenuBar(mb);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
