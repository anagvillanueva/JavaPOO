public class Main {
    public static void main(String[] args) {

        SistemaHotelero sistema = new SistemaHotelero();
        sistema.registrarHotel("Hotel A", "CDMX, Polanco 123", 5);
        sistema.registrarHotel("Hotel B", "Estado de Mexico, Ecatepec 45", 3);

        System.out.println("----------------");
        sistema.verHotelesVisitados();

    }
}