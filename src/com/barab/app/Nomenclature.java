package com.barab.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.barab.presenter.NomenclaturePresenter;
import com.barab.view.MainFrame;

public class Nomenclature {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nomenclature window = new Nomenclature();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Nomenclature() {
		MainFrame mainFrame = new MainFrame();
		NomenclaturePresenter presenter = new NomenclaturePresenter(mainFrame);
	}

}
