package com.jpro.application.bms.view.main;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainPanel extends JPanel{
	
	private JLabel test1label;
	private JScrollPane verticalPane;
	
	public MainPanel() {
		initComponents();
	}
	
	private void initComponents() {
		
		SummaryPanel summaryPanel = new SummaryPanel();
		
		verticalPane = new JScrollPane(summaryPanel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		
		setBackground(Color.white);
		
		test1label = new JLabel("testa");
		
		setSize(400, 600);
		add(test1label,BorderLayout.SOUTH);
		add(verticalPane,BorderLayout.CENTER);


		setBorder(BorderFactory.createTitledBorder(""));

	}

}
