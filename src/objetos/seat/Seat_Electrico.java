/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.seat;
import objetos.*;


/**
 *
 * @author javiiariass
 */
public class Seat_Electrico extends AutoAbstracto_Electrico implements I_AutoEuropeo{

    
    private float subvencion;
    /**
     * Asigna valor por defecto a autonomia y tiempo de recarga
     * @param fabricante
     * @param modelo
     * @param color
     * @param potencia
     * @param espacioMaletero
     * @param nPlazas
     * @param anyoFabricacion
     * @param precio 
     */
    public Seat_Electrico(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
        this.subvencion = 800; // valor por defecto para seat electricos
    }

    public Seat_Electrico(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga, float subvencion) {
       
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, autonomia, tiempoRecarga);
        this.subvencion = subvencion; 
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println('\n' + fabricante + " " + modelo + " " + anyoFabricacion + " (electrico)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio);
        System.out.println("Precio con subvencion: " + calcularPrecioFinal());
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Tiempo de carga: " + tiempoRecarga);
    }

    @Override
    public String obtenerCaracteristicasString() {
        return "\n" + fabricante + " " + modelo + " " + anyoFabricacion + " (electrico)\n-------------------\n" +
               "Color: " + color + "\n" +
               "Potencia: " + potencia + "cv\n" +
               "Plazas: " + nPlazas + "\n" +
               "Capacidad de maletero: " + espacioMaletero + "L\n" +
               "Precio base: " + precio + "\n" +
               "Precio con subvencion: " + calcularPrecioFinal() + "\n" +
               "Autonomia: " + autonomia + "\n" +
               "Tiempo de carga: " + tiempoRecarga;
    }

    @Override
    public float calcularPrecioFinal() {
        return precio - subvencion;
    }

    @Override
    public float getSubvenciones() {
        return subvencion;
    }

    @Override
    public void setSubvenciones(float subvencion) {
        this.subvencion = subvencion;
    }
}