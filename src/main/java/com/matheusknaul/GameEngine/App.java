package com.matheusknaul.GameEngine;

import javax.swing.JFrame;

import com.matheusknaul.GameEngine.gui.GamePanel;

public class App {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");
        
        GamePanel gamePanel = new GamePanel();
        gamePanel.run();
        window.add(gamePanel);
        
        window.pack();
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        gamePanel.startGameThread();
    }
    
}
