
public class Main {
    // Punto de entrada de mi aplicación
    public static void main(String[] args) {


        Hotel myHotel = new Hotel(); // Metodo constructor
        System.out.println(Hotel.id);
        myHotel.name = "Holiday Inn";
        myHotel.stars = 4;
        myHotel.address = "Dr. Mariano Azuela 12, Cuauhtémoc, CDMX,";

        Hotel myHotelSay = new Hotel(); // Nuevo objeto
        System.out.println(Hotel.id);

        myHotel.showName();
        System.out.println("-------------------");

        // Accediendo de forma publica
        System.out.println("Estrellas:" + myHotel.stars);

        System.out.println("-------------------");
        //Imprimiendo
        myHotel.showDetails();
        System.out.println("-------------------");
        //Retornando cadena
        System.out.println(myHotel.showDetails2());

    }
}