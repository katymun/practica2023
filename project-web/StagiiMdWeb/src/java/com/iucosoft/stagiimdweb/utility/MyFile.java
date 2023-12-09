/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iucosoft.stagiimdweb.utility;

/**
 *
 * @author munka
 */
public class MyFile {
    private String fileName;
    private byte[] fileBytes;

    @Override
    public String toString() {
        return "MyFile{" + "fileName=" + fileName + ", fileBytes=" + fileBytes.length + '}';
    }

    public MyFile() {
    }

    public MyFile(String fileName, byte[] fileBytes) {
        this.fileName = fileName;
        this.fileBytes = fileBytes;
    }

    public byte[] getFileBytes() {
        return fileBytes;
    }

    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
