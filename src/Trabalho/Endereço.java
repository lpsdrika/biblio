package Trabalho;

//Classe Endereço
public class Endereço {
	//Atributos
	public String logradouro;
	public String nome;
	public String complemento;
	public String bairro;
	public int cep;
	public String cidade;
	public String estado;
	public String pais;
	
	//Construtores
	public Endereço (String logradouro, String nome, String complemento, String bairro, int cep, String cidade, String estado, String pais) {
		this.logradouro = logradouro;
		this.nome = nome;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	//Método que retorna uma String, com a descrição completa do endereço
	public String dadosEndereço () {
		String endereço;
		endereço = new String ("Logradouro:" + this.logradouro + "/n nome:" + this.nome + "/n Complemento:" + this.complemento + "/n Bairro:" + this.bairro + "/n CEP:" + this.cep + "/n Cidade:" + this.cidade + "/n Estado:" + this.estado + "/n País:" + this.pais);
		return endereço;	
	}
	
}
