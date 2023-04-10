package parte2.ejercicio3;

import parte2.ejercicio1.Cliente;
import parte2.ejercicio2.Empleado;

public class Orden {
    private String texto;
    private final Cliente emisor;
    private Empleado destinatario;
    private int dias;

    public Orden(String texto, Cliente emisor, Empleado destinatario, int dias) {
        this.texto = texto;
        this.emisor = emisor;
        this.destinatario = destinatario;
        this.dias = dias;
    }

    public void setDias(int dias){
        this.dias = dias;
    }

    public void setDestinatario(Empleado e){
        this.destinatario = e;
    }

    @Override
    public String toString(){
        return "Emisor:" + emisor + "\n" + texto + "\nTiempo: " + dias + " dias\n" + "Para: " + destinatario;

    }
}
