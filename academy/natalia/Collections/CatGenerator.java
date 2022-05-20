package com.academy.natalia.Collections;

import java.util.ArrayList;
import java.util.List;

public class CatGenerator {
    public static List<Cat> generatecats(int catsCount) {

        List<Cat> cats = new ArrayList<>(catsCount);
        for (int i = 0; i < catsCount; i++) {
            cats.add(new Cat());
        }
        return cats;
    }
}


