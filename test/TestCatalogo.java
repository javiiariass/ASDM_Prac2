import fabricas.*;
import objetos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TestCatalogo {

    public static void main(String[] args) {
        // Inicializar fábricas
        try (Scanner scanner = new Scanner(System.in)) {
            // Inicializar fábricas
            I_FabricaVehiculo fabricaMercedes = new FabricaMercedes();
            I_FabricaVehiculo fabricaAudi = new FabricaAudi();
            I_FabricaVehiculo fabricaLexus = new FabricaLexus();
            I_FabricaVehiculo fabricaSeat = new FabricaSeat();
            List<I_FabricaVehiculo> fabricas = List.of(fabricaMercedes, fabricaAudi, fabricaLexus, fabricaSeat);

            System.out.println("Bienvenido al creador de catálogos de coches.");
            System.out.println("Seleccione el tipo de coche para el catálogo:");
            System.out.println("1. Gasolina");
            System.out.println("2. Diesel");
            System.out.println("3. Eléctrico");
            System.out.println("4. Híbrido");
            System.out.println("5. Catálogo Completo (Todos los tipos)"); // Nueva opción
            System.out.print("Ingrese su opción (1-5): ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir newline

            switch (opcion) {
                case 1:
                    crearYFiltrarCatalogoGasolina(scanner, fabricas);
                    break;
                case 2:
                    crearYFiltrarCatalogoDiesel(scanner, fabricas);
                    break;
                case 3:
                    crearYFiltrarCatalogoElectrico(scanner, fabricas);
                    break;
                case 4:
                    crearYFiltrarCatalogoHibrido(scanner, fabricas);
                    break;
                case 5: // Nuevo caso
                    crearYFiltrarCatalogoCompleto(scanner, fabricas);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        System.out.println("\n--- Catálogo finalizado ---");
    }

    private static void crearYFiltrarCatalogoGasolina(Scanner scanner, List<I_FabricaVehiculo> fabricas) {
        System.out.println("\n--- Creando catálogo de coches de Gasolina ---");
        List<AutoAbstracto_Gasolina> catalogoGasolina = new ArrayList<>();
        try {
            // Añadir más coches de ejemplo
            catalogoGasolina.add(fabricas.get(0).crearCocheGasolina("Clase A", "Rojo", 150, 400.0f, 5, 2023, 35000, 2000, 500));
            catalogoGasolina.add(fabricas.get(0).crearCocheGasolina("Clase C", "Blanco", 180, 450.0f, 5, 2024, 42000, 2200, 550));
            catalogoGasolina.add(fabricas.get(1).crearCocheGasolina("A3", "Azul", 140, 380.0f, 5, 2023, 32000, 1800, 450));
            catalogoGasolina.add(fabricas.get(1).crearCocheGasolina("A4", "Negro", 190, 480.0f, 5, 2024, 45000, 2000, 500));
            catalogoGasolina.add(fabricas.get(2).crearCocheGasolina("IS", "Blanco", 180, 420.0f, 5, 2023, 7200000, 2500, 480)); // Corregido maletero
            catalogoGasolina.add(fabricas.get(2).crearCocheGasolina("RC", "Gris", 245, 374.0f, 4, 2024, 9500000, 2000, 400));
            catalogoGasolina.add(fabricas.get(3).crearCocheGasolina("Ibiza", "Negro", 110, 350.0f, 5, 2023, 18000, 1600, 300));
            catalogoGasolina.add(fabricas.get(3).crearCocheGasolina("Leon", "Rojo", 150, 380.0f, 5, 2024, 24000, 1500, 400));
        } catch (UnsupportedOperationException e) {
            System.err.println("Advertencia: Una fábrica no soporta coches de gasolina. " + e.getMessage());
        } catch (Exception e) {
             System.err.println("Error inesperado al añadir coche de gasolina: " + e.getMessage());
        }

        System.out.println("Seleccione el atributo por el cual filtrar:");
        System.out.println("1. Cilindrada mínima (cc)");
        System.out.println("2. Potencia mínima (cv)");
        System.out.println("3. Precio máximo (€)");
        System.out.print("Ingrese su opción (1-3): ");
        int filtroOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir newline

        List<AutoAbstracto_Gasolina> filtrados = new ArrayList<>();
        String criterio = "";

        switch (filtroOpcion) {
            case 1:
                System.out.print("Ingrese la cilindrada mínima (cc): ");
                int cilindradaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoGasolina.stream()
                        .filter(coche -> coche.getCilindrada() >= cilindradaMinima)
                        .collect(Collectors.toList());
                criterio = "Cilindrada >= " + cilindradaMinima + "cc";
                break;
            case 2:
                System.out.print("Ingrese la potencia mínima (cv): ");
                int potenciaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoGasolina.stream()
                        .filter(coche -> coche.getPotencia() >= potenciaMinima)
                        .collect(Collectors.toList());
                criterio = "Potencia >= " + potenciaMinima + "cv";
                break;
            case 3:
                System.out.print("Ingrese el precio máximo (€): ");
                float precioMaximo = scanner.nextFloat();
                scanner.nextLine();
                filtrados = catalogoGasolina.stream()
                        .filter(coche -> coche.getPrecio() <= precioMaximo)
                        .collect(Collectors.toList());
                criterio = "Precio <= " + precioMaximo + "€";
                break;
            default:
                System.out.println("Opción de filtro no válida.");
                return; // Salir si la opción no es válida
        }


        System.out.println("\n--- Catálogo Filtrado (Gasolina - " + criterio + ") ---");
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron coches que cumplan el criterio.");
        } else {
            filtrados.forEach(AutoAbstracto::mostrarCaracteristicas);
        }
    }

    private static void crearYFiltrarCatalogoDiesel(Scanner scanner, List<I_FabricaVehiculo> fabricas) {
        System.out.println("\n--- Creando catálogo de coches Diésel ---");
        List<AutoAbstracto_Diesel> catalogoDiesel = new ArrayList<>();
         try {
             // Añadir más coches y corregir Lexus
            catalogoDiesel.add(fabricas.get(0).crearCocheDiesel("Clase C", "Gris", 170, 450.0f, 5, 2023, 40000, 2200, 550));
            catalogoDiesel.add(fabricas.get(0).crearCocheDiesel("Clase E", "Negro", 194, 610.0f, 5, 2024, 55000, 2000, 600));
            catalogoDiesel.add(fabricas.get(1).crearCocheDiesel("A4", "Plata", 160, 430.0f, 5, 2023, 38000, 2000, 500));
            catalogoDiesel.add(fabricas.get(1).crearCocheDiesel("A6", "Azul", 204, 520.0f, 5, 2024, 58000, 2000, 550));
            catalogoDiesel.add(fabricas.get(2).crearCocheDiesel("NX", "Negro", 190, 480.0f, 5, 2023, 8000000, 2200, 520)); // Corregido maletero a int
            catalogoDiesel.add(fabricas.get(2).crearCocheDiesel("RX", "Blanco", 238, 461.0f, 5, 2024, 11000000, 2400, 500));
            catalogoDiesel.add(fabricas.get(3).crearCocheDiesel("Leon", "Blanco", 150, 400.0f, 5, 2023, 22000, 1900, 350));
            catalogoDiesel.add(fabricas.get(3).crearCocheDiesel("Ateca", "Gris", 150, 510.0f, 5, 2024, 28000, 2000, 500));
        } catch (UnsupportedOperationException e) {
            System.err.println("Advertencia: Una fábrica no soporta coches diésel. " + e.getMessage());
        } catch (Exception e) {
             System.err.println("Error inesperado al añadir coche diésel: " + e.getMessage());
             e.printStackTrace(); // Imprimir stack trace puede ayudar a depurar
        }

        System.out.println("Seleccione el atributo por el cual filtrar:");
        System.out.println("1. Capacidad mínima del maletero (l)");
        System.out.println("2. Potencia mínima (cv)");
        System.out.println("3. Año de fabricación mínimo");
        System.out.print("Ingrese su opción (1-3): ");
        int filtroOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir newline

        List<AutoAbstracto_Diesel> filtrados = new ArrayList<>();
        String criterio = "";

        switch (filtroOpcion) {
            case 1:
                System.out.print("Ingrese la capacidad mínima del maletero (l): ");
                int capacidadMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoDiesel.stream()
                        .filter(coche -> coche.getEspacioMaletero() >= capacidadMinima)
                        .collect(Collectors.toList());
                criterio = "Capacidad Maletero >= " + capacidadMinima + "l";
                break;
            case 2:
                System.out.print("Ingrese la potencia mínima (cv): ");
                int potenciaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoDiesel.stream()
                        .filter(coche -> coche.getPotencia() >= potenciaMinima)
                        .collect(Collectors.toList());
                criterio = "Potencia >= " + potenciaMinima + "cv";
                break;
            case 3:
                System.out.print("Ingrese el año de fabricación mínimo: ");
                int anyoMinimo = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoDiesel.stream()
                        .filter(coche -> coche.getAnyoFabricacion() >= anyoMinimo)
                        .collect(Collectors.toList());
                criterio = "Año Fabricación >= " + anyoMinimo;
                break;
            default:
                System.out.println("Opción de filtro no válida.");
                return;
        }

        System.out.println("\n--- Catálogo Filtrado (Diésel - " + criterio + ") ---");
         if (filtrados.isEmpty()) {
            System.out.println("No se encontraron coches que cumplan el criterio.");
        } else {
            filtrados.forEach(AutoAbstracto::mostrarCaracteristicas);
        }
    }

    private static void crearYFiltrarCatalogoElectrico(Scanner scanner, List<I_FabricaVehiculo> fabricas) {
        System.out.println("\n--- Creando catálogo de coches Eléctricos ---");
        List<AutoAbstracto_Electrico> catalogoElectrico = new ArrayList<>();
         try {
             // Añadir más coches y corregir Lexus
            catalogoElectrico.add(fabricas.get(0).crearCocheElectrico("EQA", "Azul", 200, 400.0f, 5, 2023, 55000, 400, 8, 340)); // Maletero int
            catalogoElectrico.add(fabricas.get(0).crearCocheElectrico("EQC", "Plata", 408, 500.0f, 5, 2024, 75000, 450, 9, 500));
            catalogoElectrico.add(fabricas.get(1).crearCocheElectrico("e-tron", "Negro", 300, 500.0f, 5, 2023, 70000, 450, 9, 600)); // Maletero int
            catalogoElectrico.add(fabricas.get(1).crearCocheElectrico("Q4 e-tron", "Blanco", 299, 520.0f, 5, 2024, 60000, 500, 8, 520));
            catalogoElectrico.add(fabricas.get(2).crearCocheElectrico("UX 300e", "Rojo", 204, 367.0f, 5, 2023, 8320000, 315, 7, 367)); // Corregido maletero a int
            catalogoElectrico.add(fabricas.get(2).crearCocheElectrico("RZ 450e", "Gris", 313, 540.0f, 5, 2024, 13000000, 400, 8, 540));
            catalogoElectrico.add(fabricas.get(3).crearCocheElectrico("el-Born", "Gris", 204, 385.0f, 5, 2023, 38000, 420, 7, 385)); // Maletero int
            catalogoElectrico.add(fabricas.get(3).crearCocheElectrico("Tavascan", "Azul", 340, 540.0f, 5, 2024, 55000, 550, 8, 540));
        } catch (UnsupportedOperationException e) {
            System.err.println("Advertencia: Una fábrica no soporta coches eléctricos. " + e.getMessage());
        } catch (Exception e) {
             System.err.println("Error inesperado al añadir coche eléctrico: " + e.getMessage());
        }

        System.out.println("Seleccione el atributo por el cual filtrar:");
        System.out.println("1. Autonomía mínima (km)");
        System.out.println("2. Tiempo máximo de recarga (h)");
        System.out.println("3. Capacidad mínima de batería (kWh)");
        System.out.print("Ingrese su opción (1-3): ");
        int filtroOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir newline

        List<AutoAbstracto_Electrico> filtrados = new ArrayList<>();
        String criterio = "";

        switch (filtroOpcion) {
            case 1:
                System.out.print("Ingrese la autonomía mínima (km): ");
                int autonomiaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoElectrico.stream()
                        .filter(coche -> coche.getAutonomia() >= autonomiaMinima)
                        .collect(Collectors.toList());
                criterio = "Autonomía >= " + autonomiaMinima + "km";
                break;
            case 2:
                System.out.print("Ingrese el tiempo máximo de recarga (h): ");
                int tiempoMaximo = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoElectrico.stream()
                        .filter(coche -> coche.getTiempoRecarga() <= tiempoMaximo)
                        .collect(Collectors.toList());
                criterio = "Tiempo Recarga <= " + tiempoMaximo + "h";
                break;
            default:
                System.out.println("Opción de filtro no válida.");
                return;
        }

        System.out.println("\n--- Catálogo Filtrado (Eléctrico - " + criterio + ") ---");
         if (filtrados.isEmpty()) {
            System.out.println("No se encontraron coches que cumplan el criterio.");
        } else {
            filtrados.forEach(AutoAbstracto::mostrarCaracteristicas);
        }
    }

     private static void crearYFiltrarCatalogoHibrido(Scanner scanner, List<I_FabricaVehiculo> fabricas) {
        System.out.println("\n--- Creando catálogo de coches Híbridos ---");
        List<AutoAbstracto_Hibrido> catalogoHibrido = new ArrayList<>();
         try {
             // Añadir más coches y corregir Lexus
            catalogoHibrido.add(fabricas.get(0).crearCocheHibrido("Clase E Híbrido", "Blanco", 211, 430.0f, 5, 2023, 60000, 2000, 50, 500)); // Maletero int
            catalogoHibrido.add(fabricas.get(0).crearCocheHibrido("GLC Híbrido", "Gris", 320, 395.0f, 5, 2024, 68000, 2000, 60, 450));
            catalogoHibrido.add(fabricas.get(1).crearCocheHibrido("A6 TFSI e", "Negro", 299, 400.0f, 5, 2023, 65000, 2000, 55, 360)); // Maletero int
            catalogoHibrido.add(fabricas.get(1).crearCocheHibrido("Q5 TFSI e", "Azul", 367, 465.0f, 5, 2024, 72000, 2000, 65, 490));
            catalogoHibrido.add(fabricas.get(2).crearCocheHibrido("RX 450h", "Plata", 313, 450.0f, 5, 2023, 12000000, 3500, 60, 451)); // Corregido maletero a int
            catalogoHibrido.add(fabricas.get(2).crearCocheHibrido("NX 350h", "Rojo", 242, 545.0f, 5, 2024, 9800000, 2500, 50, 545));
            catalogoHibrido.add(fabricas.get(3).crearCocheHibrido("Tarraco e-HYBRID", "Azul", 245, 600.0f, 7, 2023, 45000, 1400, 49, 610)); // Maletero int
            catalogoHibrido.add(fabricas.get(3).crearCocheHibrido("Leon e-HYBRID", "Blanco", 204, 270.0f, 5, 2024, 35000, 1400, 60, 270));
        } catch (UnsupportedOperationException e) {
            System.err.println("Advertencia: Una fábrica no soporta coches híbridos. " + e.getMessage());
        } catch (Exception e) {
             System.err.println("Error inesperado al añadir coche híbrido: " + e.getMessage());
        }

        System.out.println("Seleccione el atributo por el cual filtrar:");
        System.out.println("1. Autonomía eléctrica mínima (km)");
        System.out.println("2. Cilindrada mínima (cc)");
        System.out.println("3. Potencia mínima (cv)");
        System.out.print("Ingrese su opción (1-3): ");
        int filtroOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir newline

        List<AutoAbstracto_Hibrido> filtrados = new ArrayList<>();
        String criterio = "";

        switch (filtroOpcion) {
            case 1:
                System.out.print("Ingrese la autonomía eléctrica mínima (km): ");
                int autonomiaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoHibrido.stream()
                        .filter(coche -> coche.getAutonomiaElectrica() >= autonomiaMinima)
                        .collect(Collectors.toList());
                criterio = "Autonomía Eléctrica >= " + autonomiaMinima + "km";
                break;
            case 2:
                System.out.print("Ingrese la cilindrada mínima (cc): ");
                int cilindradaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoHibrido.stream()
                        .filter(coche -> coche.getCilindrada() >= cilindradaMinima)
                        .collect(Collectors.toList());
                criterio = "Cilindrada >= " + cilindradaMinima + "cc";
                break;
            case 3:
                System.out.print("Ingrese la potencia mínima (cv): ");
                int potenciaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoHibrido.stream()
                        .filter(coche -> coche.getPotencia() >= potenciaMinima)
                        .collect(Collectors.toList());
                criterio = "Potencia >= " + potenciaMinima + "cv";
                break;
            default:
                System.out.println("Opción de filtro no válida.");
                return;
        }

        System.out.println("\n--- Catálogo Filtrado (Híbrido - " + criterio + ") ---");
         if (filtrados.isEmpty()) {
            System.out.println("No se encontraron coches que cumplan el criterio.");
        } else {
            filtrados.forEach(AutoAbstracto::mostrarCaracteristicas);
        }
    }

    // --- Nuevo método para el catálogo completo ---
    private static void crearYFiltrarCatalogoCompleto(Scanner scanner, List<I_FabricaVehiculo> fabricas) {
        System.out.println("\n--- Creando catálogo completo de coches ---");
        List<AutoAbstracto> catalogoCompleto = new ArrayList<>();

        // Añadir coches de todos los tipos (usando los ejemplos ya definidos y quizás más)
        try {
            // Gasolina
            catalogoCompleto.add(fabricas.get(0).crearCocheGasolina("Clase A", "Rojo", 150, 400.0f, 5, 2023, 35000, 2000, 500));
            catalogoCompleto.add(fabricas.get(1).crearCocheGasolina("A3", "Azul", 140, 380.0f, 5, 2023, 32000, 1800, 450));
            catalogoCompleto.add(fabricas.get(3).crearCocheGasolina("Ibiza", "Negro", 110, 350.0f, 5, 2023, 18000, 1600, 300));
            // Diesel
            catalogoCompleto.add(fabricas.get(0).crearCocheDiesel("Clase C", "Gris", 170, 450.0f, 5, 2023, 40000, 2200, 550));
            catalogoCompleto.add(fabricas.get(1).crearCocheDiesel("A4", "Plata", 160, 430.0f, 5, 2023, 38000, 2000, 500));
            catalogoCompleto.add(fabricas.get(3).crearCocheDiesel("Leon", "Blanco", 150, 400.0f, 5, 2023, 22000, 1900, 350));
             // Eléctrico
            catalogoCompleto.add(fabricas.get(0).crearCocheElectrico("EQA", "Azul", 200, 400.0f, 5, 2023, 55000, 400, 8, 340));
            catalogoCompleto.add(fabricas.get(1).crearCocheElectrico("e-tron", "Negro", 300, 500.0f, 5, 2023, 70000, 450, 9, 600));
            catalogoCompleto.add(fabricas.get(3).crearCocheElectrico("el-Born", "Gris", 204, 385.0f, 5, 2023, 38000, 420, 7, 385));
            // Híbrido
            catalogoCompleto.add(fabricas.get(0).crearCocheHibrido("Clase E Híbrido", "Blanco", 211, 430.0f, 5, 2023, 60000, 2000, 50, 500));
            catalogoCompleto.add(fabricas.get(1).crearCocheHibrido("A6 TFSI e", "Negro", 299, 400.0f, 5, 2023, 65000, 2000, 55, 360));
            catalogoCompleto.add(fabricas.get(3).crearCocheHibrido("Tarraco e-HYBRID", "Azul", 245, 600.0f, 7, 2023, 45000, 1400, 49, 610));
            // Añadir coches Lexus si la fábrica los soporta
             try { catalogoCompleto.add(fabricas.get(2).crearCocheGasolina("IS", "Blanco", 180, 420.0f, 5, 2023, 7200000, 2500, 480)); } catch (UnsupportedOperationException e) {}
             try { catalogoCompleto.add(fabricas.get(2).crearCocheDiesel("NX", "Negro", 190, 480.0f, 5, 2023, 8000000, 2200, 520)); } catch (UnsupportedOperationException e) {}
             try { catalogoCompleto.add(fabricas.get(2).crearCocheElectrico("UX 300e", "Rojo", 204, 367.0f, 5, 2023, 8320000, 315, 7, 367)); } catch (UnsupportedOperationException e) {}
             try { catalogoCompleto.add(fabricas.get(2).crearCocheHibrido("RX 450h", "Plata", 313, 450.0f, 5, 2023, 12000000, 3500, 60, 451)); } catch (UnsupportedOperationException e) {}

        } catch (Exception e) {
            System.err.println("Error inesperado al añadir coches al catálogo completo: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Seleccione el atributo común por el cual filtrar:");
        System.out.println("1. Potencia mínima (cv)");
        System.out.println("2. Precio máximo (€)");
        System.out.println("3. Año de fabricación mínimo");
        System.out.println("4. Número mínimo de plazas");
        System.out.println("5. Capacidad mínima del maletero (l)");
        System.out.print("Ingrese su opción (1-5): ");
        int filtroOpcion = scanner.nextInt();
        scanner.nextLine(); // Consumir newline

        List<AutoAbstracto> filtrados = new ArrayList<>();
        String criterio = "";

        switch (filtroOpcion) {
            case 1:
                System.out.print("Ingrese la potencia mínima (cv): ");
                int potenciaMinima = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoCompleto.stream()
                        .filter(coche -> coche.getPotencia() >= potenciaMinima)
                        .collect(Collectors.toList());
                criterio = "Potencia >= " + potenciaMinima + "cv";
                break;
            case 2:
                System.out.print("Ingrese el precio máximo (€): ");
                float precioMaximo = scanner.nextFloat();
                scanner.nextLine();
                filtrados = catalogoCompleto.stream()
                        .filter(coche -> coche.getPrecio() <= precioMaximo)
                        .collect(Collectors.toList());
                criterio = "Precio <= " + precioMaximo + "€";
                break;
            case 3:
                System.out.print("Ingrese el año de fabricación mínimo: ");
                int anyoMinimo = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoCompleto.stream()
                        .filter(coche -> coche.getAnyoFabricacion() >= anyoMinimo)
                        .collect(Collectors.toList());
                criterio = "Año Fabricación >= " + anyoMinimo;
                break;
            case 4:
                 System.out.print("Ingrese el número mínimo de plazas: ");
                int plazasMinimas = scanner.nextInt();
                scanner.nextLine();
                filtrados = catalogoCompleto.stream()
                        .filter(coche -> coche.getnPlazas() >= plazasMinimas)
                        .collect(Collectors.toList());
                criterio = "Plazas >= " + plazasMinimas;
                break;
            case 5:
                 System.out.print("Ingrese la capacidad mínima del maletero (l): ");
                float maleteroMinimo = scanner.nextFloat(); // Usar float ya que getEspacioMaletero devuelve float
                scanner.nextLine();
                filtrados = catalogoCompleto.stream()
                        .filter(coche -> coche.getEspacioMaletero() >= maleteroMinimo)
                        .collect(Collectors.toList());
                criterio = "Capacidad Maletero >= " + maleteroMinimo + "l";
                break;
            default:
                System.out.println("Opción de filtro no válida.");
                return;
        }

        System.out.println("\n--- Catálogo Completo Filtrado (" + criterio + ") ---");
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron coches que cumplan el criterio.");
        } else {
            // Opcional: Ordenar antes de mostrar
            // filtrados.sort(Comparator.comparing(AutoAbstracto::getFabricante).thenComparing(AutoAbstracto::getModelo));
            filtrados.forEach(AutoAbstracto::mostrarCaracteristicas);
        }
    }
}
