package com.johnmsaylor;


public class Main {

    public static void main(String[] args) {
//	    Console console = new Console();
//	    Journal journal = new Journal();
//	    journal.writeJournalEntry(console);
//        System.out.println(journal.content);
        var analysis = new Analysis();
        analysis.setProperties("tokenize ssplit pos lemma");
        analysis.testAnalyze("Who is the man in the black hat? Forfeit your land or pay the taxes");
    }
}
