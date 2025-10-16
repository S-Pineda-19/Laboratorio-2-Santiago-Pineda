/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Santi
 */
public class Teleferico implements SistemaTarifario {

    @Override
    public double calcularTarifa(double distancia) {
        // Tarifa variable: base 1000 + 500 por km o estación
        return 1000 + (500 * distancia);
    }

    @Override
    public void mostrarRuta() {
        System.out.println("Ruta de conexión veredal (tarifa variable, base $1000 COP)");
    }
}
