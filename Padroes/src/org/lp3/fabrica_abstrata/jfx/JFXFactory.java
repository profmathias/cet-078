package org.lp3.fabrica_abstrata.jfx;

import org.lp3.fabrica_abstrata.AbstractButton;
import org.lp3.fabrica_abstrata.AbstractWindow;
import org.lp3.fabrica_abstrata.GUIAbstractFactory;

public class JFXFactory extends GUIAbstractFactory {

	@Override
	public AbstractWindow create_window() {
		return new JFXWindow();
	}

	@Override
	public AbstractButton create_button() {
		return new JFXButton();
	}

}
