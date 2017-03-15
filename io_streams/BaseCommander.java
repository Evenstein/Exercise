package com.evenstein.exercise.io_streams;

import java.io.File;

/**
 * Created by evenstein on 13.03.17.
 */
public class BaseCommander {

    public static void main(String[] args) {
        File file = new File("/media/evenstein/Новый том/фото");
        print(file);
    }

    public static void print(File root) {
        if (root.isFile()) {
            System.out.println(root);
        } else {
            File[] fileArray = root.listFiles();
            for (File file : fileArray) {
                print(file);
            }
        }
    }

}
