package de.bonprix.uis.vaadin.views;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import de.bonprix.uis.vaadin.VaadinUI;
import de.bonprix.vaadin.mvp.AbstractMvpView;
import de.bonprix.vaadin.mvp.MvpView;
import de.bonprix.vaadin.mvp.MvpViewPresenter;

@SpringView(name = VaadinRootViewImpl.VIEW_NAME, ui = {VaadinUI.class})
public class VaadinRootViewImpl extends AbstractMvpView<VaadinRootView.Observer> implements VaadinRootView {

	private static final long serialVersionUID = 1L;
	public static final String VIEW_NAME = "Root";
	
	@Resource
	private VaadinRootPresenter presenter;
	
    @PostConstruct
    void init() {
    	Label header = new Label(VaadinRootViewImpl.VIEW_NAME);
    	header.addStyleName("h1");
    		
    	Button showTestmessage = new Button("show notification", event -> presenter.showTestmessage());
        VerticalLayout mainLayout = new VerticalLayout(header, showTestmessage);
        mainLayout.setMargin(true);
        mainLayout.setSpacing(true);
        setCompositionRoot(mainLayout);
    }

	@Override
	public void enter(ViewChangeEvent event) {
		presenter.setView(this);
	}
  
}