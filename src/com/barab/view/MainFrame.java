package com.barab.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private List<iViewListener> listeners;
	
	private JPanel contentPane;

	public MainFrame() {
		
		listeners = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTest = new JButton("Test");
		btnTest.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notifyOnTestButtonClicked();
			}
		});
		btnTest.setBounds(10, 10, 85, 21);
		contentPane.add(btnTest);
		this.setVisible(true);
	}
	
	protected void notifyOnTestButtonClicked() {
		for (iViewListener listener : listeners) {
			listener.onTestButtonClicked();
		}
	}

	public void addListener(iViewListener listener) {
		listeners.add(listener);
	}
}
