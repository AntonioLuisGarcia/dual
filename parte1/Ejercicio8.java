import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga un numero");
        int numero = sc.nextInt();
        sc.close();
        System.out.println((numero>27)?numero-27:(27-numero)*2);
    }
}
