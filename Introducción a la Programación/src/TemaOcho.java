public class TemaOcho {
    public static void main(String[] args) {
        Persona1 persona = new Persona1();
        persona.setNombre("Diana");
        persona.setEdad(26);
        persona.setTelefono("5512345678");

        System.out.println("El nombre es " + persona.getNombre() + ", tiene " + persona.getEdad() +
                " años y su número de teléfono es " + persona.getTelefono() + ".");
    }
}

class Persona1 {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return telefono;
    }

}
