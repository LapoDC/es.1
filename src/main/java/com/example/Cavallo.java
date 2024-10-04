package com.example;

import java.util.ArrayList;

public class Cavallo extends Thread {
    int contatore;
    ArrayList<String> a;

    public Cavallo(ArrayList<String> ar) {
        contatore = 100;
        a=ar;
    }

    public void run(){
        for (int i = 0; i < contatore; i++) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
          
    }
             a.add(this.getName());
}
}
