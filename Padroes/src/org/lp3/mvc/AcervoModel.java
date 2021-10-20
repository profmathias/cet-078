package org.lp3.mvc;

import java.util.ArrayList;

public class AcervoModel {
	
	ArrayList<LivroModel> livros = new ArrayList<LivroModel>();
	
	public ArrayList<LivroModel> getLivros() {
		return this.livros;
	}
}
