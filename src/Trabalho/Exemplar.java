package Trabalho;

//Classe Exemplar
public class Exemplar {
	//Atributos
	public String titulo;
	public String subtitulo;
	public int ano;
	public boolean disponibilidade;
	public Usuario usuario;
	//Costrutores
	public Exemplar (String titulo, String subtitulo, int ano, boolean disponbilidade) {
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.ano = ano;
		this.disponibilidade = true ;
		this.usuario = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	// M�todo que permite realiza��o de um empr�stimo do exemplar
	public boolean emp (Usuario u) {
		this.disponibilidade = false;
		this.usuario = u;
		u.emprestaExemplar(this);
		return disponibilidade;
	}
	// M�todo que permite a devolu��o do exemplar
	public boolean emp () {
		this.disponibilidade = true;
		return disponibilidade;
	}
	// M�todo que diz se um exemplar esta emprestado ou n�o
	public String empOuNao () {
		if (this.disponibilidade == true) {
			return "Disponivel";
		}
		else {
			return "Emprestado";
		}
	}
	// M�todo que retorna, caso o exemplar, esteja emprestado, o usu�rio que emprestou
	public String usuarioEmp (Usuario u) {
		if (this.disponibilidade == true) {
			return ;
		}
	}

	public String descri�ao() {
		String descri�ao;
		descri�ao = new descri�ao ("T�tulo:" + this.titulo + "/n Subtitulo:" + this.subtitulo + "/n Ano:" + this.ano + "/n Disponibilidade:" + this.disponibilidade + "/n Usu�rio:" + this.usuario);
		return descri�ao;
	}
}
