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
public class Lexus_Hibrido extends AutoAbstracto_Hibrido implements I_AutoNoEuropeo{
    
    private char moneda;
    private float aranceles;
    
    /**
     * Asigna valor por defecto a cilindrada, autonomia electrica y arancel
     * @param fabricante
     * @param modelo
     * @param color
     * @param potencia
     * @param espacioMaletero
     * @param nPlazas
     * @param anyoFabricacion
     * @param precio 
     */
    public Lexus_Hibrido(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
     
        this.moneda = '¥';
        this.aranceles = 0.10f; // valor por defecto para lexus hibridos
    }
    
    public Lexus_Hibrido(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, int autonomiaElectrica, float aranceles) {
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, autonomiaElectrica);
     
        this.moneda = '¥';
        this.aranceles = aranceles; 
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println('\n' + fabricante + " " + modelo + " " + anyoFabricacion + " (hibrido)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio + "¥\t" + getPrecioEnEuros() + '€');
        System.out.println("Precio con aranceles: " + calcularPrecioFinal() + '€');
        System.out.println("Autonomia motor eléctrico: " + autonomiaElectrica);
    }

    @Override
    public String obtenerCaracteristicasString() {
        return "\n" + fabricante + " " + modelo + " " + anyoFabricacion + " (hibrido)\n-------------------\n" +
               "Color: " + color + "\n" +
               "Potencia: " + potencia + "cv\n" +
               "Cilindrada: " + cilindrada + "\n" +
               "Plazas: " + nPlazas + "\n" +
               "Capacidad de maletero: " + espacioMaletero + "L\n" +
               "Precio base: " + precio + moneda + "\t" + getPrecioEnEuros() + "€\n" +
               "Precio con aranceles: " + calcularPrecioFinal() + "€\n" +
               "Autonomia motor eléctrico: " + autonomiaElectrica;
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
    public void setAranceles(float aranceles) {
        this.aranceles = aranceles;
    }

    @Override
    public float getPrecioEnEuros() {
        return precio * 0.0062f;
    }
    
    
}