package Trabalho;

public class Revista extends Exemplar {
	public String editora;
	public int numero;
	public float pre�o;
	public Revista (String titulo, String subtitulo, int ano, String disponbilidade, String usuario, String editora, int numero, float pre�o) {
		super (titulo, subtitulo, ano, disponibilidade, usuario);
		this.editora = editora;
		this.numero = numero;
		this.pre�o = pre�o;			
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getPre�o() {
		return pre�o;
	}
	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}
	
}
