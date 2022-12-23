package d_19_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//4.Napisati program koji vodi evidenciju koliko je uneto sledecih reakcija.
// Korisnik unosi N rekacija zatim se prikazuje evidencija:
//Program podrzava sledece reakcije:
//like
//smile
//heart
//
//	Primer izvrsenja:
//Unesite N: 7
//	Reaguj: like
//	Reaguj: heart
//	Reaguj: smile
//	Reaguj: lol
//	Reaguj: smile
//	Reaguj: like
//	Reaguj: like
//Summary: like 3 | smile 2 | heart 1
//
//Napomena: Ako se unese reakcija koju program ne podrzava, ona ne utice na evidenciju.
//
//POMOC: Svaka promenljiva nosi jednu informaciju, to znaci evidenciju
// za like cuva promelniva sa imenom npr likeCounter,
// evidenciju za smile cuva smileCounter i za heart cuva promenljiva heartCounter

        int likeCounter = 0;
        int smileCounter = 0;
        int heartCounter = 0;

        System.out.println("Unesite N ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Reaguj: ");
            String reakcija = s.next();

            if(reakcija.equals("like")){
                likeCounter ++;
            }else if (reakcija.equals("smile")){
                smileCounter ++;
            }else if (reakcija.equals("heart")){
                heartCounter ++;
            }
        }
        System.out.println("like " + likeCounter + " | "
                           + "smile " + smileCounter + " | "
                           + "heart " + heartCounter );
    }
}
