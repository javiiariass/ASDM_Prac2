

// Asumiendo que las clases están en estos paquetes. Ajusta si es necesario.

public class TestCombustion {

    public static void main(String[] args) {
        System.out.println("Iniciando prueba de coches de combustión...");

        // Crear fábricas para cada fabricante
        FabricaVehiculo fabricaMercedes = new FabricaMercedes();
        FabricaVehiculo fabricaAudi = new FabricaAudi();
        FabricaVehiculo fabricaLexus = new FabricaLexus();
        FabricaVehiculo fabricaSeat = new FabricaSeat();

        System.out.println("\n--- Creando coches de Gasolina ---");

        // Crear coches de gasolina usando las fábricas
        try {
            CocheGasolina mercedesGasolina = fabricaMercedes.crearCocheGasolina("Clase A", 2000, 35000);
            System.out.println("Creado: " + mercedesGasolina.getDescripcion());

            CocheGasolina audiGasolina = fabricaAudi.crearCocheGasolina("A3", 1800, 32000);
            System.out.println("Creado: " + audiGasolina.getDescripcion());

            CocheGasolina lexusGasolina = fabricaLexus.crearCocheGasolina("IS", 2500, 45000); // Asumiendo precio en Yenes o aplicar conversión
            System.out.println("Creado: " + lexusGasolina.getDescripcion());

            CocheGasolina seatGasolina = fabricaSeat.crearCocheGasolina("Ibiza", 1600, 18000);
            System.out.println("Creado: " + seatGasolina.getDescripcion());

        } catch (UnsupportedOperationException e) {
            System.err.println("Error: Una fábrica no soporta la creación de coches de gasolina. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al crear coches de gasolina: " + e.getMessage());
            e.printStackTrace();
        }


        System.out.println("\n--- Creando coches Diésel ---");

        // Crear coches diésel usando las fábricas
        try {
            CocheDiesel mercedesDiesel = fabricaMercedes.crearCocheDiesel("Clase C", 2200, 40000);
            System.out.println("Creado: " + mercedesDiesel.getDescripcion());

            CocheDiesel audiDiesel = fabricaAudi.crearCocheDiesel("A4", 2000, 38000);
            System.out.println("Creado: " + audiDiesel.getDescripcion());

            CocheDiesel lexusDiesel = fabricaLexus.crearCocheDiesel("NX", 2200, 50000); // Asumiendo precio en Yenes o aplicar conversión
            System.out.println("Creado: " + lexusDiesel.getDescripcion());

            CocheDiesel seatDiesel = fabricaSeat.crearCocheDiesel("Leon", 1900, 22000);
            System.out.println("Creado: " + seatDiesel.getDescripcion());

        } catch (UnsupportedOperationException e) {
            System.err.println("Error: Una fábrica no soporta la creación de coches diésel. " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al crear coches diésel: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- Pruebas finalizadas ---");
    }
}
