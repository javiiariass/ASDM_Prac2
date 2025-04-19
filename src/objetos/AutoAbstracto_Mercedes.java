/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author javiiariass
 */
public abstract class AutoAbstracto_Mercedes extends AutoAbstracto {
    protected float subvecion;

    public AutoAbstracto_Mercedes(float precio, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float subvencion) {
        super(precio, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion);
        this.subvecion =  subvencion;
    }
    
    
}
