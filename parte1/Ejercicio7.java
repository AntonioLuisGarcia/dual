import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        int contador = 0;
        sc.close();

        for(int i = 0 ; i < texto.length() ; i++){
            char c = (texto.charAt(i));
            c = Character.toUpperCase(c);
            if (Character.toString(c).matches("A") || Character.toString(c).matches("E") || Character.toString(c).matches("I") || Character.toString(c).matches("O") || Character.toString(c).matches("U")) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " bocales");
    }
}
