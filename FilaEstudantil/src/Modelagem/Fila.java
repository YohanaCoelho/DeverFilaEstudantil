package Modelagem;

import javax.swing.JOptionPane;

import Visao.Estudante;

public class Fila {

    private int inicio;
    private int fim;
    private int quantidadePessoas = 0;
    private final Estudante[] E;

    public Fila(int tamanho) {
        inicio = fim = -1;
        E = new Estudante[tamanho];
    }

    public boolean estaVazia(){
        if(quantidadePessoas == 0) {
            return true;
        }else{
            return false;
        }
    }

    public boolean estaCheia(){
        if(quantidadePessoas == -1) {
            return true;
        }else{
            return false;
        }
    }

    public void adiconarNaFila(Estudante estudante){
        if (!estaCheia()) {
            if (this.inicio == -1) {
                this.inicio = 0;
            }
            this.fim ++;
            this.E[fim] = estudante;
            this.quantidadePessoas ++;
        }
    }

    public void mostrarFila() {
        String pessoas = "";
        for(int i = this.inicio; i <= this.fim; i++) {
            pessoas  += this.E[i].getNome() + " idade: "+ this.E[i].getIdade() + "\n";
        }
        JOptionPane.showMessageDialog(null, pessoas);
    }

}

