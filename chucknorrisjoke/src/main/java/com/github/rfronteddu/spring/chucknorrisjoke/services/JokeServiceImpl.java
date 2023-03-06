package com.github.rfronteddu.spring.chucknorrisjoke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService
{
    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes ();

    @Override public String getJoke () {
        return quotes.getRandomQuote();
    }
}
