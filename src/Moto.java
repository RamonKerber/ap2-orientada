public class Moto extends Veiculo {
    private int cilindrada;

    // Getter e Setter para cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca +
               ", Modelo: " + modelo +
               ", Ano: " + getAno() +
               ", Cilindrada: " + cilindrada + "cc";
    }
}