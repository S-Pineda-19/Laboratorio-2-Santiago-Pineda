/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author Santi
 */
public class BusArticulado implements SistemaTarifario {
    
    @Override
    public double calcularTarifa(double distancia) {
        return 2950;
    }
    
    @Override
    public void mostrarRuta() {
        System.out.println("Ruta troncal (estándar de $2950 )");
    }
}
    
