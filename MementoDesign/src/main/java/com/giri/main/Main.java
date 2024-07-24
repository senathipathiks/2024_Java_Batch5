package com.giri.main;

import com.giri.originator.*;
import com.giri.caretaker.*;
import com.giri.memento.*;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();

        // Write some content
        document.write("Additional content\n");
        history.addMemento(document.createMemento());

        // Write more content
        document.write("More content\n");
        history.addMemento(document.createMemento());
        
        // Write more content
        document.write("third content\n");
        history.addMemento(document.createMemento());

        // Restore to previous state
        document.restoreFromMemento(history.getMemento(3));

        // Print document content
        System.out.println(document.getContent());
    }
}
