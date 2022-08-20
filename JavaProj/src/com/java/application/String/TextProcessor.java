package com.java.application.String;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// ABDEFXYZ
public class TextProcessor {

    /*public static void main(String[] args) {
        StringBuilder originalText =
                new StringBuilder("ABC");
        StringBuilder text = originalText;
        originalText.append("DEF");
        originalText = edit(text);
        originalText = text.append("XYZ");
        System.out.print(originalText);
    }
    static StringBuilder edit(StringBuilder originalText) {
        return originalText.delete(2, 3);
    }*/

    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("E://file.txt");
        FileReader fr = new FileReader(file);
    }
}