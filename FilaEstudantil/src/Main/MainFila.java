package Main;

import javax.swing.JOptionPane;

import Modelagem.Fila;
import Visao.Estudante;

public class MainFila {
	public static void main(String[] args) {
    int tamanhoFila = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da fila:"));

    Fila fila = new Fila(tamanhoFila);

    // Adicionando estudantes à fila
    while (JOptionPane.showConfirmDialog(null, "Deseja adicionar um estudante à fila?") == JOptionPane.YES_OPTION) {
        String nome = JOptionPane.showInputDialog("Digite o nome do estudante:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do estudante:"));
        Estudante estudante = new Estudante(nome, idade);
        fila.adiconarNaFila(estudante);
    }
    
    // Mostrando a fila
    int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Opções",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] { "Mostrar estudantes", "Sair" },
            "Mostrar estudantes");

    switch (opcao) {
        case 0:
            fila.mostrarFila();
            break;
        case 1:
            JOptionPane.showMessageDialog(null, "Finalizando do programa.");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Opção não aceita.");
            break;
    }

}
}
