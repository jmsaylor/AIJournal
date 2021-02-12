package com.johnmsaylor;

import java.util.Scanner;

public class Console implements IO, GetJournalEntry {

    @Override
    public String getJournalEntry() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    @Override
    public void message(String text) {
        System.out.println(text);
    }

    @Override
    public void display(String text, Integer data) {
        System.out.println(text + " " + data);
    }


}
