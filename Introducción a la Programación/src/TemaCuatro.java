public class TemaCuatro {
    public static void main(String[] args) {
        /*
            CONDICION IF.
         */
        int numeroIf = 1;
        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo.");
        } else if (numeroIf == 0) {
            System.out.println("El número " + numeroIf + " es igual a cero.");
        } else {
            System.out.println("El número " + numeroIf + " es negativo.");
        }

        /*
            BUCLE WHILE.
         */
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("numeroWhile = " + numeroWhile);
            numeroWhile++;
        }

        /*
            BUCLE DO-WHILE.
         */
        do {
            System.out.println("numeroDoWhile = " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        /*
            BUCLE FOR.
         */
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("numeroFor = " + numeroFor);
        }

        /*
            SWITCH.
         */
        String estacion = "OTONIO";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("La estación es PRIMAVERA");
                break;
            case "VERANO":
                System.out.println("La estación es VERANO");
                break;
            case "OTONO":
                System.out.println("La estación es OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("La estación es INVIERNO");
                break;
            default:
                System.out.println("La estación NO EXISTE");
        }

    }
}
