/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos.audi;

import objetos.*;


/**
 *
 * @author javiiariass
 */
public class Audi_Hibrido extends AutoAbstracto_Hibrido implements I_AutoEuropeo{
    
    private float subvencion;
    
    /**
     * Asigna valor por defecto a cilindrada, autonomia electrica y subvencion
     * @param fabricante
     * @param modelo
     * @param color
     * @param potencia
     * @param espacioMaletero
     * @param nPlazas
     * @param anyoFabricacion
     * @param precio 
     */
    public Audi_Hibrido(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
     
        this.subvencion = 600; // valor por defecto para audis hibridos
    }
    
    public Audi_Hibrido(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, int autonomiaElectrica, float subvencion) {
       
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, autonomiaElectrica);
     
        this.subvencion = subvencion;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(fabricante + " " + modelo + " " + anyoFabricacion + " (hibrido)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio);
        System.out.println("Precio con subvencion: " + calcularPrecioFinal());
        System.out.println("Autonomia motor eléctrico: " + autonomiaElectrica);
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