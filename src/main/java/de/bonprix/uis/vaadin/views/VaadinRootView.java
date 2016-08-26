package de.bonprix.uis.vaadin.views;

import de.bonprix.vaadin.mvp.MvpView;
import de.bonprix.vaadin.mvp.MvpViewObserver;

public interface VaadinRootView extends MvpView<VaadinRootView.Observer> {
	
	 public interface Observer extends MvpViewObserver {

		void showTestmessage();
	 }
}
