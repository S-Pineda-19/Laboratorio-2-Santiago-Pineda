/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Admin
 */
import Vista.Vista;
import Modelo.JugadorDAO;
import Modelo.JugadorModelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private JugadorDAO modelo;
    private Vista vista;

    public Controlador(JugadorDAO modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        inicializarEventos();
    }

    private void inicializarEventos() {
        vista.getBtnAgregar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = vista.getNombre();
                    int edad = Integer.parseInt(vista.getEdad());
                    String posicion = vista.getPosicion();
                    int goles = Integer.parseInt(vista.getGoles());

                    JugadorModelo nuevo = new JugadorModelo(nombre, edad, posicion, goles);
                    modelo.agregarJugador(nuevo);

                    vista.mostrarMensaje(" Jugador agregado correctamente.");
                    vista.limpiarCampos();
                } catch (NumberFormatException ex) {
                    vista.mostrarMensaje(" Error: Edad y goles deben ser números.");
                }
            }
        });

        vista.getBtnMostrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.mostrarJugadores(modelo.obtenerTodos());
            }
        });
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}
