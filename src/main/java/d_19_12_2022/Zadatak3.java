package d_19_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//3.Napisati program koji simulira ponasanje speak loud programa.
// Korisnik unosi N reci a program ispisuje svaku rec na ekranu tako da zadovolji uslov:
//ako se u unetom tekstu sadrzi ! onda ga ispise tako kako je unet
//ako se ne sadrzi, program dostampa na kraju
//	Nakon toga program ispisuje nivo agresivnosti u komunikaciji
//	(u procentima). Svaka uneta rec sa ! utice na agresivnost.
//	Primer izvrsenja:
//	Unesite N: 5
//	Unesite tekst: Cao!
//	Cao!
//	Unesite tekst: Hello
//	Hello!
//	Unesite tekst: Hi!
//	Hi!
//	Unesite tekst: Cuti
//	Cuti!
//	Unesite tekst: Ajde!
//	Ajde!
//	Nivo agresivnosti 60.
//	(Objasnjenje, 60% jer je od 5 unetih reci, 3 bilo sa !)
     int agresivnost = 0;
        System.out.println("Unesi N ");
        int n = s.nextInt();
        for (int i = 0; i < n ; i++) {
            System.out.println("Unesi text ");
            String text = s.next();

            if ( text.contains("!")){
                System.out.println(text);
            }else{
                System.out.println(text + "!");
            }
            if (text.contains("!")){
                agresivnost ++;
            }


        }
        System.out.println("Nivo agresivnosti je " + (agresivnost * 100)/n + " %");
    }
}
