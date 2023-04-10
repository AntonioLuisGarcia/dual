package parte2.ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Antonio","García","Guerrero",18,"hombre");
        Cliente c2 = new Cliente("Luis","García","Guillen",48,"hombre");

        System.out.println(c1);
        c2.saludo();
    }
}
