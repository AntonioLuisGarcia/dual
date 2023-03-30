package parte1;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 5 numeros");
        int array[] = new int[5];
        int suma = 0;
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Numero:");
            try{
                array[i] = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException n){
                System.out.println("El parametro " + (i+1) + " no es un numero");
            }
            suma += array[i];
        }
        sc.close();
        System.out.println("La suma es " + suma);
    }

}
