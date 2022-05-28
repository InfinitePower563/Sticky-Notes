package io.github.infinitepower563.stickynotes.gui;

import io.github.infinitepower563.stickynotes.runtime.Main;
import io.github.infinitepower563.stickynotes.util.StickyManager;

import javax.swing.*;

public class Editor {
    public static void init() {
        JFrame mainFrame = new JFrame("Sticky Notes");
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);

        JLabel titleNotifier = new JLabel("Title:");
        titleNotifier.setBounds(10, 10, 100, 30);
        mainFrame.add(titleNotifier);

        JTextField titleField = new JTextField();
        titleField.setBounds(10, 40, 400, 30);
        mainFrame.add(titleField);

        JLabel descNotifier = new JLabel("Description:");
        descNotifier.setBounds(10, 80, 100, 30);
        mainFrame.add(descNotifier);

        JTextArea descField = new JTextArea();
        descField.setBounds(10, 110, 400, 300);
        mainFrame.add(descField);

        JButton saveButton = new JButton("Save and Open");
        saveButton.setBounds(10, 420, 200, 30);
        mainFrame.add(saveButton);
        saveButton.addActionListener(al -> {
            Main.logger.info("Saved sticky!");
            String title = titleField.getText();
            String desc = descField.getText();
            StickyNote sticky = new StickyNote(title, desc);
            StickyManager.addSticky(sticky);
            mainFrame.dispose();
        });
    }
}
