package d_19_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//     1.   Napisati program koji od korisnika ucitava N brojeva
//        i sabira samo parne brojeve. Na kraju programa prikazati sumu.
//Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 2
//Unesite broj: 9
//Unesite broj: 6
//Unesite broj: 8
//Suma parnih brojeva je 16
//Objasnjenje: 2 + 6 + 8 = 16

        System.out.println("Unesite N brojeva: ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                sum = sum + broj;

            }

        }
        System.out.println("Suma parnih brojeva je : " + sum);
    }
}
