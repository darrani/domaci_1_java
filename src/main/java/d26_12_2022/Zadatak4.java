package d26_12_2022;

public class Zadatak4 {
    public static void main(String[] args) {
//       Zadatak 4
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i
// da li je aktivan kao parametre metode.Metoda nista ne vraca.


        podaciOKorisniku(" 0211457878897", "Dragana", "Nikolic", 1985, false);
    }
    public static void podaciOKorisniku( String jmbg, String ime, String prezime, int godinaRodjenja, boolean jeAktivan){
        System.out.println("JMBG: " + jmbg);
        System.out.println("IME: " + ime);
        System.out.println("GODINA RODJENJA: " + godinaRodjenja);
        System.out.println("AKTIVAN: " + jeAktivan);
    }
}
