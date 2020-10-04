package com.johnmsaylor;

import java.util.Scanner;

public class Console implements Input{

    @Override
    public String getJournalEntry() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
