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
public class Lexus_Diesel extends AutoAbstracto_Diesel implements I_AutoNoEuropeo{
    
    private float aranceles;
    private char moneda;
    
    
    /**
     * Asigna valor por defecto a cilindrada y arancel
     * @param fabricante
     * @param modelo
     * @param color
     * @param potencia
     * @param espacioMaletero
     * @param nPlazas
     * @param anyoFabricacion
     * @param precio 
     */
    public Lexus_Diesel(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
     
        this.aranceles = 0.20f; // valor por defecto para lexus diesel
    }
    
    public Lexus_Diesel(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, float arancel) {
       
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada);
        this.moneda = '¥';
        this.aranceles = arancel; 
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println('\n' + fabricante + " " + modelo + " " + anyoFabricacion + " (diesel)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio + "¥\t" + getPrecioEnEuros() + '€');
        System.out.println("Precio con subvencion: " + calcularPrecioFinal());
    }

    @Override
    public String obtenerCaracteristicasString() {
        return "\n" + fabricante + " " + modelo + " " + anyoFabricacion + " (diesel)\n-------------------\n" +
               "Color: " + color + "\n" +
               "Potencia: " + potencia + "cv\n" +
               "Cilindrada: " + cilindrada + "\n" +
               "Plazas: " + nPlazas + "\n" +
               "Capacidad de maletero: " + espacioMaletero + "L\n" +
               "Precio base: " + precio + moneda + "\t" + getPrecioEnEuros() + "€\n" +
               "Precio con aranceles: " + calcularPrecioFinal(); // Note: Label says "subvencion" but calculates with aranceles
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