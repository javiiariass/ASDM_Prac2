/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author javiiariass
 */
public class AutoAudi_Electrico extends AutoAbstracto_Audi {
    private int cilindrada;
    private String tipoCombustion; // Gasolina / Diesel / Hidrogeno

    public AutoAudi_Electrico(float precio, String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float subvencion, int cilindrada, String tipoCombustion) {
        super(precio, modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, subvencion);
        this.cilindrada = cilindrada;
        this.tipoCombustion = tipoCombustion;
    }
    
    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Audi\t" + modelo + '\t' + color + '\t' + potencia + "cv\t" + espacioMaletero + "L\t" + nPlazas + 
        "puertas\n\t\t" + anyoFabricacion + '\t' + subvecion + "€" + cilindrada + "cc\t" + tipoCombustion + '\t' + precio + '€');
    }
    
}
