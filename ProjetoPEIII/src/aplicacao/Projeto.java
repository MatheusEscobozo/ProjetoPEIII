package aplicacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import entidades.Aluno;
import entidades.Sala;

public class Projeto {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		String nome, alunoSenha;
		int opc, alunoID, serie, idade, codAluno;
		Sala novaLista = new Sala();
		Aluno novoAluno = new Aluno();
		
		do {
			System.out.println("------ Escolha alguma das opções ------");
			System.out.println("1 - Login");
			System.out.println("2 - Cadastro");
			System.out.println("3 - Listar cadastros");
			System.out.println("0 - Finalizar programa");
			System.out.println("----------------------------------------");
			opc = input.nextInt();
					
			switch(opc) {
			case 1:	
				System.out.print("\nID:");
				System.out.print("\nSenha:");
				break;
			case 2:	
				input.nextLine();
				System.out.print("\nNome:");
				nome = input.nextLine();
				
				System.out.print("\nSenha:");
				alunoSenha = input.nextLine();
				
				System.out.print("\nID:");
				alunoID = input.nextInt();
				
				System.out.print("\nIdade:");
				idade = input.nextInt();
				
				System.out.print("\nSérie:");
				serie = input.nextInt();
				
				
				novoAluno = new Aluno(nome, alunoID, alunoSenha, serie, idade, codAluno=1);
				
				try {
					File arquivo = new File("Cadastro Alunos.txt");
					FileWriter escrever = new FileWriter(arquivo, true);
					
					escrever.write(nome+", ");
					escrever.write(alunoID+", ");
					escrever.write(alunoSenha+", ");
					escrever.write(serie+", ");
					escrever.write(idade+", ");
					escrever.write(codAluno+"; \n");
					escrever.flush();
					escrever.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				novaLista.insereAluno(novoAluno);
				break;

			case 3:
				novaLista.listarAlunos();
				break;
			default:
			}
		} while (opc != 0);
		input.close();
	}
}
