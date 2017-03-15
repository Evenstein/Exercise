package com.evenstein.exercise.io_streams;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by evenstein on 13.03.17.
 */
public class App01 extends Thread {

    public static void main(String[] args) throws IOException {
        char[] charBuff = {'H', 'e', 'l', 'l', 'o'};
        f(new CharArrayReader(charBuff));
    }

    private static void f(Reader reader) throws IOException {
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        System.out.println();
    }

}
