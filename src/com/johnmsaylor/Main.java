package com.johnmsaylor;


public class Main {

    public static void main(String[] args) {
//	    Console console = new Console();
//	    Journal journal = new Journal();
//	    journal.writeJournalEntry(console);
//        System.out.println(journal.content);
        var analysis = new Analysis();
        analysis.setProperties("tokenize ssplit pos lemma");
        analysis.testAnalyze("Ye are the yeoman cat feline parents parent ancestors family god.");
    }
}
