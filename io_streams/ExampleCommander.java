package com.evenstein.exercise.io_streams;

import java.io.File;
import java.util.Arrays;

/**
 * Created by evenstein on 13.03.17.
 */
public class ExampleCommander {

    static File[] fileArray = new File[1000];
    static int count = 0;

        public static void main(String[] args) {
            File file = new File("/media/evenstein/Новый том/фото");
            print(file);
            int counter = 0;
            while (!(fileArray[counter] == null)) {
                System.out.println(fileArray[counter]);
                counter++;
            }
        }

        public static void print(File root) {
            if (root.isFile()) {
                //System.out.println(root);
                fileArray[count] = root;
                count++;
            } else {
                File[] fileArray = root.listFiles();
                for (File file : fileArray) {
                    String fullFileName = file.getName();
                    int index = fullFileName.indexOf(".");
                    if (index != -1) {
                        String fileExtension = fullFileName.substring(index);
                        if ((file.length() > 500 * 1024) && (fileExtension.equalsIgnoreCase(".jpg")
                                || fileExtension.equalsIgnoreCase(".bmp")
                                || fileExtension.equalsIgnoreCase(".png")
                                || fileExtension.equalsIgnoreCase(".gif")))
                            print(file);
                    } else
                        print(file);
                }
            }
        }

}
