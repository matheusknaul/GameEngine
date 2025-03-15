package com.matheusknaul.GameEngine.gui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SystemGUI {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() ->{
			JFrame mainFrame = new JFrame("Game Engine");
			mainFrame.setSize(800, 600);
			mainFrame.setVisible(true);
		});
	}
}
