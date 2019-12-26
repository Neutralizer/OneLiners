package com.joke.OneLiners.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Quotes {

    private List<String> quotes;

    public Quotes() {
        quotes = new ArrayList<>();
        populateQuotes();
    }

    private void populateQuotes() {
        quotes.add("Toki wo tomare!");
        quotes.add("ZA WARUDO!!!");
        quotes.add("NANI!?");
        quotes.add("Omae wa mou shindeiru!");
        quotes.add("ORA ORA!");
        quotes.add("MUDA MUDA!");
    }

    public String getRandomOneLiner(){
        return quotes.get(ThreadLocalRandom.current().nextInt(1,quotes.size()));
    }


}
