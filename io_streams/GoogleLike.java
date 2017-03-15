package com.evenstein.exercise.io_streams;

import java.io.*;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

/**
 * Created by evenstein on 07.03.17.
 */
public class GoogleLike {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.google.com");

        //ByteArrayOutputStream buff = new ByteArrayOutputStream();
        //OutputStream fis = new FileOutputStream(new File("/media/evenstein/Новый том/Dev JAVA/JAVA Projects/src/" +
        //        "com/evenstein/exercise/io_streams/index.html"));

        //copy(stream, buff);
        try (InputStream stream = url.openStream();
             ByteArrayOutputStream buff = new ByteArrayOutputStream()) {
            copy(stream, buff);

            byte[] rawData = buff.toByteArray();
            String html = new String(rawData, "ascii");
            System.out.println(html);
        }


    }

    private static void copy(InputStream stream, OutputStream buff) throws IOException {

       /* while (true) {
            int elem = stream.read();
            if (elem != -1) {
                buff.write(elem);
            } else {
                break;
            }
        }*/

       /*int elem;
       while ((elem = stream.read()) != -1) {
           buff.write(elem);
       }*/

       byte[] buffer = new byte[1024];
       int count;
       if ((count = stream.read(buffer)) != -1)
           buff.write(buffer, 0, count);

    }


}

class X {

    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream(new File("as.txt"));
        //OutputStream outBuff = new BufferedOutputStream(out, 64 * 1024);
        OutputStream outBuff = new GZIPOutputStream(out);
    }

}
