package org.lp3.mvc;

import java.util.ArrayList;

public class AcervoController {
	
	
	private AcervoModel acervo = new AcervoModel();
	
	
	public AcervoController(AcervoModel acervo) {
		this.acervo = acervo;
	}
	
	
	public void addLivro(String titulo, String autor) {
		this.acervo.getLivros().add(new LivroModel(titulo, autor));
	}
	
	public ArrayList<LivroModel> getLivros() {
		return this.acervo.getLivros();
	}
	

}
