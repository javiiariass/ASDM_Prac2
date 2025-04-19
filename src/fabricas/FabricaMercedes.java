/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;
import objetos.*;
import objetos.mercedes.*;

/**
 * Fábrica concreta que implementa la creación de vehículos Mercedes
 * @author javiiariass
 */
public class FabricaMercedes implements I_FabricaVehiculo {
@Override
    public AutoAbstracto_Gasolina crearCocheGasolina(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, float subvencion) {
        return new Mercedes_Gasolina("Mercedes", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, subvencion);
    }

    @Override
    public AutoAbstracto_Diesel crearCocheDiesel(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, float subvencion) {
        return new Mercedes_Diesel("Mercedes", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, subvencion);
    }

    @Override
    public AutoAbstracto_Electrico crearCocheElectrico(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga, float subvencion) {
        return new Mercedes_Electrico("Mercedes", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, autonomia, tiempoRecarga, subvencion);
    }

    @Override
    public AutoAbstracto_Hibrido crearCocheHibrido(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, int autonomiaElectrica, float subvencion) {
        return new Mercedes_Hibrido("Mercedes", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, autonomiaElectrica, subvencion);
    }
    
}