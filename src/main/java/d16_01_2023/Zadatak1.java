package d16_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
    Trener t1 = new Trener("Pera Peric", "898927868",1987,16, "pomocni");
   t1.stampaj();
        Trener t2 = new Trener("Pera Mitic", "988727868",1977,26, "kondicioni");
        t2.stampaj();
   Igrac i1 = new Igrac("Jovan Jovanovic", "877668898", 1999, 7, "centar", true);
   i1.stampaj();
        Igrac i2 = new Igrac("Zoran Jovanovic", "80000668898", 2001, 10, "bek", true);
        i2.stampaj();

        Scanner s = new Scanner(System.in);
        ArrayList<Osoba>osobe = new ArrayList<>();


    }
}
