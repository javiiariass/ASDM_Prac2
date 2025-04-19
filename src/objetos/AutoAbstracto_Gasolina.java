/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;


/**
 *
 * @author javiiariass
 */
public abstract class AutoAbstracto_Gasolina extends AutoAbstracto{

    protected int cilindrada;

    public int getCilindrada() {
        return cilindrada;
    }

    public AutoAbstracto_Gasolina(String fabricante, String modelo, String color, int potencia, float espacioMaletero,
            int nPlazas, int anyoFabricacion, float precio) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
        
        // Valor predeterminado para la cilindrada de un coche diésel Mercedes
        this.cilindrada = 2200; // cc - Los diésel suelen tener mayor cilindrada
    }
    
    public AutoAbstracto_Gasolina(String fabricante, String modelo, String color, int potencia, float espacioMaletero,
            int nPlazas, int anyoFabricacion, float precio, int cilindrada) {
        
        super(fabricante, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio);
        
        this.cilindrada = cilindrada;
    }

    
}