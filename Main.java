
public class Main {
    // Punto de entrada de mi aplicación
    public static void main(String[] args) {

        SistemaHotelero sistema = new SistemaHotelero();
        sistema.registrarHotel("Hotel A", "Calle 123", 4);
        sistema.registrarHotel("Hotel B", "Avenida XYZ", 5);

        sistema.verHotelesVisitados();
    }
}