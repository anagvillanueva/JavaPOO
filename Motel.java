public class Motel extends Hotel{
    private boolean tieneEstacionamiento;

    //Constructor que llama a la clase base(Hotel)
    public Motel(String name, String address, int stars, boolean tieneEstacionamiento) {
        super(name, address, stars);
        this.tieneEstacionamiento = tieneEstacionamiento;
    }

    //Metodo para mi Motel
    public void ofrecerServicioDeMotel(){
        System.out.println("Bienvenido al motel: " + getName());
        System.out.println("Ofrecemos servicios especiales para parejas.");
        if(tieneEstacionamiento){
            System.out.println("Estacionamiento disponible");
        }else{
            System.out.println("No tenemos estacionamiento disponible por el momento.");
        }
    }

    //Getter y Setter estacionamiento
    public boolean isTieneEstacionamiento() {
        return tieneEstacionamiento;
    }

    public void setTieneEstacionamiento(boolean tieneEstacionamiento) {
        this.tieneEstacionamiento = tieneEstacionamiento;
    }
}
