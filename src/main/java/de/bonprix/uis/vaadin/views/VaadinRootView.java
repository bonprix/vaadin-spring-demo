package de.bonprix.uis.vaadin.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.bonprix.uis.vaadin.VaadinUI;

@SpringView(name = VaadinRootView.VIEW_NAME, ui = {VaadinUI.class})
public class VaadinRootView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	
	public static final String VIEW_NAME = "Root";

    @PostConstruct
    void init() {
    	Label header = new Label(VaadinRootView.VIEW_NAME);
    	header.addStyleName("h1");
        addComponent(header);
        addComponent(new Button("Navigate to " + VaadinRootChildChildView.VIEW_NAME, event -> getUI().getNavigator().navigateTo(VaadinRootChildChildView.VIEW_NAME)));
        setMargin(true);
        setSpacing(true);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}