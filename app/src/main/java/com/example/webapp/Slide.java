package com.example.webapp;

import java.io.Serializable;

public class Slide implements Serializable {
    private final String title;
    private final String content;

    public Slide(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
