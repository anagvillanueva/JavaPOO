public class Hotel { // Clase

    static int id;  // Variable estática para el ID del hotel

    // Atributos
    String nombre;     // Nombre del hotel
    String direccion;  // Dirección del hotel
    int estrellas;       // Número de estrellas del hotel

    // Nuevo constructor que acepta detalles del hotel al momento de la creación
    public Hotel(String nombre, String direccion, int estrellas) {
        this(); // Llama al constructor por defecto para incrementar el ID
        this.nombre = nombre;
        this.direccion = direccion;
        this.estrellas = estrellas;
    }

    // Constructor por defecto que incrementa el ID del hotel
    public Hotel() {
        // Se incrementa el ID cada vez que se crea un nuevo objeto Hotel
        id++;
    }

    // Metodos
    public void showName(){
        System.out.println(nombre);
    }
    public void showId(){
        System.out.println("ID Hotel: " + id);
    }

    public String showDetails2(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre:" + this.nombre);
        sb.append("\nDirección:" + this.direccion);
        sb.append("\nEstrellas:" + this.estrellas);
        return sb.toString();
    }
}
