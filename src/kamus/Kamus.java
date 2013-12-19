package kamus;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Data {

    public String kata, arti; 
    public Data lanjut; 

    public Data(String kata, String arti) { 
        this.kata = kata;
        this.arti = arti;
    }
}

class LinkList {

    Data first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(String kata, String arti) {
        Data d = new Data(kata, arti);
        d.lanjut = first;
        first = d;
    }

    public Data deleteFirst() {
        Data temp = first;
        first = first.lanjut;
        return temp;
    }
}

public class Kamus {

    LinkList ll;

    public Kamus() {

        Scanner sc1 = null;
        try {
            sc1 = new Scanner(new File("kbbi.dict.csv"));
            ll = new LinkList(); 
            while (sc1.hasNextLine()) {
                String x = sc1.nextLine().replaceAll("\"", "").replaceAll(";", "").replaceAll("<br>", "\n"); 
                int startBracket = -1, endBracket = -1;
                for (int i = 0; i < x.length(); i++) {
                    if (x.charAt(i) == '[') {
                        startBracket = i;
                    }
                    if (x.charAt(i) == ']') {
                        endBracket = i;
                    }
                }
                
                if ((startBracket != -1) || (endBracket != -1)) {
                    String split = x.substring(startBracket, endBracket + 1);
                    x = x.replace(split, " ");
                }
                
                String[] splitterKeyValue = x.split("\t");
                if (splitterKeyValue.length == 2) {
                    ll.insertFirst(splitterKeyValue[0],splitterKeyValue[1]);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public String search(String kata) {
        String arti = "";

        for (Data i = ll.first; i != null; i = i.lanjut) { 
            if (i.kata.indexOf(kata) >= 0) {
                arti = i.kata + " | " + i.arti + "\n" + arti;
            }
        }

        if (arti.equals("")) {
            arti = ("Kata tidak ditemukan dalam kamus");
        }
        return arti;
    }
}
