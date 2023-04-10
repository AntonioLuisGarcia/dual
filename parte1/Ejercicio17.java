import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        char letras[] = {'T','R','W','A','G','M','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su DNI");
        String dni = sc.nextLine();
        sc.close();

        char l = dni.charAt(dni.length() - 1);
        int suma = 0;
        String numeros = dni.substring(0,8);
        System.out.println(numeros);

        for(int i = 0 ; i < numeros.length() ; i ++){
            suma += (int)numeros.charAt(i);
        }

        System.out.println(suma);

        if(letras[suma%23] == l){
            System.out.println("DNI verificado");
        }else{
            System.out.println("DNI falso");
        }
    }
}
