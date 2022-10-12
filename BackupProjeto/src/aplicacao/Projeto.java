package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entidades.Aluno;
import entidades.Sala;

public class Projeto {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		String nome, alunoSenha;
		int opc, alunoID, serie;
		Sala novaSala = new Sala();
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
				
				System.out.print("\nSérie:");
				serie = input.nextInt();
				
				novoAluno = new Aluno(nome, alunoID, alunoSenha, serie);
				
				novaSala.insereAluno(novoAluno);
				break;

			case 3:
				novaSala.listarAlunos();
				break;
			default:
			}
		} while (opc != 0);
		
		
		input.close();
		
	}
}
