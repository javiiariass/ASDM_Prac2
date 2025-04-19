/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fabricas;
import objetos.*;
/**
 * Interfaz que define contratos de fabricas concretas
 * @author javiiariass
 */
public interface I_FabricaVehiculo {
    AutoAbstracto_Mercedes creaMercedes();
    AutoAbstracto_Seat creaSeat();
    AutoAbstracto_Audi creaAudi();
    AutoAbstracto_Lexus creaLexus(); 
}
