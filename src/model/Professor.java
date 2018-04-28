package model;

import java.sql.Date;

public class Professor {
	private int idProfessor;
	private String Nome;
	private Date DataNasc;
	private String NomeMae;
	private int Titulacao;
	private int idDisciplina;
	
	public Professor(int idProfessor, String nome) {
		super();
		this.idProfessor = idProfessor;
		Nome = nome;
	}

	public Professor(int idProfessor, String nome, Date dataNasc, String nomeMae, int titulacao, int idDisciplina) {
		
		super();
		this.idProfessor = idProfessor;
		Nome = nome;
		DataNasc = dataNasc;
		NomeMae = nomeMae;
		Titulacao = titulacao;
		this.idDisciplina = idDisciplina;
	}
	
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Date getDataNasc() {
		return DataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		DataNasc = dataNasc;
	}
	public String getNomeMae() {
		return NomeMae;
	}
	public void setNomeMae(String nomeMae) {
		NomeMae = nomeMae;
	}
	public int getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(int titulacao) {
		Titulacao = titulacao;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	

}
