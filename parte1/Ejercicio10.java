import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        sc.close();

        if(numero < 111 && numero > 89){
            System.out.println("True");
        }else if(numero < 211 && numero > 189){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
