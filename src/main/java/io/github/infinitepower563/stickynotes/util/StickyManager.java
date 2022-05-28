package io.github.infinitepower563.stickynotes.util;

import io.github.infinitepower563.stickynotes.gui.StickyNote;

import javax.swing.*;
import java.awt.*;

public class StickyManager {

    public static void addSticky(StickyNote sticky) {
        JFrame note = new JFrame(sticky.getTitle());
        JLabel desc = new JLabel(sticky.getDesc());

        desc.setVerticalAlignment(JLabel.TOP);

        note.add(desc);
        note.setSize(300,300);
        desc.setBounds(5,0,300,300);

        note.setBackground(Color.yellow);

        note.setAlwaysOnTop(true);

        note.setVisible(true);
    }
}
