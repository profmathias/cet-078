package org.lp3.mvc;

public class LivroModel {
	
	private String titulo;
	private String autor;
	
	
	public LivroModel(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
}
