package parte4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result = division(a,b );
        } catch (PersoException e) {
            System.out.println(e.getMessage());
        }
            System.out.println(result);
    }

    public static int suma(int a, int b)throws PersoException{

        int suma = 0;

        try{
            suma = a + b;
        }catch (Exception e){
            throw new PersoException("Fallo con los numeros");
        }finally {
            return suma;
        }
    }

    public static int division(int a, int b)throws PersoException{

        int total = 0;

        try{
            total = a / b;
        }catch (Exception e){
            throw new PersoException("Fallo con los numeros");
        }
        return total;
    }
}
