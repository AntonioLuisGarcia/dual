import  java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una cadena de texto y numeros");
        String cadena = sc.nextLine();
        sc.close();

        for (int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            if ((int)c > 47 && (int)c < 58) {
                System.out.print(c + ", ");
            }
        }
    }
}
