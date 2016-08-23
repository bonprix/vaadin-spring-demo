package de.bonprix.uis.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.ui.ViewMenuUI;

@Theme("valo")
@SpringUI(path = VaadinUI.PATH)
public class VaadinUI extends ViewMenuUI {
	private static final long serialVersionUID = 1L;

	public static final String PATH = "/";
}
