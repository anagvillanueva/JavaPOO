public class Main {
    public static void main(String[] args) {
        SistemaHotelero sistema = new SistemaHotelero();
        //Registrar hoteles
        sistema.registrarHotel("ABC", "CDMX, Polanco 123", 5);
        sistema.registrarHotel("Hotel V", "CDMX, Benito Juarez", 4);

        //Registrar motel
        sistema.registrarMotel("Motel A", "Ecatepec", 3,true);
        sistema.registrarMotel("Motel You", "Edo Mex, 13", 4,false);

        System.out.println("----------------------------");
        //Agregar actividades
        Hotel primerHotel = sistema.getHotelesVisitados().get(0);
        primerHotel.agregarActividad("Spa", "Piedras calientes.");
        Hotel segundoHotel = sistema.getHotelesVisitados().get(1);
        primerHotel.agregarActividad("Alberca", "Alberca para adultos y chapoteadero para niños.");

        System.out.println("----------------------------");
        //Mostrar detalles de hoteles y actividades
        sistema.verHotelesVisitados();
        System.out.println("----------------------------");
        for(Hotel hotel: sistema.getHotelesVisitados()){
            hotel.mostrarActividades();
        }
        //Ver moteles forma 1
        System.out.println("----------------------------");
        sistema.verMotelesVisitados();
        System.out.println("----------------------------");
        Motel miMotel = (Motel) sistema.getHotelesVisitados().get(2);
    }
}