public class TemaTres {

    public static void main(String[] args) {
        int resultado = suma(10, 20, 30);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.incrementaPuertas();
        System.out.println("El coche tiene " + miCoche.numeroPuertas + " puertas.");
    }

    private static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}

class Coche {
    int numeroPuertas = 4;

    void incrementaPuertas () {
        numeroPuertas++;
    }
}
