package de.bonprix.views;

import javax.annotation.PostConstruct;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(isDefault = true)
public class DefaultView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
    void init() {
    	Label header = new Label("default");
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