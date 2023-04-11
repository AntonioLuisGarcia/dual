package parte2.ejercicio7;

public class Etiqueta {
    private String etiqueta;
    private String texto;

    public Etiqueta(String etiqueta, String texto) {
        this.etiqueta = etiqueta;
        this.texto = texto;
    }

    @Override
    public String toString(){
        return "<" + etiqueta + ">" + texto + "</" + etiqueta + ">";
    }
}
