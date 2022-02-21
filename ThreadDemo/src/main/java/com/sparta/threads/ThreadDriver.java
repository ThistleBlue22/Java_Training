package com.sparta.threads;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class ThreadDriver {
    public static void main(String[] args) {
        ArrayList<Author> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\wiico\\Documents\\GitHub\\Java_Training\\ThreadDemo\\authors.csv"));
            br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        MyThread t1 = new MyThread("t1", list, br);
        t1.processFile();
        for (Author a:list){
            System.out.println(a);
        }

        try {
            br.close();
        } catch (IOException|NullPointerException e) {
            e.printStackTrace();
        }

    }
}
