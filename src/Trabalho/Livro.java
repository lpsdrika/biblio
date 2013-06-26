package Trabalho;

public class Livro extends Exemplar {
	public String autor;
	public String editora;
	public int ediçao;
	public int volume;
	public Livro (String titulo, String subtitulo, int ano, boolean disponbilidade, String usuario, String autor, String editora, int ediçao, int volume) {
		super (titulo, subtitulo, ano, disponibilidade, usuario);
		this.autor = autor;
		this.editora = editora;
		this.ediçao = ediçao;
		this.volume = volume;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdiçao() {
		return ediçao;
	}
	public void setEdiçao(int ediçao) {
		this.ediçao = ediçao;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
