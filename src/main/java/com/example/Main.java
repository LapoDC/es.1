package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList <Cavallo> ar= new ArrayList<>();

        ArrayList<String> arS= new ArrayList<>();

        System.out.println("Hello world!");

        for(int i=0;i<20;i++){
            ar.add(new Cavallo(arS));
        }
        
        for (int i = 0; i < ar.size(); i++) {
            ar.get(i).start();
        }
        for (int i = 0; i < ar.size(); i++) {
            ar.get(i).join();
        }
        for (int index = 0; index < ar.size(); index++) {
            System.out.println((index+ 1) +" "+ arS.get(index));
        }
        
    }
}