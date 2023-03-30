import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad 1:");
        int edad1 = sc.nextInt();
        System.out.println("Edad 2:");
        int edad2 = sc.nextInt();
        System.out.println("Edad 3:");
        int edad3 = sc.nextInt();
        sc.close();
        System.out.println(adolescente(edad1,edad2,edad3));
    }

    public static boolean adolescente(int e1, int e2, int e3){
        if(esAdolescente(e1)){
            return true;
        }
        if(esAdolescente(e2)){
            return true;
        }
        if(esAdolescente(e3)){
            return true;
        }
        return false;
    }

    public static  boolean esAdolescente(int e){
        return (e > 12 && e < 20);
    }
}
