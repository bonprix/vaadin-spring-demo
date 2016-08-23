package de.bonprix.uis.other;

import com.vaadin.annotations.Theme;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.ui.ViewMenuUI;

@Theme("valo")
@SpringUI(path = OtherUI.PATH)
public class OtherUI extends ViewMenuUI {
	private static final long serialVersionUID = 1L;

	public static final String PATH = "/other";
}
