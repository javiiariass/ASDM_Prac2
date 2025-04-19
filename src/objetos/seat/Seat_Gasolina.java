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
public class Seat_Gasolina extends AutoAbstracto_Gasolina implements I_AutoEuropeo{
    
    private float subvencion;
    
    
    
    public Seat_Gasolina(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
     
        this.subvencion = 209; // valor por defecto para seat gasolina
    }
    
    public Seat_Gasolina(String fabricante, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, float subvencion) {
       
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada);
     
        this.subvencion = subvencion; 
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println(fabricante + " " + modelo + " " + anyoFabricacion + " (gasolina)\n-------------------");
        System.out.println("Color: " + color);
        System.out.println("Potencia: " + potencia + "cv");
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Plazas: " + nPlazas);
        System.out.println("Capacidad de maletero: " + espacioMaletero + 'L');
        System.out.println("Precio base: " + precio);
        System.out.println("Precio con subvencion: " + calcularPrecioFinal());
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