public class Main {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.setAno(2020);
        carro.numeroPortas = 4;

        // Criando um objeto Moto
        Moto moto = new Moto();
        moto.marca = "Honda";
        moto.modelo = "CB 500F";
        moto.setAno(2022);
        moto.setCilindrada(500);

        // Exibindo as informações dos veículos
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }