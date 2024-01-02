public class Main {
    // Punto de entrada de mi aplicación
    public static void main(String[] args) {
        Hotel myHotel = new Hotel();
        myHotel.name = "Holiday Inn";
        myHotel.showName();

        // Accediendo de forma publica
        System.out.println("Estrellas:" + myHotel.stars);
    }
}
