public class PrivAbstEncap {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Jetta");

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Italika");

        System.out.println(coche.getTipo());
        System.out.println(moto.getTipo());

    }
}

class Vehiculo {
    private String tipo;

    public void setTipo(String valor) {
        this.tipo = valor;
    }
    public String getTipo() {
        return this.tipo;
    }
}
