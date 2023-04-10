package parte2.ejercicio2;

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public double dineroGenerado(int dias){
        return sueldo*dias/30;
    }

    public String programar(){
        return "Ahora voy a programar";
    }

    @Override
    public String toString(){
        return nombre + " de " + edad + " años y con sueldo de " +sueldo;
    }
}
