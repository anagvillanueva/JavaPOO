public class Actividad {
    //Atributos
    private String name;
    private String description;

    //Constructor
    public Actividad(String name, String description){
        this.name = name;
        this.description = description;
    }

    //Metodos getter y setter - Alt + insert

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Metodo para mostrar los detalles de la actividad
    public String mostrarDetalles(){
        return "Actividad: " + name + "Descripcion: " + description;
    }
}
