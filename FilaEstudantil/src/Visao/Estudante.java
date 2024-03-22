package Visao;

public class Estudante {

    String nome;
    int idade;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Estudante setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }

    public Estudante setIdade(int idade) {
        this.idade = idade;
        return this;
    }

}
