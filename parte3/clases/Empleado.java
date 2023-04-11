package parte3.clases;

public class Empleado {
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public Empleado(){

    }

    public String getClasificacion(){
        if(edad <= 21){
            return "Principiante";
        }
        if(edad <= 35){
            return "Intermedio";
        }
        return "Senior";
    }

    public void aumentarSalario(int porcentaje){
        this.salario += salario*(porcentaje/100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "\n" + nombre + "\n" + cedula + "\n" + edad + " años\nCasado:" + casado + "\nSalario" + salario;
    }
}
