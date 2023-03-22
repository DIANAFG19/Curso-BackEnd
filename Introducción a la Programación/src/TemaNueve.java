public class TemaNueve {
    public static void main(String[] args) {
        // Creación de objeto de la Clase Cliente.
        Cliente cliente = new Cliente();
        cliente.nombre = "Víctor";
        cliente.edad = 20;
        cliente.telefono = "5511223344";
        cliente.credito = 15000;
        System.out.println("El cliente " + cliente.nombre + " que tiene " + cliente.edad + " años " +
                "con número teléfonico " + cliente.telefono + ", se le otorga un crédito de " + cliente.credito + " pesos.");

        // Creación de objeto de la Clase Trabajador.
        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Jesús";
        trabajador.edad = 35;
        trabajador.telefono = "5512345678";
        trabajador.salario = 20000;
        System.out.println("El trabajador " + trabajador.nombre + " que tiene " + trabajador.edad + " años " +
                "con número teléfonico " + trabajador.telefono + ", tiene un salario de " + trabajador.salario + " pesos mensual.");
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
