package org.lp3.fabrica_abstrata;

public class InterfaceDoUsuario {
	
	private GUIAbstractFactory factory;
	private AbstractButton button;
	private AbstractWindow window;
	
	public InterfaceDoUsuario(GUIAbstractFactory factory) {
		this.factory = factory;
	}
	
	public void setFactory(GUIAbstractFactory factory) {
		this.factory = factory;
	}
	
	public void create_components() {
		this.button = factory.create_button();
		this.window = factory.create_window();
	}
	
	public void drawInterface() {
		button.draw();
		window.draw();
	}
}
