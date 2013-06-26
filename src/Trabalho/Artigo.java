package Trabalho;

public class Artigo extends Exemplar {
	public String autores;
	public String universidade;
	public String editora;
	public Artigo (String titulo, String subtitulo, int ano, String disponbilidade, String usuario, String autores, String universidade, String editora) {
		super (titulo, subtitulo, ano, disponibilidade, usuario);
		this.autores = autores;
		this.universidade = universidade;
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getUniversidade() {
		return universidade;
	}
	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
