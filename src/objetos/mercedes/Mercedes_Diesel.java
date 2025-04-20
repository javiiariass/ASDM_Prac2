/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.mercedes;
import objetos.*;


/**
 *
 * @author javiiariass
 */
public class Mercedes_Diesel extends AutoAbstracto_Diesel implements I_AutoEuropeo{
    
    private float subvencion;
    
    
    /**
     * Asigna valor por defecto a cilindrada y subvencion
     * @param fabricante
     * @param modelo
     * @param color
     * @param potencia
     * @param espacioMaletero
     * @param nPlazas
     * @param anyoFabricacion
     * @param precio 
     */
    public Mercedes_Diesel(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
     
        this.subvencion = 209; // valor por defecto para mercedes diesel
    }
    
    public Mercedes_Diesel(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, float subvencion) {
       
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada);
     
        this.subvencion = subvencion; 
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println('\n' + fabricante + " " + modelo + " " + anyoFabricacion + " (diesel)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio);
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
               "Precio base: " + precio + "\n" +
               "Precio con subvencion: " + calcularPrecioFinal();
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