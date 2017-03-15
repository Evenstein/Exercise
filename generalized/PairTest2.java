package com.evenstein.exercise.generalized;

import java.time.LocalDate;

/**
 * Created by evenstein on 20.02.17.
 */
public class PairTest2 {

    public static void main(String... args) {

        LocalDate[] birthDays = {
                LocalDate.of(1906, 12, 9),   // G. Hooper
                LocalDate.of(1815, 12, 10),  // A. Lovelace
                LocalDate.of(1903, 12, 3),   // J. von Neuman
                LocalDate.of(1910, 6, 22)    // K. Zuse
        };
        //Pair<LocalDate> mm = ArrayAlg.minmax(birthDays);

        System.out.println('K' > 'A');
        System.out.println('K' < 'H');

    }

}
