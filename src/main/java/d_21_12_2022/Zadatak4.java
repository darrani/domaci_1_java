package d_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        ArrayList<Integer> nizA = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);


//    4. Napisati program koji ucitava niz A duzine N i broj X.
//    Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//	Primer izvrsenja:
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 7
//Unesite broj: 3
//Unesite broj: 9
//Unesite X: 3
//
//Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
//1, 3
        System.out.println("Unesite N ");
        int n = s.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Unesite broj ");
            int broj = s.nextInt();
            nizA.add(broj);

            }
            System.out.println("Unesite broj x ");
             int x = s.nextInt();
            for (int i = 0; i < nizA.size() ; i++) {

            if(x == (nizA.get(i))){
                System.out.print("Elementi niza A koji su jednaki broju X imaju indekse: " + i + ", ");


            }
        }


    }
}
