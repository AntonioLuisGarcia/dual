package parte2.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas palabras vas a decir");
        int n = sc.nextInt();
        sc.nextLine();
        String cadena = "";

        for(int i = 0 ; i < n ; i ++){
            cadena += sc.nextLine();
        }

        System.out.println(cadena);
    }
}
