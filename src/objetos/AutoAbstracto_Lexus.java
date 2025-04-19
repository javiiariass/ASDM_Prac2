/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author javiiariass
 */
public abstract class AutoAbstracto_Lexus extends AutoAbstracto {
    protected char moneda;
    protected float aranceles;
    
    public AutoAbstracto_Lexus(float precio, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, char moneda, float aranceles) {
        super(precio, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion);
        this.moneda = moneda;
        this.aranceles = aranceles;
    }
}
