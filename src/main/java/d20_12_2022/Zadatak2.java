package d20_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
//     2.  Napisati program koji ucitava RIMSKE brojeva
//     od korisnika i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.




        String rimskiBroj = "";

          while(!(rimskiBroj.equals("kraj"))) {


               System.out.println("Unesi rimski broj: ");
              String rimski = s.next();

            if (rimskiBroj.equals("X")) {
                System.out.println("Arapski: 10");
            } else if (rimskiBroj.equals("C")) {
                System.out.println("Arapski: 50");
            } else if (rimskiBroj.equals("D")) {
                System.out.println("Arapski: 500");
            } else if (rimskiBroj.equals("M")) {
                System.out.println("Arapski: 1000");
            } else if (rimskiBroj.equals("I")) {
                System.out.println("Arapski: 1");
            }
       }

        System.out.println("Kraj programa.");
    }
}
