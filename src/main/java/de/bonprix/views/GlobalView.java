package de.bonprix.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView
public class GlobalView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;

	@PostConstruct
	void init() {
		Label header = new Label("global");
		header.addStyleName("h1");
		addComponent(header);
		addComponent(new Label("This is the <i>view</i> for all UIs, defined by the annotation <b>@SpringView</b>.<br/>"
				+ "By default it's gonna be added to any UI.<br/>", ContentMode.HTML));
		addComponent(new Label(
				"This is the <i>view</i> does not have a name so it gets generated out of the java classname (GlobalView => global)</b>.<br/>"
						+ "Each viewname has to be unique per UI it's connected to.",
				ContentMode.HTML));
		setMargin(true);
		setSpacing(true);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// the view is constructed in the init() method()
	}
}