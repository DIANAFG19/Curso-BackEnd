public class HerenciaPolimorfismoInterfaces {
    public static void main(String[] args) {



        /*CocheHPI cocheHPI = new CocheHPI();
        cocheHPI.diHola();*/

        /*CocheHPI cocheHPI = new CocheHPI();
        cocheHPI.setSonido("RRRR");
        System.out.println(cocheHPI.getSonido());/*

        /*VehiculoHPI vehiculo = new VehiculoHPI();
        vehiculo.setSonido("RRRR");
        System.out.println(vehiculo.getSonido());/*

        /*CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.matricula = "DEF-3344";
        cocheElectrico.velocidadMaxima = 260;
        System.out.println("El coche de matrícula " + cocheElectrico.matricula +
                " tiene una velocidad máxima de " + cocheElectrico.velocidadMaxima + " km/h.");*/
    }
}

interface VehiculoI {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class CocheIn implements VehiculoI {
    public void Acelerar(int cuantaVelocidad) { }

    public void Frenar(int cuantaVelocidad) { }
}

/*class VehiculoHPI {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public VehiculoHPI () {
        System.out.println("Estoy en el constructor de Vehículos.");
    }

    public void diHola() {
        System.out.println("Holaaaaa");
    }

    // abstract public String getSonido();
    // abstract public void setSonido(String sonido);
}*/

/*class CocheHPI extends VehiculoHPI {
    public String getSonido() {
        return "Soy un super sonido " + this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

    public void diHola() {
        System.out.println("Estoy en la clase hija... POLIMORFISMO");
    }
}*/

// class CocheElectrico extends CocheHPI { }
