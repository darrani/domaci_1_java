package d_19_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//Napisati program koji ucitava N brojeva
// od korisnika i sabira samo trocifrene brojeve.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 32
//Unesite broj: 121
//Unesite broj: 1333
//Unesite broj: 144
//Suma je: 265
        System.out.println("Unesi N brojeve");
        int n = s.nextInt();

        int sum = 0;
        for (int i = 1; i <=n ; i++) {

            System.out.println("Unesi broj");
            int broj = s.nextInt();

            if(broj>99 && broj<999){
                sum= sum + broj;
            }

        }

        System.out.println(sum);


    }
}
