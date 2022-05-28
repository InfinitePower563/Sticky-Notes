package io.github.infinitepower563.stickynotes.gui;

import javax.swing.*;

public class MainFrame {
    public void initFrame() {
        JFrame mainFrame = new JFrame("Sticky Notes");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(100, 100);
        mainFrame.setVisible(true);
        mainFrame.setLayout(null);

        JButton newSticky = new JButton("New Sticky");
        newSticky.setBounds(10, 10, 100, 30);
        mainFrame.add(newSticky);
        newSticky.addActionListener(al -> Editor.init());
    }
}
