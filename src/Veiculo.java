public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Método abstrato
    public abstract String informacoesVeiculo();

    // Getter para ano
    public int getAno() {
        return ano;
    }

    // Setter para ano
    public void setAno(int ano) {
        this.ano = ano;
    }
}