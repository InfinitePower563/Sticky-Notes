package io.github.infinitepower563.stickynotes.gui;

public class StickyNote {
    String title, desc;

    public StickyNote(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
