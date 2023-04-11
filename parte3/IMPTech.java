package parte3;

import parte3.clases.Empleado;
import parte3.clases.Programador;

import java.util.ArrayList;
import java.util.Scanner;

public class IMPTech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eleccion = 0;
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Programador> programadores = new ArrayList<>();
        String nombre = "";
        String cedula = "";
        int edad = 0;
        int casadO = 0;
        boolean casado = true;
        double salario = 0;
        int lineasDeCodigoPorHora = 0;
        String lenguajeDominante = "";

        do{
            System.out.println("1. Añadir Empleado\n2. Añadir Programador\n3. Mostrar empleados\n4. Mostrar programadores\n5. Salir");
            eleccion = Integer.parseInt(sc.nextLine());

            switch (eleccion){
                case 1:
                    System.out.println("Nombre y Apellidos:");
                    nombre = sc.nextLine();
                    System.out.println("Cedula:");
                    cedula = sc.nextLine();

                    do {
                        System.out.println("Edad (18-45)");
                        edad = Integer.parseInt(sc.nextLine());
                    }while(edad < 18 || edad > 45);

                    do {
                        System.out.println("Casado(1.Si 2.No)");
                        casadO = Integer.parseInt(sc.nextLine());
                    }while(casadO != 1 && casadO != 2);

                    if(casadO == 1){
                        casado = true;
                    }else{
                        casado = false;
                    }

                    System.out.println("Salario:");
                    salario = Double.parseDouble(sc.nextLine());
                    empleados.add(new Empleado(nombre,cedula,edad,casado,salario));
                break;

                case 2:
                    System.out.println("Nombre y Apellidos:");
                    nombre = sc.nextLine();
                    System.out.println("Cedula:");
                    cedula = sc.nextLine();
                    do {
                        System.out.println("Edad (18-45)");
                        edad = Integer.parseInt(sc.nextLine());
                    }while(edad < 18 || edad > 45);

                    do {
                        System.out.println("Casado(1.Si 2.No)");
                        casadO = Integer.parseInt(sc.nextLine());
                    }while(casadO != 1 && casadO != 2);

                    if(casadO == 1){
                        casado = true;
                    }else{
                        casado = false;
                    }

                    System.out.println("Salario:");
                    salario = Double.parseDouble(sc.nextLine());
                    System.out.println("Lineas de Codigo por hora:");
                    lineasDeCodigoPorHora = Integer.parseInt(sc.nextLine());
                    System.out.println("Lenguaje dominante");
                    lenguajeDominante = sc.nextLine();
                    programadores.add(new Programador(nombre,cedula,edad,casado,salario,lineasDeCodigoPorHora,lenguajeDominante));
                break;

                case 3:
                    System.out.println(empleados);
                break;

                case 4:
                    System.out.println(programadores);
                break;
            }
        }while(eleccion != 5);
    }
}
