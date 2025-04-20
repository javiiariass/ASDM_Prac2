/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asdm_prac2;

import fabricas.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import objetos.*;

/**
 *
 * @author javi
 */
public class manejaCatalogo {

    // Inicializar fábricas
    static I_FabricaVehiculo fabricaMercedes = new FabricaMercedes();
    static I_FabricaVehiculo fabricaAudi = new FabricaAudi();
    static I_FabricaVehiculo fabricaLexus = new FabricaLexus();
    static I_FabricaVehiculo fabricaSeat = new FabricaSeat();
    static List<I_FabricaVehiculo> fabricas = List.of(fabricaMercedes, fabricaAudi, fabricaLexus, fabricaSeat);
    static List<AutoAbstracto> catalogo = new ArrayList<>();
    
    public static List<AutoAbstracto> instanciaCatalogo(String tipo) {
        
        switch (tipo) {
            case "Electrico" -> {
                // Instanciamos 2 coches electricos de cada marca
                catalogo.add(fabricas.get(0).crearCocheElectrico("EQA", "Azul", 200, 400.0f, 5, 2023, 55000, 400, 8, 340));
                catalogo.add(fabricas.get(0).crearCocheElectrico("EQC", "Plata", 408, 500.0f, 5, 2024, 75000, 450, 9, 500));
                catalogo.add(fabricas.get(1).crearCocheElectrico("e-tron", "Negro", 300, 500.0f, 5, 2023, 70000, 450, 9, 600));
                catalogo.add(fabricas.get(1).crearCocheElectrico("Q4 e-tron", "Blanco", 299, 520.0f, 5, 2024, 60000, 500, 8, 520));
                catalogo.add(fabricas.get(2).crearCocheElectrico("UX 300e", "Rojo", 204, 367.0f, 5, 2023, 8320000, 315, 7, 367));
                catalogo.add(fabricas.get(2).crearCocheElectrico("RZ 450e", "Gris", 313, 540.0f, 5, 2024, 13000000, 400, 8, 540));
                catalogo.add(fabricas.get(3).crearCocheElectrico("el-Born", "Gris", 204, 385.0f, 5, 2023, 38000, 420, 7, 385));
                catalogo.add(fabricas.get(3).crearCocheElectrico("Tavascan", "Azul", 340, 540.0f, 5, 2024, 55000, 550, 8, 540));
            }
            case "Diesel" -> {
                // Instanciamos 2 coches diesel de cada marca
                catalogo.add(fabricas.get(0).crearCocheDiesel("Clase C", "Gris", 170, 450.0f, 5, 2023, 40000, 2200, 550));
                catalogo.add(fabricas.get(0).crearCocheDiesel("Clase E", "Negro", 194, 610.0f, 5, 2024, 55000, 2000, 600));
                catalogo.add(fabricas.get(1).crearCocheDiesel("A4", "Plata", 160, 430.0f, 5, 2023, 38000, 2000, 500));
                catalogo.add(fabricas.get(1).crearCocheDiesel("A6", "Azul", 204, 520.0f, 5, 2024, 58000, 2000, 550));
                catalogo.add(fabricas.get(2).crearCocheDiesel("NX", "Negro", 190, 480.0f, 5, 2023, 8000000, 2200, 520));
                catalogo.add(fabricas.get(2).crearCocheDiesel("RX", "Blanco", 238, 461.0f, 5, 2024, 11000000, 2400, 500));
                catalogo.add(fabricas.get(3).crearCocheDiesel("Leon", "Blanco", 150, 400.0f, 5, 2023, 22000, 1900, 350));
                catalogo.add(fabricas.get(3).crearCocheDiesel("Ateca", "Gris", 150, 510.0f, 5, 2024, 28000, 2000, 500));
            }
            case "Gasolina" -> {
                // Instanciamos 2 coches de gasolina de cada marca
                catalogo.add(fabricas.get(0).crearCocheGasolina("Clase A", "Rojo", 150, 400.0f, 5, 2023, 35000, 2000, 500));
                catalogo.add(fabricas.get(0).crearCocheGasolina("Clase C", "Blanco", 180, 450.0f, 5, 2024, 42000, 2200, 550));
                catalogo.add(fabricas.get(1).crearCocheGasolina("A3", "Azul", 140, 380.0f, 5, 2023, 32000, 1800, 450));
                catalogo.add(fabricas.get(1).crearCocheGasolina("A4", "Negro", 190, 480.0f, 5, 2024, 45000, 2000, 500));
                catalogo.add(fabricas.get(2).crearCocheGasolina("IS", "Blanco", 180, 420.0f, 5, 2023, 7200000, 2500, 480));
                catalogo.add(fabricas.get(2).crearCocheGasolina("RC", "Gris", 245, 374.0f, 4, 2024, 9500000, 2000, 400));
                catalogo.add(fabricas.get(3).crearCocheGasolina("Ibiza", "Negro", 110, 350.0f, 5, 2023, 18000, 1600, 300));
                catalogo.add(fabricas.get(3).crearCocheGasolina("Leon", "Rojo", 150, 380.0f, 5, 2024, 24000, 1500, 400));
            }
            case "Hibrido" -> {
                // Instanciamos 2 coches hibridos de cada marca
                catalogo.add(fabricas.get(0).crearCocheHibrido("Clase E Híbrido", "Blanco", 211, 430.0f, 5, 2023, 60000, 2000, 50, 500));
                catalogo.add(fabricas.get(0).crearCocheHibrido("GLC Híbrido", "Gris", 320, 395.0f, 5, 2024, 68000, 2000, 60, 450));
                catalogo.add(fabricas.get(1).crearCocheHibrido("A6 TFSI e", "Negro", 299, 400.0f, 5, 2023, 65000, 2000, 55, 360));
                catalogo.add(fabricas.get(1).crearCocheHibrido("Q5 TFSI e", "Azul", 367, 465.0f, 5, 2024, 72000, 2000, 65, 490));
                catalogo.add(fabricas.get(2).crearCocheHibrido("RX 450h", "Plata", 313, 450.0f, 5, 2023, 12000000, 3500, 60, 451));
                catalogo.add(fabricas.get(2).crearCocheHibrido("NX 350h", "Rojo", 242, 545.0f, 5, 2024, 9800000, 2500, 50, 545));
                catalogo.add(fabricas.get(3).crearCocheHibrido("Tarraco e-HYBRID", "Azul", 245, 600.0f, 7, 2023, 45000, 1400, 49, 610));
                catalogo.add(fabricas.get(3).crearCocheHibrido("Leon e-HYBRID", "Blanco", 204, 270.0f, 5, 2024, 35000, 1400, 60, 270));
            }
            case "Catalogo completo" -> {
                // Instanciamos 1 coche de cada marca y de cada tipo
                // Electricos
                catalogo.add(fabricas.get(0).crearCocheElectrico("EQA", "Azul", 200, 400.0f, 5, 2023, 55000, 400, 8, 340));
                catalogo.add(fabricas.get(1).crearCocheElectrico("e-tron", "Negro", 300, 500.0f, 5, 2023, 70000, 450, 9, 600));
                catalogo.add(fabricas.get(2).crearCocheElectrico("UX 300e", "Rojo", 204, 367.0f, 5, 2023, 8320000, 315, 7, 367));
                catalogo.add(fabricas.get(3).crearCocheElectrico("el-Born", "Gris", 204, 385.0f, 5, 2023, 38000, 420, 7, 385));
                // diesel
                catalogo.add(fabricas.get(0).crearCocheDiesel("Clase C", "Gris", 170, 450.0f, 5, 2023, 40000, 2200, 550));
                catalogo.add(fabricas.get(1).crearCocheDiesel("A4", "Plata", 160, 430.0f, 5, 2023, 38000, 2000, 500));
                catalogo.add(fabricas.get(2).crearCocheDiesel("NX", "Negro", 190, 480.0f, 5, 2023, 8000000, 2200, 520));
                catalogo.add(fabricas.get(3).crearCocheDiesel("Ateca", "Gris", 150, 510.0f, 5, 2024, 28000, 2000, 500));
                // gasolina
                catalogo.add(fabricas.get(0).crearCocheGasolina("Clase A", "Rojo", 150, 400.0f, 5, 2023, 35000, 2000, 500));
                catalogo.add(fabricas.get(1).crearCocheGasolina("A3", "Azul", 140, 380.0f, 5, 2023, 32000, 1800, 450));
                catalogo.add(fabricas.get(2).crearCocheGasolina("IS", "Blanco", 180, 420.0f, 5, 2023, 7200000, 2500, 480));
                catalogo.add(fabricas.get(3).crearCocheGasolina("Ibiza", "Negro", 110, 350.0f, 5, 2023, 18000, 1600, 300));
                //hibrido
                catalogo.add(fabricas.get(0).crearCocheHibrido("Clase E Híbrido", "Blanco", 211, 430.0f, 5, 2023, 60000, 2000, 50, 500));
                catalogo.add(fabricas.get(1).crearCocheHibrido("A6 TFSI e", "Negro", 299, 400.0f, 5, 2023, 65000, 2000, 55, 360));
                catalogo.add(fabricas.get(2).crearCocheHibrido("RX 450h", "Plata", 313, 450.0f, 5, 2023, 12000000, 3500, 60, 451));
                catalogo.add(fabricas.get(3).crearCocheHibrido("Tarraco e-HYBRID", "Azul", 245, 600.0f, 7, 2023, 45000, 1400, 49, 610));
            }
            default ->
                throw new AssertionError();
        }

        return catalogo;
    }
    
