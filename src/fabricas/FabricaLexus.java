/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;
import objetos.*;
import objetos.lexus.*;

/**
 * Fábrica concreta que implementa la creación de vehículos Lexus
 * @author javiiariass
 */
public class FabricaLexus implements I_FabricaVehiculo {

    @Override
    public AutoAbstracto_Gasolina crearCocheGasolina(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, float aranceles) {
        return new Lexus_Gasolina("Lexus", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, aranceles);
    }

    @Override
    public AutoAbstracto_Diesel crearCocheDiesel(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, float aranceles) {
        return new Lexus_Diesel("Lexus", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, aranceles);
    }

    @Override
    public AutoAbstracto_Electrico crearCocheElectrico(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga, float aranceles) {
        return new Lexus_Electrico("Lexus", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, autonomia, tiempoRecarga, aranceles);
    }

    @Override
    public AutoAbstracto_Hibrido crearCocheHibrido(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, int autonomiaElectrica, float aranceles) {
        return new Lexus_Hibrido("Lexus", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, autonomiaElectrica, aranceles);
    }   
}