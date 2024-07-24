package com.giri.memento;
import com.giri.originator.*;


public class DocumentMemento {
    private String content;

    public DocumentMemento(String content) {
        this.content = content;
    }

    public String getSavedContent() {  // returns saved content from memento
        return this.content;
    }
}