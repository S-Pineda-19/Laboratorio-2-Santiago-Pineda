/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Admin
 */
public class JugadorModelo {
    private String nombre;
    private int edad;
    private String posicion;
    private int goles;

    public JugadorModelo(String nombre, int edad, String posicion, int goles) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.goles = goles;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getPosicion() { return posicion; }
    public int getGoles() { return goles; }

    @Override
    public String toString() {
        return nombre + " | Edad: " + edad + " | Posición: " + posicion + " | Goles: " + goles;
    }
}
