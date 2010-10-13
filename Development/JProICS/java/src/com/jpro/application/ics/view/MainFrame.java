package com.jpro.application.ics.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MainFrame {

	private JFrame frame;
	private JMenuBar bar;
	private JMenu mnuFile;

	private JMenuItem newMenuItem1;

	public MainFrame() {

		frame = new JFrame("JPro");

		// Creating the MenuBar For Displaying All the Menus of Program.

		bar = new JMenuBar(); // Creating the MenuBar Object.
		frame.setJMenuBar(bar); // Setting Main Window MenuBar.

		mnuFile = new JMenu("File");
		mnuFile.setMnemonic((int) 'F');
		createFileMenu(mnuFile);

		bar.add(mnuFile);

		JToolBar toolbar = new JToolBar("Toolbar", JToolBar.VERTICAL);
		JButton button1 = new JButton("Test 1");
		toolbar.add(button1);
		JButton button2 = new JButton("Test 2");
		toolbar.add(button2);
		JButton button3 = new JButton("Test 3");
		toolbar.add(button3);

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

	private void createFileMenu(JMenu mnuFile2) {

		newMenuItem1 = new JMenuItem("New");
		newMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
				Event.CTRL_MASK));
		mnuFile2.add(newMenuItem1);

	}

	public static void main(String[] args) {

		new MainFrame();

	}

}
