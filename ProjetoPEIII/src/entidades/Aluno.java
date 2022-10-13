package entidades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Aluno {
	private int alunoID, serie, idade, codAluno;
	private String nome, alunoSenha;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, int alunoID, String alunoSenha, int serie, int idade, int codAluno) {
		this.nome = nome;
		this.alunoID = alunoID;
		this.alunoSenha = alunoSenha;
		this.serie = serie;
		this.idade = idade;
		this.codAluno = codAluno;
	}

	public int getAlunoID() {
		return alunoID;
	}

	public void setAlunoID(int alunoID) {
		this.alunoID = alunoID;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlunoSenha() {
		return alunoSenha;
	}

	public void setAlunoSenha(String alunoSenha) {
		this.alunoSenha = alunoSenha;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getCodAluno() {
		return codAluno;
	}
	
	public void listar() {
		try {
			File arquivo = new File("Cadastro Alunos.txt");
			FileWriter escrever = new FileWriter(arquivo, true);
			
			escrever.write(this.nome+", ");
			escrever.write(this.alunoID+", ");
			escrever.write(this.alunoSenha+", ");
			escrever.write(this.serie+", ");
			escrever.write(this.idade+", ");
			escrever.write(this.codAluno+"; \n");
			escrever.flush();
			escrever.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Nome: " + toString());
		System.out.println("ID: "+ this.alunoID);
		System.out.println("Senha: " + this.alunoSenha);
		System.out.println("Serie: "+ this.serie);
		System.out.println("Idade: "+ this.idade + " anos");
		System.out.println("Codigo: "+ this.codAluno);
		
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
	
	
}
