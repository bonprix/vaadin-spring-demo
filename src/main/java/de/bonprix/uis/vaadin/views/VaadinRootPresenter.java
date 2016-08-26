package de.bonprix.uis.vaadin.views;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.ui.Notification;

import de.bonprix.vaadin.mvp.AbstractMvpPresenter;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class VaadinRootPresenter extends AbstractMvpPresenter<VaadinRootView> implements VaadinRootView.Observer{

	private VaadinRootView view;

	@Override
	public void showTestmessage(){
		Notification.show("a notification");
	}

	@Override
	public void onViewEnter() {
		
	}

	@Override
	public void setView(VaadinRootView view) {
		this.view = view;
	}

}
