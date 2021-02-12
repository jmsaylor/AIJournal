package com.johnmsaylor;

import java.time.Instant;

public class Journal {

    public Instant entryDateTime;
    public String content;

    public Journal() {
        this.entryDateTime = Instant.now();
        this.content = content;
    }

}
