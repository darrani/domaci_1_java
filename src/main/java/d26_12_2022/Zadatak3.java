package d26_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//     3.   Napisati funkciju koja za dva jednocifrena broja koja
//     su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
//     METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

//        novaVrednost(a, b);
        Scanner s  = new Scanner(System.in);
        System.out.println("Unesite vrednost a: ");
        int a = s.nextInt();
        System.out.println("Unesite vrednost b:");
        int b = s.nextInt();
        System.out.println(brojevi(a,b));
    }
    public static int brojevi(int a, int b){
        int c = a * 10 + b;
        return c;
    }
}
