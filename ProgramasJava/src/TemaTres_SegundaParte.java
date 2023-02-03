public class TemaTres_SegundaParte {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        System.out.println(miCoche.numeroPuertas);
    }

}

class Coche {
    int numeroPuertas = 4;

    void incrementaPuertas () {
        numeroPuertas++;
    }
}
