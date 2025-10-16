/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistematarifario;

/**
 *
 * @author Santi
 */
import Control.*;
public class Sistema {

    // Método polimórfico
    public static void procesarViaje(SistemaTarifario vehiculo, double km) {
        vehiculo.mostrarRuta();
        double tarifa = vehiculo.calcularTarifa(km);
        System.out.println("Tarifa total: $" + tarifa + " COP\n");
    }

    public static void main(String[] args) {
        // Crear instancias
        BusArticulado miBus = new BusArticulado();
        Teleferico miTeleferico = new Teleferico();

        // Probar los viajes
        procesarViaje(miBus, 5);          // Tarifa fija
        procesarViaje(miTeleferico, 2);   // Tarifa variable
    }
}
