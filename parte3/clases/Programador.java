package parte3.clases;
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante){
        super(nombre,cedula,edad,casado,salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString(){
        return "\n" + getNombre() + "\n" + getCedula() + "\n" + getEdad() + " años\nCasado:" + isCasado() + "\nSalario" + getSalario() + "\nLineas de codigo por hora: " + lineasDeCodigoPorHora + "\nLenguaje dominante: " + lenguajeDominante ;
    }
}
