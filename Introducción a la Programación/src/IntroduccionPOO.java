public class IntroduccionPOO {
    public static void main(String[] args) {
        Auto auto = new Auto();
        System.out.println(auto.numeroPuertas);
        System.out.println(auto.velocidadMaxima);
        System.out.println(auto.velocidadActual);

        Auto auto2 = new Auto(4, 220);
        System.out.println(auto2.numeroPuertas);
        System.out.println(auto2.velocidadMaxima);
        System.out.println(auto2.velocidadActual);
    }
}

class Auto{
    int numeroPuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Auto() {
        numeroPuertas = 5;
        velocidadMaxima = 190;
        System.out.println("¡Estoy en el constructor *** SIN PARAMETROS ***!");
    }

    public Auto(int puertas, int velocidad) {
        numeroPuertas = puertas;
        velocidadMaxima = velocidad;
        System.out.println("¡Estoy en el constructor *** CON PARAMETROS ***!");
    }
}
