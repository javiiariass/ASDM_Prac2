/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.lexus;
import objetos.*;


/**
 *
 * @author javiiariass
 */
public class Lexus_Electrico extends AutoAbstracto_Electrico implements I_AutoNoEuropeo{

    private char moneda;
    private float aranceles; // % de aranceles aplicables (15% == -0.15)
    /**
     * Asigna valor por defecto a autonomia, tiempo de recarga y arancel
     * @param fabricante
     * @param modelo
     * @param color
     * @param potencia
     * @param espacioMaletero
     * @param nPlazas
     * @param anyoFabricacion
     * @param precio 
     */
    public Lexus_Electrico(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
        this.aranceles = 0.12f; // valor por defecto para lexus electricos
        this.moneda = '¥';
    }

    public Lexus_Electrico(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga, float arancel) {
       
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, autonomia, tiempoRecarga);
        this.aranceles = arancel; 
        this.moneda = '¥';
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(fabricante + " " + modelo + " " + anyoFabricacion + " (electrico)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio + "¥\t" + getPrecioEnEuros() + '€');
        System.out.println("Precio con aranceles: " + calcularPrecioFinal());
        System.out.println("Autonomia: " + autonomia);
        System.out.println("Tiempo de carga: " + tiempoRecarga);
    }

    @Override
    public float calcularPrecioFinal() {
        return getPrecioEnEuros() * (1+aranceles);
    }

    @Override
    public float getAranceles() {
        return aranceles;
    }

    @Override
    public void setAranceles(float arancel) {
        this.aranceles = arancel;
    }

    @Override
    public float getPrecioEnEuros() {
        return precio * 0.0062f;
    }
    
}