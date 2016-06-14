package com.dev;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by john-orr on 14/06/16.
 */
public class FileEditor {

    private static final Pattern PATTERN = Pattern.compile("_FTT[CH]");

    public static void addVOBB(String inputFile, String outputFile) {

        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(ClassLoader.getSystemResourceAsStream(inputFile)));
            PrintWriter writer = new PrintWriter("out/" + outputFile);

            String line = reader.readLine();
            int lineCount = 0;
            while (line != null) {

                Matcher lineMatcher = PATTERN.matcher(line);

                if (lineMatcher.find()) {
                    int index = lineMatcher.start();

                    index = line.indexOf('\'', index);

                    StringBuilder newLine = new StringBuilder(line);
                    newLine.insert(index, "_VOBB");

                    writer.println(newLine.toString());

                    lineCount++;
                }
                line = reader.readLine();
            }
            System.out.println("lineCount: " + lineCount);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}