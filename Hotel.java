public class Hotel { // Clase

    static int id;  // Variable estática para el ID del hotel

    // Atributos
    String name;
    String address;
    int stars;
    int numberOfRooms;

    // Nuevo constructor que acepta detalles del hotel al momento de la creación
    public Hotel(String name, String address, int stars) {
        this(); // Llama al constructor por defecto para incrementar el ID
        this.name = name;
        this.address = address;
        this.stars = stars;
    }

    // Constructor por defecto que incrementa el ID del hotel
    public Hotel() {
        // Se incrementa el ID cada vez que se crea un nuevo objeto Hotel
        id++;
    }

    // Metodos
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