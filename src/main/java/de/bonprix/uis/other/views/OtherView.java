package de.bonprix.uis.other.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.bonprix.uis.other.OtherUI;

@SpringView(name = OtherView.VIEW_NAME, ui = { OtherUI.class })
public class OtherView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;

	public static final String VIEW_NAME = "Other";

	@PostConstruct
	void init() {
		Label header = new Label(OtherView.VIEW_NAME);
		header.addStyleName("h1");
		addComponent(header);
		addComponent(new Label(
				"This is a <i>root view</i> for the <i>OtherUI</i>, defined by the annotation <b>@SpringView(ui = { OtherUI.class })</b>.",
				ContentMode.HTML));
		setMargin(true);
		setSpacing(true);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// the view is constructed in the init() method()
	}
}