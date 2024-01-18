import java.util.Scanner;

public class Menu {
    private SistemaHotelero sistema;
    private Scanner scanner;

    public Menu(SistemaHotelero sistema) {
        this.sistema = sistema;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----------- Menú -----------");
            System.out.println("1. Ver Hoteles");
            System.out.println("2. Registrar Hotel");
            System.out.println("3. Ver Actividades de Hotel");
            System.out.println("4. Ver Moteles");
            System.out.println("5. Registrar Motel");
            System.out.println("6. Ver Mis Actividades");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de la entrada de números

            switch (opcion) {
                case 1:
                    verHoteles();
                    break;
                case 2:
                    registrarHotel();
                    break;
                case 3:
                    verActividades();
                    break;
                case 4:
                    verMoteles();
                    break;
                case 5:
                    registrarMotel();
                    break;
                case 6:
                    verMisActividades();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
            }

            // Después de cada acción, preguntar si desea regresar al menú principal o salir
            System.out.println("-------------------------------------------------------------");
            System.out.print("1. Regresar al menú principal\n2. Salir\nSeleccione una opción: ");
            int opcionMenu = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de la entrada de números

            if (opcionMenu == 2) {
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                System.exit(0);
            }

        } while (opcion != 0);
    }


    private void verMisActividades() {
        System.out.println("----------- Mis Actividades -----------");
        for (Hotel hotel : sistema.getHotelesVisitados()) {
            System.out.println("Hotel: " + hotel.getName());
            if (!hotel.getActividades().isEmpty()) {
                for (Actividad actividad : hotel.getActividades()) {
                    System.out.println("Actividad: " + actividad.getName() + " - Descripción: " + actividad.getDescription());
                }
            } else {
                System.out.println("Este hotel no cuenta con actividades.");
            }
        }
    }


    private void verHoteles() {
        sistema.verHotelesVisitados();
    }

    private void registrarHotel() {
        System.out.println("|---------------------------|");
        System.out.print("Ingrese el nombre del hotel: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección del hotel: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese la cantidad de estrellas: ");
        int estrellas = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de la entrada de números

        sistema.registrarHotel(nombre, direccion, estrellas);

        // Preguntar si desea agregar actividades
        System.out.print("¿Desea agregar actividades al hotel recién registrado? (Sí/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        if (respuesta.equals("si")) {
            agregarActividadesAlHotel(nombre);
        }

    }

    // Método para agregar actividades a un hotel específico
    private void agregarActividadesAlHotel(String nombreHotel) {
        // Inicializar una variable Hotel como nula para almacenar el hotel encontrado
        Hotel hotel = null;
        // Iterar a través de la lista de hoteles visitados en el sistema
        for (Hotel h : sistema.getHotelesVisitados()) {
            // Verificar si el nombre del hotel actual coincide con el proporcionado
            if (h.getName().equals(nombreHotel)) {
                // Si hay una coincidencia, asignar el hotel actual a la variable y salir del bucle
                hotel = h;
                break;
            }
        }


        if (hotel != null) {
            // Agregar actividades al hotel
            System.out.println("|---------------------------|");
            System.out.println("Ingrese las actividades para el hotel " + nombreHotel + ":");
            System.out.print("Nombre de la actividad: ");
            String nombreActividad = scanner.nextLine();
            System.out.print("Descripción de la actividad: ");
            String descripcionActividad = scanner.nextLine();

            hotel.agregarActividad(nombreActividad, descripcionActividad);
            System.out.println("Actividad agregada al hotel " + nombreHotel + " con éxito.");
        } else {
            System.out.println("Hotel no encontrado.");
        }
    }

    // Método para visualizar las actividades de todos los hoteles visitados
    private void verActividades() {
        System.out.println("----------- Actividades de Hoteles -----------");

        // Iterar a través de la lista de hoteles visitados en el sistema
        for (Hotel hotel : sistema.getHotelesVisitados()) {
            // Imprimir el nombre y la cantidad de estrellas del hotel actual
            System.out.println("Hotel: " + hotel.getName() + " - Estrellas: " + hotel.getStars());

            // Verificar si el hotel tiene actividades asociadas
            if (!hotel.getActividades().isEmpty()) {
                // Si hay actividades, iterar a través de la lista de actividades del hotel
                for (Actividad actividad : hotel.getActividades()) {
                    // Imprimir el nombre y la descripción de cada actividad
                    System.out.println("Actividad: " + actividad.getName() + " - Descripción: " + actividad.getDescription());
                }
            } else {
                // Si el hotel no tiene actividades, imprimir un mensaje indicando esto
                System.out.println("Este hotel no cuenta con actividades.");
            }
        }
    }



    private void verMoteles() {
        sistema.verMotelesVisitados();
    }

    private void registrarMotel() {
        System.out.println("|---------------------------|");
        System.out.print("Ingrese el nombre del motel: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la dirección del motel: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese la cantidad de estrellas del motel: ");
        int estrellas = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea después de la entrada de números
        System.out.print("¿El motel tiene estacionamiento? (true/false): ");
        boolean tieneEstacionamiento = scanner.nextBoolean();
        scanner.nextLine();  // Consumir la nueva línea después de la entrada de booleanos

        sistema.registrarMotel(nombre, direccion, estrellas, tieneEstacionamiento);
        System.out.println("Motel registrado con éxito.");
    }
}