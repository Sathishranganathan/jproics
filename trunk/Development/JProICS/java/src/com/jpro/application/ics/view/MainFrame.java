package com.jpro.application.ics.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JToolBar;

public class MainFrame {

	JFrame frame;

	public MainFrame() {

		frame = new JFrame("JPro");
		JToolBar toolbar = new JToolBar("Toolbar", JToolBar.VERTICAL);
		JButton cutbutton = new JButton("CUT");
		toolbar.add(cutbutton);
		JButton copybutton = new JButton("COPY");
		toolbar.add(copybutton);
		JButton pastebutton = new JButton("PASTE");
		toolbar.add(pastebutton);

		frame.getContentPane().add(toolbar, BorderLayout.WEST);
		frame.setUndecorated(true);
		frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 800);
		frame.setVisible(true);

		// Get the size of the screen
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

		// Determine the new location of the window
		int w = frame.getSize().width;
		int h = frame.getSize().height;
		int x = (dim.width - w) / 2;
		int y = (dim.height - h) / 2;

		// Move the window
		frame.setLocation(x, y);

	}

	public static void main(String[] args) {

		new MainFrame();

	}

}
