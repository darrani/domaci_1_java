package d13_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//   Napisati klasu Student koja ima
//
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
        Ispit prvi = new Ispit("Sociologija obrazovanja", 9,"Miroslav Antic");
        Ispit drugi = new Ispit("Teorije moci", 10, "Svetlana Kocic");
        Ispit treci = new Ispit("Osnovi sociologije rada", 9, "Branimir Ilic");
        Student d = new Student("2465", "Dragana Nikolic", "osnovne");

        d.dodajIspit(prvi);
        d.dodajIspit(drugi);
        d.dodajIspit(treci);
        prvi.stampaj();
        System.out.println();

        d.stampaj();

    }
}
