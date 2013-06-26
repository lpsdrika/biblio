package Trabalho;

public class Revista extends Exemplar {
	public String editora;
	public int numero;
	public float preço;
	public Revista (String titulo, String subtitulo, int ano, String disponbilidade, String usuario, String editora, int numero, float preço) {
		super (titulo, subtitulo, ano, disponibilidade, usuario);
		this.editora = editora;
		this.numero = numero;
		this.preço = preço;			
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
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	
}
