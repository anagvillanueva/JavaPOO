public class Main {
    public static void main(String[] args) {
        SistemaHotelero sistema = new SistemaHotelero();
        Menu menu = new Menu(sistema);

        menu.mostrarMenu();
    }
}