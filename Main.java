public class Main {
    public static void main(String[] args) {

        SistemaHotelero sistema = new SistemaHotelero();

        sistema.registrarHotel("Hotel A", "CDMX, Polanco 123", 5);
        sistema.registrarHotel("Hotel B", "Estado de Mexico, Ecatepec 45", 3);

        System.out.println("----------------");
        //Agregar actividades al Hotel A
        sistema.hotelesVisitados.get(0).agregarActividad("Spa", "Masajes curativos");
        sistema.hotelesVisitados.get(0).agregarActividad("Piscina", "Albercas para niños y adultos");

        System.out.println("----------------");
        sistema.verHotelesVisitados();

        System.out.println("----------------");
        //Mostrar las actividades de cada hotel

        for (Hotel hotel: sistema.hotelesVisitados){
            hotel.mostrarActividades();
        }

    }
}