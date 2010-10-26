package com.jpro.application.ics.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LeftButtonPanel extends JPanel {

	public LeftButtonPanel() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		JButton button = new JButton();
		JButton button1 = new JButton();
		button.setPreferredSize(new Dimension(150,50));
		button1.setPreferredSize(new Dimension(150,50));
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.VERTICAL;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10,10,10,10);
		
		c.gridx = 1;
		button1.setText("Button");
		add(button1, c);
		
		c.gridy = 1;
		c.gridx = 0;
		
		c.gridx = 1;
		button.setText("Button 2");
		add(button, c);

		setSize(200, 598);
		
		setBorder(BorderFactory.createTitledBorder(""));

	}
}
