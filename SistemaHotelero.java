import java.util.ArrayList;
import java.util.List;

public class SistemaHotelero {
    private List<Hotel> hotelesVisitados;

    // Constructor de la clase SistemaHotelero
    public SistemaHotelero() {
        this.hotelesVisitados = new ArrayList<>();
    }

    // Método para registrar un nuevo hotel en la lista de hoteles visitados
    public void registrarHotel(String name, String address, int stars) {
        // Crear una nueva instancia de Hotel utilizando el constructor con parámetros
        Hotel nuevoHotel = new Hotel(name, address, stars);
        // Agregar el nuevo hotel a la lista de hoteles visitados
        hotelesVisitados.add(nuevoHotel);
        System.out.println("Hotel registrado con éxito.");
    }

    // Método para imprimir los detalles de todos los hoteles visitados
    public void verHotelesVisitados() {
        System.out.println("Hoteles visitados:");
        // Iterar sobre la lista de hoteles y mostrar sus detalles utilizando showDetails2()
        for (Hotel hotel : hotelesVisitados) {
            System.out.println(hotel.showDetails2());
        }
    }
}
