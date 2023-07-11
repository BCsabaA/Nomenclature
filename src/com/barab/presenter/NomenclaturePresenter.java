package com.barab.presenter;

import com.barab.view.MainFrame;
import com.barab.view.iViewListener;

public class NomenclaturePresenter implements iViewListener {

	private final MainFrame mainFrame;
	
	public NomenclaturePresenter(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		mainFrame.addListener(this);
	}

	@Override
	public void onTestButtonClicked() {
		System.out.println("Teszt gomb megnyomva!");
	}
	
	

}
