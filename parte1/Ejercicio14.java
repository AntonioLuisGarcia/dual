import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        sc.close();
        String textoInverso = "";
        for(int i = texto.length() - 1 ; i >= 0 ; i--){
            textoInverso += texto.charAt(i);
        }

        if(texto.equals(textoInverso)){
            System.out.println("Es un polindromo");
        }else{
            System.out.println("No es un polindromo");
        }
    }
}
