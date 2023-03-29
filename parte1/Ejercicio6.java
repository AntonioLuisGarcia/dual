import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el lado1");
        float lado1 = sc.nextFloat();
        System.out.println("Introduzca el lado2");
        float lado2 = sc.nextFloat();
        System.out.println("Introduzca el lado3");
        float lado3 = sc.nextFloat();

        if(lado1 == lado2 && lado1 == lado3){
            System.out.println("Triangulo equilatero");
        }else if(lado1 != lado2 && (lado1 != lado3) && lado2 != lado3){
            System.out.println("Triangulo escaleno");
        }else{
            System.out.println("Triangulo isosceles");
        }
    }
}
