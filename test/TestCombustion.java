// Importar las clases necesarias
import fabricas.*; // Importa la interfaz y las fábricas concretas
import objetos.*; // Importa las clases abstractas de vehículos

public class TestCombustion { // Considera renombrar a TestFabricasVehiculos si prueba todos los tipos

    public static void main(String[] args) {
        System.out.println("Iniciando prueba de creación de vehículos...");

        // Crear fábricas para cada fabricante usando la interfaz
        I_FabricaVehiculo fabricaMercedes = new FabricaMercedes(); // Asume que FabricaMercedes implementa I_FabricaVehiculo
        I_FabricaVehiculo fabricaAudi = new FabricaAudi();       // Asume que FabricaAudi implementa I_FabricaVehiculo
        I_FabricaVehiculo fabricaLexus = new FabricaLexus();     // Asume que FabricaLexus implementa I_FabricaVehiculo
        I_FabricaVehiculo fabricaSeat = new FabricaSeat();       // Asume que FabricaSeat implementa I_FabricaVehiculo

        System.out.println("\n--- Creando coches de Gasolina ---");
        try {
            // Usar tipos abstractos y pasar todos los parámetros requeridos
            AutoAbstracto_Gasolina mercedesGasolina = fabricaMercedes.crearCocheGasolina("Clase A", "Rojo", 150, 400.0f, 5, 2023, 35000, 2000, 500);
            System.out.println("Creado coche");
            mercedesGasolina.mostrarCaracteristicas();
            

            AutoAbstracto_Gasolina audiGasolina = fabricaAudi.crearCocheGasolina("A3", "Azul", 140, 380.0f, 5, 2023, 32000, 1800, 450);
            System.out.println("Creado coche");
            audiGasolina.mostrarCaracteristicas();

            // Precio Yenes (45000 * 160)
            AutoAbstracto_Gasolina lexusGasolina = fabricaLexus.crearCocheGasolina("IS", "Blanco", 180, 420.0f, 5, 2023, 7200000, 2500, 0.18f);
            System.out.println("Creado coche");
            lexusGasolina.mostrarCaracteristicas();

            AutoAbstracto_Gasolina seatGasolina = fabricaSeat.crearCocheGasolina("Ibiza", "Negro", 110, 350.0f, 5, 2023, 18000, 1600, 300);
            System.out.println("Creado coche");
            seatGasolina.mostrarCaracteristicas();

        } catch (UnsupportedOperationException e) {
            System.err.println("Error: Una fábrica no soporta la creación de coches de gasolina. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al crear coches de gasolina: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- Creando coches Diésel ---");
        try {
            // Usar tipos abstractos y pasar todos los parámetros requeridos
            AutoAbstracto_Diesel mercedesDiesel = fabricaMercedes.crearCocheDiesel("Clase C", "Gris", 170, 450.0f, 5, 2023, 40000, 2200, 550);
            System.out.println("Creado coche");
            mercedesDiesel.mostrarCaracteristicas();

            AutoAbstracto_Diesel audiDiesel = fabricaAudi.crearCocheDiesel("A4", "Plata", 160, 430.0f, 5, 2023, 38000, 2000, 500);
            System.out.println("Creado coche");
            audiDiesel.mostrarCaracteristicas();

            // Precio Yenes (50000 * 160)
            AutoAbstracto_Diesel lexusDiesel = fabricaLexus.crearCocheDiesel("NX", "Negro", 190, 480.0f, 5, 2023, 8000000, 2200, 0.20f);
            System.out.println("Creado coche");
            lexusDiesel.mostrarCaracteristicas();

            AutoAbstracto_Diesel seatDiesel = fabricaSeat.crearCocheDiesel("Leon", "Blanco", 150, 400.0f, 5, 2023, 22000, 1900, 350);
            System.out.println("Creado coche");
            seatDiesel.mostrarCaracteristicas();

        } catch (UnsupportedOperationException e) {
            System.err.println("Error: Una fábrica no soporta la creación de coches diésel. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al crear coches diésel: " + e.getMessage());
        }

        System.out.println("\n--- Creando coches Eléctricos ---");
        try {
            // Usar tipos abstractos y pasar todos los parámetros requeridos
            AutoAbstracto_Electrico mercedesElectrico = fabricaMercedes.crearCocheElectrico("EQA", "Azul", 200, 400.0f, 5, 2023, 55000, 400, 8, 1000); // Subvención negativa
            System.out.println("Creado coche");
            mercedesElectrico.mostrarCaracteristicas();

            AutoAbstracto_Electrico audiElectrico = fabricaAudi.crearCocheElectrico("e-tron", "Negro", 300, 500.0f, 5, 2023, 70000, 450, 9, 1200);
            System.out.println("Creado coche");
            audiElectrico.mostrarCaracteristicas();

            // Asumiendo que Lexus y Seat pueden no fabricar eléctricos puros (manejar UnsupportedOperationException)
            
            // Precio Yenes (52000 * 160)
            AutoAbstracto_Electrico lexusElectrico = fabricaLexus.crearCocheElectrico("UX 300e", "Rojo", 204, 367.0f, 5, 2023, 8320000, 315, 7, 0.12f);
            System.out.println("Creado coche");
            lexusElectrico.mostrarCaracteristicas();
    

            
            AutoAbstracto_Electrico seatElectrico = fabricaSeat.crearCocheElectrico("el-Born", "Gris", 204, 385.0f, 5, 2023, 38000, 420, 7, 800); 
            System.out.println("Creado coche");
            seatElectrico.mostrarCaracteristicas();

        } catch (Exception e) {
            System.err.println("Error inesperado al crear coches eléctricos: " + e.getMessage());
        }

        System.out.println("\n--- Creando coches Híbridos ---");
        try {
            // Usar tipos abstractos y pasar todos los parámetros requeridos
            AutoAbstracto_Hibrido mercedesHibrido = fabricaMercedes.crearCocheHibrido("Clase E Híbrido", "Blanco", 211, 430.0f, 5, 2023, 60000, 2000, 50, 700);
            System.out.println("Creado coche");
            mercedesHibrido.mostrarCaracteristicas();

            AutoAbstracto_Hibrido audiHibrido = fabricaAudi.crearCocheHibrido("A6 TFSI e", "Negro", 299, 400.0f, 5, 2023, 65000, 2000, 55, 750);
            System.out.println("Creado coche");
            audiHibrido.mostrarCaracteristicas();

            // Precio Yenes (75000 * 160)
            AutoAbstracto_Hibrido lexusHibrido = fabricaLexus.crearCocheHibrido("RX 450h", "Plata", 313, 450.0f, 5, 2023, 12000000, 3500, 60, 0.14f);
            System.out.println("Creado coche");
            lexusHibrido.mostrarCaracteristicas();

            AutoAbstracto_Hibrido seatHibrido = fabricaSeat.crearCocheHibrido("Tarraco e-HYBRID", "Azul", 245, 600.0f, 7, 2023, 45000, 1400, 49, 600);
            System.out.println("Creado coche");
            seatHibrido.mostrarCaracteristicas();

        } catch (UnsupportedOperationException e) {
            System.err.println("Error: Una fábrica no soporta la creación de coches híbridos. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al crear coches híbridos: " + e.getMessage());
        }


        System.out.println("\n--- Pruebas finalizadas ---");
    }
}
