/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author Admin
 */
import javax.swing.*;
import java.awt.*;
import Modelo.JugadorModelo;
import java.util.ArrayList;
import Modelo.*;
import Control.*;

public class Vista extends JFrame {
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtPosicion;
    private JTextField txtGoles;
    private JButton btnAgregar;
    private JButton btnMostrar;
    private JTextArea areaJugadores;

    public Vista() {
        setTitle(" Sistema de Microfútbol ");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));

        JPanel panelCampos = new JPanel(new GridLayout(5, 2, 5, 5));
        panelCampos.setBorder(BorderFactory.createTitledBorder("Registrar jugador"));

        panelCampos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelCampos.add(txtNombre);

        panelCampos.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelCampos.add(txtEdad);

        panelCampos.add(new JLabel("Posición:"));
        txtPosicion = new JTextField();
        panelCampos.add(txtPosicion);

        panelCampos.add(new JLabel("Goles:"));
        txtGoles = new JTextField();
        panelCampos.add(txtGoles);

        btnAgregar = new JButton("Agregar jugador");
        btnMostrar = new JButton("Ver todos los jugadores");

        panelCampos.add(btnAgregar);
        panelCampos.add(btnMostrar);

        areaJugadores = new JTextArea();
        areaJugadores.setEditable(false);
        JScrollPane scroll = new JScrollPane(areaJugadores);
        scroll.setBorder(BorderFactory.createTitledBorder("Lista de jugadores"));

        panel.add(panelCampos, BorderLayout.NORTH);
        panel.add(scroll, BorderLayout.CENTER);

        add(panel);
    }

   
    public String getNombre() { return txtNombre.getText(); }
    public String getEdad() { return txtEdad.getText(); }
    public String getPosicion() { return txtPosicion.getText(); }
    public String getGoles() { return txtGoles.getText(); }

    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnMostrar() { return btnMostrar; }

    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarJugadores(ArrayList<JugadorModelo> jugadores) {
        areaJugadores.setText("");
        if (jugadores.isEmpty()) {
            areaJugadores.append("No hay jugadores registrados.\n");
        } else {
            for (JugadorModelo j : jugadores) {
                areaJugadores.append(j.toString() + "\n");
            }
        }
    }

   
    public void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtPosicion.setText("");
        txtGoles.setText("");
    }
    
    public static void main(String[] args) {
        JugadorDAO modelo = new JugadorDAO();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciar();
    }
}

