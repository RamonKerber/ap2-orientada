# 🚗 Sistema de Gerenciamento de Veículos


Este projeto é uma **atividade avaliativa de Programação Java** que implementa um sistema simples de gerenciamento de veículos, utilizando **orientação a objetos**, **herança**, **classes abstratas** e **métodos de acesso**.

---

## 📂 Estrutura do Projeto

O projeto contém quatro classes principais:

### 🏎️ `Veiculo` (Classe Abstrata)

Classe base para todos os veículos, definindo atributos comuns e um método abstrato que deve ser implementado pelas subclasses.

**Atributos:**
- `marca` (público) – Marca do veículo.
- `modelo` (público) – Modelo do veículo.
- `ano` (privado) – Ano de fabricação do veículo.

**Métodos:**
- `public abstract String informacoesVeiculo()` – Retorna informações do veículo.
- `public int getAno()` – Retorna o ano do veículo.
- `public void setAno(int ano)` – Define o ano do veículo.

---

### 🚘 `Carro` (Subclasse de `Veiculo`)

Representa veículos do tipo carro e adiciona um atributo específico.

**Atributos:**
- `numeroPortas` (público) – Número de portas do carro.

**Métodos:**
- `informacoesVeiculo()` – Implementa o método abstrato da classe `Veiculo` e retorna todas as informações do carro, incluindo o número de portas.

---

### 🏍️ `Moto` (Subclasse de `Veiculo`)

Representa veículos do tipo moto e adiciona um atributo específico.

**Atributos:**
- `cilindrada` (privado) – Cilindrada da moto (em cc).

**Métodos:**
- `getCilindrada()` / `setCilindrada(int cilindrada)` – Métodos de acesso para a cilindrada.
- `informacoesVeiculo()` – Implementa o método abstrato da classe `Veiculo` e retorna todas as informações da moto, incluindo a cilindrada.

---

### 🖥️ `Main` (Classe de Execução)

Classe principal que cria instâncias de `Carro` e `Moto`, define seus atributos e imprime suas informações.

**Exemplo de execução:**
```java
Carro carro = new Carro();
carro.marca = "Toyota";
carro.modelo = "Corolla";
carro.setAno(2020);
carro.numeroPortas = 4;

Moto moto = new Moto();
moto.marca = "Honda";
moto.modelo = "CB 500F";
moto.setAno(2022);
moto.setCilindrada(500);

System.out.println(carro.informacoesVeiculo());
System.out.println(moto.informacoesVeiculo());
