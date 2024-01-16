import java.util.ArrayList;
import java.util.List;

public class Hotel { // Clase

    static int id;  // Variable estática para el ID del hotel

    // Atributos
    String name;
    String address;
    int stars;
    int numberOfRooms;

    // Constructor por defecto que incrementa el ID del hotel
    public Hotel() {
        // Se incrementa el ID cada vez que se crea un nuevo objeto Hotel
        id++;
    }

    //Nueva lista para almacenar las actividades del hotel
    private List<Actividad> actividades;

    // Nuevo constructor que acepta detalles del hotel al momento de la creación
    public Hotel(String name, String address, int stars) {
        this(); // Llama al constructor por defecto para incrementar el ID
        this.name = name;
        this.address = address;
        this.stars = stars;
        this.actividades = new ArrayList<>(); // Inicializa la lista de actividades
    }

    // Metodos

    //Metodo para agregar actividad al hotel
    public void agregarActividad(String name, String description){
        Actividad nuevaActividad = new Actividad(name,description);
        actividades.add(nuevaActividad);
        System.out.println("Actividad agregada al hotel: " + nuevaActividad.name);
    }

    //Metodo para mostrar las actividades
    public void mostrarActividades(){
        System.out.println("Actividades del hotel " + this.name + ":");
        for(Actividad actividad: actividades){
            System.out.println(actividad.mostrarDetalles());
        }
    }

    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Hotel: " + id);
    }

    public String showDetails2(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre:" + this.name);
        sb.append("\nDirección:" + this.address);
        sb.append("\nEstrellas:" + this.stars);
        return sb.toString();
    }

    // Método estático para obtener el próximo ID disponible
    public static int getNextId() {
        return id + 1;
    }
}