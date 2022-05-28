package io.github.infinitepower563.stickynotes.runtime;

import io.github.infinitepower563.stickynotes.gui.MainFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Initializing Sticky Notes...");
        MainFrame mainFrame = new MainFrame();
        mainFrame.initFrame();
    }
}
