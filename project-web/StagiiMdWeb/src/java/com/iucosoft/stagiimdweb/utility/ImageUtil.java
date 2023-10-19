/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author munka
 */
public class ImageUtil {
    public static byte[] readImageData(String imagePath) throws IOException {
        InputStream is = new FileInputStream(imagePath);
        int size = is.available();
        byte[] imgData = new byte[size];
        is.read(imgData);
        is.close();
        return imgData;
    }
}
