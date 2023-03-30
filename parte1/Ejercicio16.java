package parte1;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga la altura, tiene que ser un numero impar");
        int altura = sc.nextInt();

        for(int i = 1 ; i <= altura/2 ; i++){
            for(int j = i ; j <= altura/2 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= altura ; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = altura/2 ; i >= 1 ; i--){
            for(int j = i ; j <= altura/2 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
