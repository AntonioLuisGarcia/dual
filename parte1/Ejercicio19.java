package parte1;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ES0000120345030000067890 Ejemplo

        System.out.println("Diga el IBAN de su cuenta");
        String iban = sc.nextLine();

        String parte1 = iban.substring(0,4);
        String parte2 = iban.substring(4,24);

        char letra1 = parte1.charAt(0);
        char letra2 = parte1.charAt(1);

        int valorLetra1 = ((int)letra1) - 55;
        int valorLetra2 = ((int)letra2) - 55;

        String t = parte2 + valorLetra1 + valorLetra2 + "00";
        BigInteger n = new BigInteger(t);

        BigInteger auxiliar = n.mod(new BigInteger("97"));
        BigInteger numeroValido = new BigInteger("98").subtract(auxiliar);
        String numeros = (int)(numeroValido.doubleValue()) + "";

        if((int)(numeroValido.doubleValue()) < 10){
            numeros = "0"+ (int)(numeroValido.doubleValue());
        }

        String ibanFinal = parte1.substring(0,2) + numeros + parte2;
        System.out.println(ibanFinal);

        //Solucion: ES0700120345030000067890
    }
}
