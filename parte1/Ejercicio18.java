import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga el numero de su Banco:");
        int numeroBanco = sc.nextInt();
        System.out.println("Diga el numero de su Sucursal:");
        int numeroSucursal = sc.nextInt();
        System.out.println("Diga el numero de Control:");
        int numeroControl = sc.nextInt();
        System.out.println("Diga el numero de Cuenta:");
        int numeroCuenta = sc.nextInt();
        sc.close();

        Cuenta cuenta1 = new Cuenta(numeroBanco,numeroSucursal,numeroControl,numeroCuenta);
        if(cuenta1.validarCuenta()){
            System.out.println("La cuenta es correcta");
        }else{
            System.out.println("La cuenta no es correcta");
        }
    }
}

class Cuenta{
    private int banco;
    private int sucursal;
    private int digitosControl;
    private int numeroCuenta;

    Cuenta(int banco, int sucursal, int digitosControl, int numeroCuenta){
        this.banco = banco;
        this.sucursal = sucursal;
        this.digitosControl = digitosControl;
        this.numeroCuenta = numeroCuenta;
    }

    public int validarBanco(){

        int suma = primerDigito(banco,4)*4;
        banco = quitarPrimerDigito(banco,4);
        suma += primerDigito(banco,3)*8;
        banco = quitarPrimerDigito(banco,3);
        suma += primerDigito(banco,2)*5;
        banco = quitarPrimerDigito(banco,2);
        suma += primerDigito(banco,1)*10;

        return suma;
    }

    public int validarSucursal(){

        int suma = (sucursal%1000)*9;
        sucursal = sucursal - (sucursal%1000)*1000;
        suma += (sucursal%100)*7;
        sucursal = sucursal - (sucursal%100)*100;
        suma += (sucursal%10)*3;
        sucursal = sucursal - (sucursal%10)*6;
        suma += (sucursal%1)*10;

        return suma;
    }

    public int validarNumVuenta(){
        int valores[] = {1,2,4,8,5,10,9,7,3,6};
        int suma = 0;

        for(int i = 0 ; i < 10 ; i++){
            suma += primerDigito(this.numeroCuenta,10-i)*valores[i];
            quitarPrimerDigito(this.numeroCuenta,10-i);
        }

        return suma;
    }

    public boolean validarCuenta(){
        int primerDigito = (validarBanco() + validarSucursal())%11;
        if(primerDigito == 10){
            primerDigito = 1;
        }else if(primerDigito == 11){
            primerDigito = 0;
        }

        int segundoDigito = 11-(validarNumVuenta()%11);
        if(segundoDigito == 10){
            segundoDigito = 1;
        }else if(segundoDigito == 11){
            segundoDigito = 0;
        }

        if(primerDigito(digitosControl,2) == primerDigito){
            int auxiliar = quitarPrimerDigito(digitosControl,2);
            if(auxiliar == segundoDigito){
                return true;
            }
        }

        return false;
    }

    private static int primerDigito(int numero,int longitud){
        int multiplo = 1;
        for(int i = 1 ; i < longitud ; i++){
            multiplo *= 10;
        }
        return numero%multiplo;
    }

    private static int quitarPrimerDigito(int numero, int longitud){
        int multiplo = 1;
        for(int i = 1 ; i < longitud ; i++){
            multiplo *= 10;
        }
        return numero - (numero%multiplo)*multiplo;
    }

}
