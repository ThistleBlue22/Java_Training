package com.sparta.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MyThread extends Thread{
    private String name;
    private ArrayList<Author> list;
    private BufferedReader br;
    public MyThread(String name, ArrayList<Author> list, BufferedReader br){
        this.name = name;
        this.list = list;
        this.br = br;
    }
    public void doSomething(){
        Random random = new Random();
        System.out.println("Starting " + name);
        try {
            Thread.sleep(random.nextInt());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finishing " + name);
    }

    @Override
    public void run(){
        doSomething();
    }

    public void processFile(){
        String line;
        try {
            while (((line = br.readLine()) != null)){


                    String[] values = line.split(",");
                    list.add(new Author(values[1], values[2]));

            }
        }
        catch (IOException e) {
                e.printStackTrace();
        }
    }


}
