
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga su nombre");
        String nombre = sc.nextLine();
        sc.close();
        boolean esString = (nombre != null && !nombre.matches("[0-9]"));
        if(esString) {
            Saludo s1 = new Saludo(nombre);
            System.out.println(s1.saludo());
            System.out.printf("Has creado %d saludos", s1.getSaludosTotales());
        }else{
            System.out.println("El nombre tiene numeros");
        }
    }
}
class Saludo{
    protected String nombre;
    private static int saludosTotales = 0;
    Saludo(String nombre){
        this.nombre = nombre;
        saludosTotales++;
    }
    public String saludo(){
        return String.format("Hola %s",nombre);
    }

    public static int getSaludosTotales() {
        return saludosTotales;
    }
}