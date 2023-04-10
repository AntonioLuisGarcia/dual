package parte2.ejercicio5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga una palabra");
        String palabra = sc.nextLine();
        System.out.println("Diga un numero");
        int nveces = Integer.parseInt(sc.nextLine());

        for(int i = 0 ; i < nveces ; i ++){
            if(i != nveces-1)
                System.out.print(palabra + "-");
            else{
                System.out.print(palabra);
            }
        }
    }
}
