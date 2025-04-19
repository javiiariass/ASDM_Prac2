/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;


/**
 *
 * @author javiiariass
 */
public abstract class AutoAbstracto_Electrico extends AutoAbstracto{

    protected int autonomia;
    protected int tiempoRecarga;

    public AutoAbstracto_Electrico(String fabricante, String modelo, String color, int potencia, float espacioMaletero,
            int nPlazas, int anyoFabricacion, float precio) {
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
        
        // Valor predeterminado para la cilindrada de un coche diésel Mercedes
        this.tiempoRecarga = 60; // tiempo de carga completa por defecto
        this.autonomia = 250; // valor estándar de autonomía
    }
    
    public AutoAbstracto_Electrico(String fabricante, String modelo, String color, int potencia, float espacioMaletero,
            int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga) {
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
        this.autonomia = autonomia;
        this.tiempoRecarga = tiempoRecarga;
    }

    public int getAutonomia(){
        return autonomia;
    }
    
    public int getTiempoRecarga(){
        return tiempoRecarga;
    }
    
}