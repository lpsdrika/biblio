package Trabalho;

import java.util.ArrayList;


// Classe Usuário
public class Usuario {
	// Atributos
	public String nome;
	public String sobrenome;
	public int cpf;
	public String sexo;
	public int dataNasc;
	public Endereço endereço;
	public ArrayList<Exemplar> listExEmp;
	// Costrutores
	public Usuario (String nome, String sobrenome, int cpf, String sexo, int dataNasc, Endereço endereço) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNasc = dataNasc;
		this.endereço = endereço;
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

	public Endereço getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereço endereço) {
		this.endereço = endereço;
	}

	public ArrayList<Exemplar> getlistExEmp() {
		return listExEmp;
	}

	public void setlistExEmp(ArrayList<Exemplar> listExEmp) {
		this.listExEmp = listExEmp ;
	}
	// Método que permite alteração do endereço do usuário
	public void altEnd (Endereço e) {
		this.endereço = e;
	}
	
	// Método que retorna uma lista de exemplares emprestados por este usuário
	public ArrayList<Exemplar> ExEmp (String ExEmp) {
		return listExEmp;
	}
	//Método que adiciona um livro a lista de exemplares emprestados
	public void emprestaExemplar(Exemplar e) {
		this.listExEmp.add(e);
	}
	
	// Método que retorna uma string, contendo uma descrição completa dos dados do usuário
	public String dadosUsuario () {
		String usuario;
		usuario = new String ("nome:" + this.nome + "/n sobrenome:" + this.sobrenome + "/n CPF:" + this.cpf + "/n sexo" + this.sexo + "/n Data Nascimento:" + this.dataNasc + "/n Endereço:" + this.endereço);
		return usuario;	
	}
	// Método que retorna uma string, contendo uma descrição completa dos daods do usuário e os livros por ele emprestado.
	public String dadosCompletos() {
		String usuario = this.dadosUsuario();
		usuario += "\nLista de Exemplares Emprestados: " + this.listExEmp;
		for (Exemplar exemplar : listExEmp) {
			usuario += exemplar.descriçao();
		}
		return usuario;
	}
	
}
