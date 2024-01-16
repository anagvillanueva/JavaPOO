public class Actividad {
    //Atributos
    String name;
    String description;

    //Constructor
    public Actividad(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Metodo para mostrar los detalles de la actividad
    public String mostrarDetalles(){
        return "Actividad: " + name + "Descripcion: " + description;
    }
}
