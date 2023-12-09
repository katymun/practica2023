/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author munka
 */
public class ImageUtil {
    public static void saveBytesToFile(InputStream filecontent, String fullPath)
            throws IOException {
        OutputStream out = null;

        int read = 0;
        final byte[] bytes = new byte[1024];

        out = new FileOutputStream(fullPath);

        while ((read = filecontent.read(bytes)) != -1) {
            out.write(bytes, 0, read);

        }
        out.close();
    }

    public static void saveBytesToFile(byte[] bytes, String fullPath)
            throws IOException {
        OutputStream out = null;

        int read = 0;
        //  final byte[] bytes = new byte[1024];

        out = new FileOutputStream(fullPath);

        out.write(bytes);

        out.close();
    }

    public static byte[] readBytesFromFile(String fullPath) throws IOException {

        FileInputStream fis = new FileInputStream(fullPath);
        byte[] imageBytes = new byte[fis.available()];

        fis.read(imageBytes);
        fis.close();

        return imageBytes;

    }
}
