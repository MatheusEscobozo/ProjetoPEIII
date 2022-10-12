package entidades;
import java.util.ArrayList;
public class Sala {
	ArrayList <Aluno> listaDeAlunos;
	
	public Sala() {
		this.listaDeAlunos = new ArrayList<>();
	}
	
	public void insereAluno(Aluno novoAluno) {
		listaDeAlunos.add(novoAluno);
	}
	
	public void listarAlunos() {
		System.out.println("Lista de alunos:");
		/*Para cada alunoNaLista faça*/
		for (Aluno alunoNaLista: listaDeAlunos) {
			alunoNaLista.listar();
			System.out.println("--------------------------------");
		}
	}
}
