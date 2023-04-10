package parte2.ejercicio1;

public class Cliente {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String genero;


    public Cliente(String nombre, String apellido1, String apellido2, int edad, String genero) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.genero = genero;
    }

    public void saludo(){
        System.out.println("Hola yo soy " + nombre + " el cliente");
    }

    @Override
    public String toString(){
        return nombre + " " +  apellido1 + " " + apellido2 + " de " + edad + " años y de genero " + genero;
    }
}
