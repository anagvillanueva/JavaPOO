import java.util.ArrayList;
import java.util.List;

public abstract class Hotel { // Clase

    private static int id = 0;  // Variable estática para el ID del hotel

    // Atributos
    private String name;
    private String address;
    private int stars;
    private int numberOfRooms;

    //Nueva lista para almacenar las actividades del hotel
    private List<Actividad> actividades;

    // Constructor por defecto que incrementa el ID del hotel
    public Hotel() {
        // Se incrementa el ID cada vez que se crea un nuevo objeto Hotel
        id++;
    }

    // Nuevo constructor que acepta detalles del hotel al momento de la creación
    public Hotel(String name, String address, int stars) {
        this(); // Llama al constructor por defecto para incrementar el ID
        this.name = name;
        this.address = address;
        this.stars = stars;
        this.actividades = new ArrayList<>(); // Inicializa la lista de actividades
    }

    // Metodos de Getter y Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getStars(){
        return stars;
    }

    public void setStars(int stars){
        this.stars = stars;
    }

    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }

    //Metodo getter para obtener lista de actividades
    public List<Actividad> getActividades(){
        return this.actividades;
    }
    //Metodo para agregar actividad al hotel

    //Metodo - Ejemplo polimorfismo
    public void OfrecerServicio(){
        System.out.println("Bienvenido al hotel: " + getName());
        System.out.println("Ofrecemos servicios generales para familias.");
    }

    public void agregarActividad(String name, String description){
        Actividad nuevaActividad = new Actividad(name,description);
        actividades.add(nuevaActividad);
        System.out.println("Actividad agregada al hotel: " + nuevaActividad.getName());
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

    //Metodo para mi Motel
    public abstract void ofrecerServicio();
}