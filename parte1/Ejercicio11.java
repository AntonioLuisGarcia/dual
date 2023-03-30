import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String ultimaLetra = texto.substring(texto.length() - 1);
        System.out.println(ultimaLetra + texto);

    }
}
