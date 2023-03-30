import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println(empiezaPrograma(texto));
    }

    public static boolean empiezaPrograma(String texto){
        String programa = texto.substring(0,8);
        return programa.equals("programa");
    }
}
