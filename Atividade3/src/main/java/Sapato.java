public class Sapato {
    String marca;
    String modelo;
    String cor;
    float preco;

    // Constructor
    public Sapato(String marca, String modelo, String cor, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public String info() {
        return String.join(" ", this.marca, this.modelo, this.cor) + " R$ " + this.preco;
    }

    public void atualizaPreco(float novoPreco) {
        this.preco = novoPreco;
    }
}
