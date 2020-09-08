public class Carro {
    String marca;
    String modelo;
    short anoFabricacao;
    String placa;
    boolean licenciado;

    // Constructor
    public Carro(String marca, String modelo, short anoFabricacao, String placa, boolean licenciado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
        this.licenciado = licenciado;
    }

    public String info() {
        return this.modelo + ", da " + this.marca + ", ano " + this.anoFabricacao
                + ", placa " + this.placa + ", " + (this.licenciado ? "" : "nao ")
                + "esta licenciado.";
    }

    public void atualizaLicenciamento() {
        this.licenciado = !this.licenciado;
    }

    public void atualizaPlaca(String novaPlaca) {
        this.placa = novaPlaca;
    }
}
