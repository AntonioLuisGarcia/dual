package parte2.ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Jose Perez", 35, 1800.5);
        Empleado e2 = new Empleado("Luis Fernadez", 48, 2400.3);

        System.out.println(e1);
        System.out.println("He ganado en 20 dias " + e1.dineroGenerado(20));
        System.out.println(e2.programar());
    }
}
