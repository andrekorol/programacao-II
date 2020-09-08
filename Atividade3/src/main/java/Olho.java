public class Olho {
    String cor;
    boolean aberto;

    // Constructor
    public Olho(String cor, boolean aberto) {
        this.cor = cor;
        this.aberto = aberto;
    }

    public String info() {
        return String.join(" ", "Olho", this.cor, "está", (this.aberto ? "aberto" : "fechado"));
    }

    public void mudaCor(String novaCor) {
        this.cor = novaCor;
    }

    public void abre() {
        this.aberto = true;
    }

    public void fecha() {
        this.aberto = false;
    }
}
