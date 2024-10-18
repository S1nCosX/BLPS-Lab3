package com.blps.lab1.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremoderationService {

    private final List<String> offensiveWords = List
            .of(
                "попа"
            ); // представим что тут банк плохих слов...

    public boolean containsOffensiveLanguage(String text) {
        for (String word : offensiveWords) {
            if (text.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}
