package com.johnmsaylor;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Analysis {
    private Properties props = new Properties();
    private String annotations = "";

    public void testAnalyze(String args){

        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        CoreDocument doc = new CoreDocument(args);

        pipeline.annotate(doc);

        int length = doc.tokens().size();
        var posTags = doc.sentences().get(0).posTags();
        for (int i = 0; i < length; i++) {
            var token = doc.tokens().get(i);
        }

        posTags.forEach(x -> System.out.println(x));

        int counter = 0;
        for (var pos : posTags) {
            if (!pos.equals("DT") || !pos.equals("//")) {
                var word = doc.sentences().get(0).tokens().get(counter);
                System.out.println(word.lemma());
            }
            counter++;
        }




//        var word = doc.tokens().get(5).lemma();
//        System.out.println(word);
//        CoreSentence sentence = doc.sentences().get(0);
//
//        var token = sentence.nerTags();
//        var posTags = sentence.posTags();
//
//        System.out.println(token);
//        System.out.println("-------");
//        System.out.println(posTags);
    }

    public void showTokens(){

    }

    public void setProperties(String string) {
        String annotations = string.replace(" ", ",");
        props.setProperty("annotators", annotations);
    }
}
