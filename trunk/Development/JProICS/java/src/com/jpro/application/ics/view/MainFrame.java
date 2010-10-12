package com.jpro.application.ics.view;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
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
	}

	public static void main(String[] args) {

		new MainFrame();

	}

}
