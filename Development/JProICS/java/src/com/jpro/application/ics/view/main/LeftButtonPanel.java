package com.jpro.application.bms.view.main;

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

	private JButton test1JButton;
	private JButton test2JButton;
	private JButton test3JButton;
	private JButton test4JButton;
	private JButton test5JButton;

	private JLabel test1label;

	public LeftButtonPanel() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {

		test1label = new JLabel("Testststasrasr");
		
		test1label.setBorder(BorderFactory.createTitledBorder("test"));

		test1JButton = new JButton();
		test2JButton = new JButton();
		test3JButton = new JButton();
		test4JButton = new JButton();
		test5JButton = new JButton();

		test1JButton.setPreferredSize(new Dimension(150, 50));
		test2JButton.setPreferredSize(new Dimension(150, 50));
		test3JButton.setPreferredSize(new Dimension(150, 50));
		test4JButton.setPreferredSize(new Dimension(150, 50));
		test5JButton.setPreferredSize(new Dimension(150, 50));

		setLayout(new GridBagLayout());

		GridBagConstraints c = new GridBagConstraints();

		c.fill = GridBagConstraints.NORTH;
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(10, 10, 10, 10);
		
		
		
		add(test1label, c);
		

		test1JButton.setText("Button");

		c.gridy = 1;
		add(test1JButton, c);

		c.gridy = 2;

		test2JButton.setText("Button 2");
		add(test2JButton, c);

		c.gridy = 3;

		test3JButton.setText("Button 3");

		add(test3JButton, c);

		c.gridy = 4;

		test4JButton.setText("Button 4");
		add(test4JButton, c);

		c.gridy = 5;

		test5JButton.setText("Button 5");
		add(test5JButton, c);

		setSize(200, 598);

		setBorder(BorderFactory.createTitledBorder(""));

	}
}
