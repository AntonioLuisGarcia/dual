package parte1;

import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int)(Math.random()+15+1);
        for(int i = 0 ; i <= aleatorio ; i++){
            int n = (int)(Math.random()*100+1);
            if(n%2==0){
                System.out.println(n + " es par");
            }else{
                System.out.println(n + " es impar");
            }
        }
    }
}
