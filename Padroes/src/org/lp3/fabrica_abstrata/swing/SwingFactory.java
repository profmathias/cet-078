package org.lp3.fabrica_abstrata.swing;

import org.lp3.fabrica_abstrata.AbstractButton;
import org.lp3.fabrica_abstrata.AbstractWindow;
import org.lp3.fabrica_abstrata.GUIAbstractFactory;

public class SwingFactory extends GUIAbstractFactory {

	@Override
	public AbstractWindow create_window() {
		return new SwingWindow();
	}

	@Override
	public AbstractButton create_button() {
		return new SwingButton();
	}

}
