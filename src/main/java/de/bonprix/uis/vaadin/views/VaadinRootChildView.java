package de.bonprix.uis.vaadin.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.bonprix.uis.vaadin.VaadinUI;

@SpringView(name = VaadinRootChildView.VIEW_NAME, parentName = VaadinRootChildView.VIEW_PARENT_NAME, ui = {VaadinUI.class})
public class VaadinRootChildView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	
	public static final String VIEW_NAME = "Root Child";
	public static final String VIEW_PARENT_NAME = VaadinRootViewImpl.VIEW_NAME;

    @PostConstruct
    void init() {
    	Label header = new Label(VaadinRootChildView.VIEW_NAME);
    	header.addStyleName("h1");
        addComponent(header);
        setMargin(true);
        setSpacing(true);
    }

    @Override
    public void enter(ViewChangeEvent event) {
        // the view is constructed in the init() method()
    }
}