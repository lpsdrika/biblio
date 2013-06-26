package Trabalho;

import java.util.ArrayList;


// Classe Usu�rio
public class Usuario {
	// Atributos
	public String nome;
	public String sobrenome;
	public int cpf;
	public String sexo;
	public int dataNasc;
	public Endere�o endere�o;
	public ArrayList<Exemplar> listExEmp;
	// Costrutores
	public Usuario (String nome, String sobrenome, int cpf, String sexo, int dataNasc, Endere�o endere�o) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.endere�o = endere�o;
		this.listExEmp = new ArrayList<Exemplar>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Endere�o getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endere�o endere�o) {
		this.endere�o = endere�o;
	}

	public ArrayList<Exemplar> getlistExEmp() {
		return listExEmp;
	}

	public void setlistExEmp(ArrayList<Exemplar> listExEmp) {
		this.listExEmp = listExEmp ;
	}
	// M�todo que permite altera��o do endere�o do usu�rio
	public void altEnd (Endere�o e) {
		this.endere�o = e;
	}
	
	// M�todo que retorna uma lista de exemplares emprestados por este usu�rio
	public ArrayList<Exemplar> ExEmp (String ExEmp) {
		return listExEmp;
	}
	//M�todo que adiciona um livro a lista de exemplares emprestados
	public void emprestaExemplar(Exemplar e) {
		this.listExEmp.add(e);
	}
	
	// M�todo que retorna uma string, contendo uma descri��o completa dos dados do usu�rio
	public String dadosUsuario () {
		String usuario;
		usuario = new String ("nome:" + this.nome + "/n sobrenome:" + this.sobrenome + "/n CPF:" + this.cpf + "/n sexo" + this.sexo + "/n Data Nascimento:" + this.dataNasc + "/n Endere�o:" + this.endere�o);
		return usuario;	
	}
	// M�todo que retorna uma string, contendo uma descri��o completa dos daods do usu�rio e os livros por ele emprestado.
	public String dadosCompletos() {
		String usuario = this.dadosUsuario();
		usuario += "\nLista de Exemplares Emprestados: " + this.listExEmp;
		for (Exemplar exemplar : listExEmp) {
			usuario += exemplar.descri�ao();
		}
		return usuario;
	}
	
}
