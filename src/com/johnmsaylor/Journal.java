package com.johnmsaylor;

import java.time.Instant;

public class Journal {

    public Instant entryDateTime;
    public String content;

    public Journal() {
        this.entryDateTime = Instant.now();
        this.content = content;
    }

    public void writeJournalEntry(Input input) {
        System.out.println("Your Journal - " + entryDateTime.toString());
        this.content = input.getJournalEntry();
    }

}
