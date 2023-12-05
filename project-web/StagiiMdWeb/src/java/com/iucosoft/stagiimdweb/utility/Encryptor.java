/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility;

import java.io.UnsupportedEncodingException;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author munka
 */
public class Encryptor {
    public static String encrypt(String password) throws UnsupportedEncodingException {
        byte[] encryptArray = Base64.encodeBase64(password.getBytes());
        return new String(encryptArray, "UTF-8"); 
    }

}
