package aula;

import java.io.BufferedReader;

import javax.swing.JOptionPane;

public class Arquivo {
	int num_at = 0;
	final static String[] dados = new String[1000];
	
	public static void main(String[] args) throws Exception {
		int opcao = 0;
		
		while (opcao != 5) {
			
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"1 -INSERIR, 2 - ATUALIZAR, 3 - LISTAR, 4 - DELETAR E 5 - SAIR | Digite a opção desejada: "));

			if (opcao == 1) {
				//Gravação
				gravacao();
			} else if (opcao == 2) {
				//Atualizar
				int num_linha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da linha para alteração: "));
				int novo_num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo valor de i: "));
				atualizar(num_linha, novo_num);
			} else if (opcao == 3) {
				// Listar
				leitura();
			} else if (opcao == 4) {
				// Deletar
				int nlinha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da linha para exclusão: "));
				deletar(nlinha);
			}
		}
	}
	
	public static void gravacao() throws IOException {
		FileWrite arq = new FileWrite()
	}

}
