package com.evenstein.exercise.io_streams;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Created by evenstein on 13.03.17.
 */
public class App02 {

    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(
                new GZIPOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(
                                        new File("/media/evenstein/Новый том/tmp/tmp1.txt")), 256)));
        for (int i = 0; i < 1000; i++) {
            out.writeDouble(123.456);
        }
        out.flush();
        out.close();

        DataInputStream in = new DataInputStream(
                new GZIPInputStream(
                        new FileInputStream(
                                new File("/media/evenstein/Новый том/tmp/tmp1.txt"))));
        for (int i = 0; i < 1000; i++) {
            System.out.println(in.readDouble());
        }
    }

}
