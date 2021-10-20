package org.lp3.mvc;

public class Main {

	public static void main(String[] args) {
		
		AcervoModel acervoModel = new AcervoModel();
		AcervoController controller = new AcervoController(acervoModel);
		AcervoView view = new AcervoView(controller);
		
		view.menu();
		
	}
	
}
