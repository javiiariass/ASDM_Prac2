/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fabricas;
import objetos.*;

/**
 * Interfaz que define los contratos para fábricas de vehículos
 * Esta interfaz sigue el patrón Abstract Factory
 * @author javiiariass
 */
public interface I_FabricaVehiculo {
    // Métodos para crear cada tipo de vehículo
    AutoAbstracto_Gasolina crearCocheGasolina(String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, float arancel_O_subvencion);
    
    AutoAbstracto_Diesel crearCocheDiesel(String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, float arancel_O_subvencion);
    
    AutoAbstracto_Electrico crearCocheElectrico(String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int autonomia, int tiempoRecarga, float arancel_O_subvencion);
    
    AutoAbstracto_Hibrido crearCocheHibrido(String modelo, String color, int potencia, float espacioMaletero, 
            int nPlazas, int anyoFabricacion, float precio, int cilindrada, int autonomiaElectrica, float arancel_O_subvencion);
}
