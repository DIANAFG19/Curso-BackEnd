public class PrivacidadAbstraccionEncapsulacion {
    public static void main(String[] args) {
        /*
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Jetta");
        coche.setVelocidadMaxima(220);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Italika");
        moto.setVelocidadMaxima(120);

        System.out.println("El coche " + coche.getTipo() + " tiene una velocidad máxima de " + coche.getVelocidadMaxima() + " km/h");
        System.out.println("La moto " + moto.getTipo() + " tiene una velocidad máxima de " + moto.getVelocidadMaxima() + " km/h");
         */
    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }


}
