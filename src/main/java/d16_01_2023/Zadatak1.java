package d16_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//    Trener t1 = new Trener("Pera Peric", "898927868",1987,16, "pomocni");
//   t1.stampaj();
//        Trener t2 = new Trener("Pera Mitic", "988727868",1977,26, "kondicioni");
//        t2.stampaj();
//   Igrac i1 = new Igrac("Jovan Jovanovic", "877668898", 1999, 7, "centar", true);
//   i1.stampaj();
//        Igrac i2 = new Igrac("Zoran Jovanovic", "80000668898", 2001, 10, "bek", true);
//        i2.stampaj();

        Scanner s = new Scanner(System.in);
        ArrayList<Igrac>igraci = new ArrayList<>();
        ArrayList<Trener>treneri = new ArrayList<>();
//IGRACI
        System.out.println("Unesite broj igraca: ");
        int brojIgraca = s.nextInt();

        for (int i = 0; i < brojIgraca; i++) {
            Igrac noviIgrac = new Igrac();
            //ime, jmbg, godina rodjenja, broj igraca, pozicija, kapiten
            System.out.println("Unesite ime igraca:");
            noviIgrac.setImeIPrezime(s.next());
            System.out.println("Unesi jmbg: ");
            noviIgrac.setJmbg(s.next());
            System.out.println("Unesite godinu rodjenja: ");
            noviIgrac.setGodinaRodjenja(s.nextInt());
            System.out.println("Unesite igracev broj;");
            noviIgrac.setIgracevBroj(s.nextInt());
            System.out.println("Unesite poziciju:");
            noviIgrac.setPozicija(s.next());
            System.out.println("Unesite da li igrac kapitet ili ne");
            noviIgrac.setKapiten(s.nextBoolean());

            igraci.add(noviIgrac);
        }


//TRENERI
        System.out.println("unesite broj trenera:");
        int brojTrenera = s.nextInt();

        for (int i = 0; i < brojTrenera; i++) {

            Trener trener = new Trener();

            //ime, jmbg,godina rodnje, godine iskustva, tip trenera
            System.out.println("Unesite ime trenera:");
            trener.setImeIPrezime(s.next());
            System.out.println("Unesite jmbg:");
            trener.setJmbg(s.next());
            System.out.println("Unesite godinu rodjenja: ");
            trener.setGodinaRodjenja(s.nextInt());
            System.out.println("Unesite godine iskustva: ");
            trener.setGodineIskustva(s.nextInt());
            System.out.println("Unesite tip trenera:");
            trener.setTip(s.next());


            treneri.add(trener);




        }
        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();

        }
        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();

        }


    }
}
