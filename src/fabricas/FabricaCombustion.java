/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;

import objetos.AutoAbstracto_Audi;
import objetos.AutoAbstracto_Lexus;
import objetos.AutoAbstracto_Mercedes;
import objetos.AutoAbstracto_Seat;
import objetos.AutoMercedes_Combustion;

/**
 *
 * @author javiiariass
 */
public class FabricaCombustion implements I_FabricaVehiculo {

    
    public AutoAbstracto_Mercedes creaMercedes(int precio, String modelo, String color, int potencia,
            float espacioMaletero, int nPlazas, int anyoFabricacion, float subvencion, int cilindrada, String tipoCombustion) {
        return new AutoMercedes_Combustion(precio, modelo, color, potencia, espacioMaletero, nPlazas, 
                anyoFabricacion, subvencion, cilindrada, tipoCombustion);
    }

    @Override
    public AutoAbstracto_Seat creaSeat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AutoAbstracto_Audi creaAudi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AutoAbstracto_Lexus creaLexus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public AutoAbstracto_Mercedes creaMercedes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
