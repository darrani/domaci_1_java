package d26_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//   2.   Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//      Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan string
//      tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”,
// metoda vraca “Milan Jovanovic”



        punoIme("Dragana", "Nikolic");

    }
    public static String punoIme(String ime, String prezime){
        String zajedno = ime + " " + prezime;
        return zajedno;
    }



}
