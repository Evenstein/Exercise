package com.evenstein.exercise.inheritance;

import java.util.ArrayList;

/**
 * Created by Vitaly on 26.01.2017.
 */
public class ObjectAnalyzerTest {

    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5 ; i++) {
            list.add(i * i);
            System.out.println(new ObjectAnalyzer().toString(list));
        }
    }

}
