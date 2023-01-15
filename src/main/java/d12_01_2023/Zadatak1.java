package d12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<ZeleniKarton>ocene = new ArrayList<ZeleniKarton>();
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita


        ZeleniKarton zk1  = new ZeleniKarton("Milena Jovic",776, "Savremene soc. teorije","Jovan Jovic", 7);
        ZeleniKarton zk2  = new ZeleniKarton("Milena Jovic",776, "Sociologija religije","Mika Ristic", 8);
        ZeleniKarton zk3  = new ZeleniKarton("Milena Jovic",776, "Sociologija kulture","Suza Rot", 7);
        ZeleniKarton zk4  = new ZeleniKarton("Milena Jovic",776, "Teorija drus. strukture","Petar ilic", 5);
        ZeleniKarton zk5  = new ZeleniKarton("Milena Jovic",776, "Engleski jezik","Slobodan Peric", 9);
        ZeleniKarton zk6  = new ZeleniKarton("Milena Jovic",776, "Metodologija drus. istrazivanja","Gordana M", 7);
        ZeleniKarton zk7  = new ZeleniKarton("Milena Jovic",776, "Sociologija drustvenih devijacija","Milica Nesic", 6);
        ZeleniKarton zk8  = new ZeleniKarton("Milena Jovic",776, "Statistika u drus. istrazivanjima","Slavoljub Kostic", 5);
        ZeleniKarton zk9  = new ZeleniKarton("Milena Jovic",776, "Demografija","Irena Janjic", 9);
        ZeleniKarton zk10  = new ZeleniKarton("Milena Jovic",776, "Sociologija saznanja","Dusan Tatic", 7);

        ocene.add(zk1);
        ocene.add(zk2);
        ocene.add(zk3);
        ocene.add(zk4);
        ocene.add(zk5);
        ocene.add(zk6);
        ocene.add(zk7);
        ocene.add(zk8);
        ocene.add(zk9);
        ocene.add(zk10);


        zk2.stampaj();
        zk5.stampaj();
        zk10.stampaj();
        System.out.println("Student je polozio: " + zk5.getImeIPrezimeStudenta()+ " :" + zk5.polozioJe());
        int counter = 0;
        double suma = 0;
        double prosecnaOcena = 0;
        for (int i = 0; i <ocene.size() ; i++) {
            if(ocene.get(i).getOcena()>5){
                counter++;
                suma = suma + ocene.get(i).getOcena();
                prosecnaOcena = suma / counter;
            }

        }

        System.out.println("Prosecna ocena svih ispita je: " + prosecnaOcena);
    }
}
