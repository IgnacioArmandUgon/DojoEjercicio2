package domain;

public class Mensaje {
    private Texto texto;

    public Mensaje(Texto texto) {
        this.texto = texto;
    }

    public Texto getMensaje() {
        return texto;
    }

    public void actualizarTexto(Texto texto){
        this.texto = texto;
    }
}