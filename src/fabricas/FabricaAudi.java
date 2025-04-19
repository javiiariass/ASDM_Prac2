/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;
import objetos.*;
import objetos.audi.*;

/**
 * Fábrica concreta que implementa la creación de vehículos Audi
 * @author javiiariass
 */
public class FabricaAudi implements I_FabricaVehiculo {
    @Override
    public AutoAbstracto_Gasolina crearCocheGasolina(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, float subvencion) {
        return new Audi_Gasolina("Audi", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, subvencion);
    }

    @Override
    public AutoAbstracto_Diesel crearCocheDiesel(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, float subvencion) {
        return new Audi_Diesel("Audi", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, subvencion);
    }

    @Override
    public AutoAbstracto_Electrico crearCocheElectrico(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga, float subvencion) {
        return new Audi_Electrico("Audi", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, autonomia, tiempoRecarga, subvencion);
    }

    @Override
    public AutoAbstracto_Hibrido crearCocheHibrido(String modelo, String color, int potencia, float espacioMaletero, int nPlazas, int anyoFabricacion, float precio, int cilindrada, int autonomiaElectrica, float subvencion) {
        return new Audi_Hibrido("Audi", modelo, color, potencia, espacioMaletero, nPlazas, anyoFabricacion, precio, cilindrada, autonomiaElectrica, subvencion);
    }
}