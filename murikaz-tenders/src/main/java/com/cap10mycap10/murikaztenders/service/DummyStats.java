package com.cap10mycap10.murikaztenders.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DummyStats {
    public int getCountryStats(int countryId) {
        //do something with the countryId
        return new Random().nextInt();
    }
}
