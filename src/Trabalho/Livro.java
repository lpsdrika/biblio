package Trabalho;

public class Livro extends Exemplar {
	public String autor;
	public String editora;
	public int edi�ao;
	public int volume;
	public Livro (String titulo, String subtitulo, int ano, boolean disponbilidade, String usuario, String autor, String editora, int edi�ao, int volume) {
		super (titulo, subtitulo, ano, disponibilidade, usuario);
		this.autor = autor;
		this.editora = editora;
		this.edi�ao = edi�ao;
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
	public int getEdi�ao() {
		return edi�ao;
	}
	public void setEdi�ao(int edi�ao) {
		this.edi�ao = edi�ao;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
