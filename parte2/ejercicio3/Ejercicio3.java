package parte2.ejercicio3;

import parte2.ejercicio1.Cliente;
import parte2.ejercicio2.Empleado;

public class Ejercicio3 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Antonio","García","Guerrero",18,"hombre");
        Empleado e1 = new Empleado("Jose Perez", 35, 1800);
        Orden o = new Orden("Quiero que me hagas una pagina web de ropa",c1,e1,10);

        System.out.println(o);
    }
}
