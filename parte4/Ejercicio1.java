package parte4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Write a integer number");
            int number = sc.nextInt();
        }catch (Exception e){
            System.out.println("No es un entero");
        }finally {
            System.out.println("Por aqui siempre pasare");
        }
    }
}
