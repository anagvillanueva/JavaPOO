public class Hotel { // Clase
    static int id;
    // Atributos
    String name;
    String address;
    int stars;

    // Metodo constructor

    Hotel(){
        System.out.println("-- Construyendo Hotel --");
        id++;
    }

    // Metodos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Hotel: " + id);
    }

    public Object showDetails(){
        System.out.println("Nombre:" + this.name);
        System.out.println("Dirección:" + this.address);
        System.out.println("Estrellas:" + this.stars);
        return null;
    }

    public String showDetails2(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre:" + this.name);
        sb.append("\nDirección:" + this.address);
        sb.append("\nEstrellas:" + this.stars);
        return sb.toString();
    }
}
