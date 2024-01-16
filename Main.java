public class Main {
    public static void main(String[] args) {
        //Punto de entrada de mi aplicación
        Hotel myHotel = new Hotel();
        myHotel.showId();
        System.out.println("----------");
        myHotel.name = "Holiday Inn";
        myHotel.address = "Ciudad de México, 133 Polanco";
        myHotel.stars = 4;
        myHotel.numberOfRooms = 330;

        Hotel myHotel2 = new Hotel();
        myHotel2.showId();
        System.out.println("-------------");
        myHotel2.name = "Hotelito";
        myHotel2.address = "Estado de Mexico";
        myHotel2.stars = 3;
        myHotel2.numberOfRooms = 150;

        System.out.println("-------");
        System.out.println(myHotel.showDetails2());
        System.out.println("-------");
        System.out.println(myHotel2.showDetails2());

    }
}