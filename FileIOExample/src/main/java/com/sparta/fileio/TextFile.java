package com.sparta.fileio;

import java.io.*;
import java.util.Arrays;

public class TextFile {
    public static void readFile(String fileName){
        // using try with resources
        // is available where a file can be opened and closed
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(Arrays.toString(line.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readWriteFile(String inFile, String outFile){
        // using try with resources
        // is available where a file can be opened and closed
        try (BufferedReader br = new BufferedReader(new FileReader(inFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))){
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(Arrays.toString(line.split(",")));
                bw.write(line +  "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
