package d_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer>brojevi = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);


//    1.Zadatak
//    Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
//    i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//    Primer:
//    Unesite pozicjiu od 0 do 9: 3
//    Unesite novu vrednost: 11
//    Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.
        brojevi.add(4);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(1);
        brojevi.add(33);
        brojevi.add(2);
        brojevi.add(8);
        brojevi.add(56);
        brojevi.add(77);
        brojevi.add(10);

        System.out.println("Unesite poziciju K od 0-9: ");
        int k = s.nextInt();
        int vrednostK = brojevi.get(k); // citanje stare vrednosti indexa 3
        System.out.println(vrednostK);  //stampa stare vrednosti k na poziciji 3

        System.out.println("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        brojevi.set(k, novaVrednost);
        System.out.println(novaVrednost);


    }
}
