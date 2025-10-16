/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;

public class JugadorDAO {
    private ArrayList<JugadorModelo> listaJugadores = new ArrayList<>();

    public void agregarJugador(JugadorModelo jugador) {
        listaJugadores.add(jugador);
    }

    public ArrayList<JugadorModelo> obtenerTodos() {
        return listaJugadores;
    }
}
