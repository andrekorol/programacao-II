import com.google.common.primitives.Floats; // https://github.com/google/guava

public class Cabeca {
    float comprimento;
    float altura;
    float largura;
    boolean viva;

    // Constructor
    public Cabeca(float comprimento, float altura, float largura, boolean viva) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.viva = viva;
    }

    private float volume() {
        return this.comprimento * this.altura * this.largura;
    }

    public String info() {
        return Floats.join("cm X ", this.comprimento, this.altura, this.largura) + "cm, volume = "
                + volume() + "cm³, está " + (this.viva ? "viva" : "morta");
    }

    public void arranca() {
        this.viva = false;
    }
}
