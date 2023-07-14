package com.barab.view;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {

	private List<iViewListener> listeners;
	
	private JPanel contentPane;
	private JTable tableDenominations;
	private JTextField textField;
	private JTextField textfSearchDenominations;
	private JTable tableItemProperties;
	private JLabel lblNewLabel;

	public MainFrame() {
		
		setMinimumSize(new Dimension(1440, 510));
		
		listeners = new ArrayList<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 984, 510);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(1200, 425));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableDenominations = new JTable();
		tableDenominations.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableDenominations.setBounds(10, 50, 250, 328);
		contentPane.add(tableDenominations);
		
		textfSearchDenominations = new JTextField("");
		textfSearchDenominations.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textfSearchDenominations.setBackground(new Color(230, 230, 230));
			}
			@Override
			public void focusLost(FocusEvent e) {
				textfSearchDenominations.setBackground(new Color(255, 255, 255));
			}
		});
		textfSearchDenominations.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (!textfSearchDenominations.hasFocus()) {
					textfSearchDenominations.setBackground(new Color(230, 230, 230));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if (!textfSearchDenominations.hasFocus()) {
					textfSearchDenominations.setBackground(new Color(255, 255, 255));
				}
			}
		});
		textfSearchDenominations.setOpaque(true);
		textfSearchDenominations.setBackground(new Color(255, 255, 255));
		textfSearchDenominations.setToolTipText("keresés");
		textfSearchDenominations.setBounds(10, 10, 250, 30);
		contentPane.add(textfSearchDenominations);
		
		tableItemProperties = new JTable();
		tableItemProperties.setBounds(353, 90, 265, 288);
		contentPane.add(tableItemProperties);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/com/barab/resource/add_box_FILL0_wght400_GRAD0_opsz20.png")));
		lblNewLabel.setBounds(260, 50, 20, 20);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(353, 50, 265, 30);
		contentPane.add(comboBox);
		
		JLabel labelItemDenomination = new JLabel("New label");
		labelItemDenomination.setBounds(353, 10, 265, 30);
		contentPane.add(labelItemDenomination);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(628, 50, 332, 328);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(662, 10, 265, 30);
		contentPane.add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(983, 10, 414, 371);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(103, 2, 5, 5));
		
		
		
		JLabel lbl1 = new JLabel("1");
		panel.add(lbl1,0,0);
		
		JLabel lbl2 = new JLabel("2");
		panel.add(lbl2,1,0);
		JLabel lbl3 = new JLabel("3");
		panel.add(lbl3,0,1);
		JLabel lbl4 = new JLabel("4");
		panel.add(lbl4,1,1);
		JLabel lbl5 = new JLabel("5");
		panel.add(lbl5,0,2);
		JLabel lbl6 = new JLabel("6");
		panel.add(lbl6,1,2);
		
		
		
		
		
				
//		JComboBox comboBox_2 = new JComboBox();
//		panel.add(comboBox_2,1,0);
//		
		this.setVisible(true);
	}

	public void addListener(iViewListener listener) {
		listeners.add(listener);
	}
}