    public static void borraCatalogo(){
        catalogo.clear();
    }
    public static List<AutoAbstracto> getCatalogo(){
        return catalogo;
    }
    public static List<AutoAbstracto> filtraCatalogo(String filtro){
        List<AutoAbstracto> catAux = new ArrayList<>();
        switch (filtro) {
            case "potencia" -> {
                String entrada = JOptionPane.showInputDialog(null, "Por favor, introduce potencia minima:");
                int cv = Integer.parseInt(entrada);
                catAux = catalogo.stream()
                        .filter(coche -> coche.getPotencia() >= cv)
                        .collect(Collectors.toList());
            }
            case "nPlazas" -> {
                String entrada = JOptionPane.showInputDialog(null, "Por favor, introduce plazas minimas:");
                int pl = Integer.parseInt(entrada);
                catAux = catalogo.stream()
                        .filter(coche -> coche.getnPlazas() >= pl)
                        .collect(Collectors.toList());
            }
            case "precio" -> {
                String entrada = JOptionPane.showInputDialog(null, "Por favor, introduce precio mínimo (decimal con ','):");
                float p = Float.parseFloat(entrada);
                catAux = catalogo.stream()
                        .filter(coche -> coche.calcularPrecioFinal() >= p)
                        .collect(Collectors.toList());
            }
                
            default -> throw new AssertionError();
        }
        
        return catAux;
    }
    
    
    
    
    
}
