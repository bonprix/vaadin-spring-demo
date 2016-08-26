package de.bonprix.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Page;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import de.bonprix.uis.other.OtherUI;
import de.bonprix.uis.other.views.OtherView;
import de.bonprix.uis.vaadin.VaadinUI;
import de.bonprix.uis.vaadin.views.VaadinRootChildView;
import de.bonprix.uis.vaadin.views.VaadinRootView;
import de.bonprix.uis.vaadin.views.VaadinRootViewImpl;

@SpringView(isDefault = true)
public class DefaultView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;

	@PostConstruct
	void init() {
		Label header = new Label("default");
		header.addStyleName("h1");
		addComponent(header);
		addComponent(new Label(
				"This is the <i>default view</i> for all UIs, defined by the annotation <b>@SpringView(isDefault = true)</b>.<br/>"
						+ "Per UI there can be only one default View defined, but you dont have to set any<br/>"
						+ "If you want to have different default Views for different UIs you can by setting the default view only for the VaadinUI with this parameters <b>@SpringView(isDefault = true, ui = { VaadinUI.class })</b>.",
				ContentMode.HTML));
		addComponent(new Label(
				"This is the <i>view</i> does not have a name so it gets generated out of the java classname (DefaultView => default)</b>.<br/>"
						+ "Each viewname has to be unique per UI it's connected to.",
				ContentMode.HTML));
		Label otherInterestingViewsLabel = new Label("Other interesting views");
		otherInterestingViewsLabel.addStyleName("h2");
		addComponent(otherInterestingViewsLabel);
		addComponent(new Button("Navigate to global", event -> getUI()	.getNavigator()
																		.navigateTo("global")));
		if (UI.getCurrent() instanceof VaadinUI) {
			addComponent(new Button("Navigate to " + VaadinRootViewImpl.VIEW_NAME, event -> getUI()	.getNavigator()
																								.navigateTo(VaadinRootViewImpl.VIEW_NAME)));
			addComponent(new Button("Navigate to " + VaadinRootChildView.VIEW_NAME, event -> getUI().getNavigator()
																									.navigateTo(VaadinRootChildView.VIEW_NAME)));
		} else if (UI.getCurrent() instanceof OtherUI) {
			addComponent(new Button("Navigate to " + OtherView.VIEW_NAME, event -> getUI()	.getNavigator()
																							.navigateTo(OtherView.VIEW_NAME)));
		}

		Label otherUIs = new Label("Other UIs");
		otherUIs.addStyleName("h2");
		addComponent(otherUIs);
		if (UI.getCurrent() instanceof VaadinUI) {
			addComponent(new Button("Navigate to OtherUI", event -> Page.getCurrent()
																		.open(OtherUI.PATH, null)));
		} else if (UI.getCurrent() instanceof OtherUI) {
			addComponent(new Button("Navigate to VaadinUI", event -> Page	.getCurrent()
																			.open(VaadinUI.PATH, null)));
		}

		setMargin(true);
		setSpacing(true);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// the view is constructed in the init() method()
	}
}