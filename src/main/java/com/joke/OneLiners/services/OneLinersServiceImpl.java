package com.joke.OneLiners.services;

import com.joke.OneLiners.models.Quotes;
import org.springframework.stereotype.Service;

@Service
public class OneLinersServiceImpl implements OneLinersService {

    private final Quotes quotes;

    public OneLinersServiceImpl() {
        this.quotes = new Quotes();
    }

    @Override
    public String getOneLiner() {
        return quotes.getRandomOneLiner();
    }
}
