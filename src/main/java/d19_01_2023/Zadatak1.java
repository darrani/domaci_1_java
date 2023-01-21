package d19_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();

        SuperKartica sp = new SuperKartica("2736367", "Dragana nikolic", 20);


        Ambalaza a = new StaklenaAmbalaza("9988", "pivo", 0.5, 0.7, 30, true, 70);
        Ambalaza b = new StaklenaAmbalaza("4456", "voda", 1, 1.5, 0, false, 50);
        Ambalaza c = new Tetrapak("8765", "mleko", 1.2, 1.5, true, 100);
        Ambalaza d = new Tetrapak("8665", "sok", 2, 5, false, 500);
        Ambalaza e = new Tetrapak("877", "sok", 1.5, 2, false, 200);


        korpa.dodajAmbalazu(a);
        korpa.dodajAmbalazu(b);
        korpa.dodajAmbalazu(c);
        korpa.dodajAmbalazu(d);
        korpa.dodajAmbalazu(e);

        korpa.izbaciAmbalazu("8665");

        a.stampaj();
        c.stampaj();


        sp.stampajKarticu();
        System.out.println(e.racunajCenu());
        System.out.println(a.tezinaPakovanja());


        System.out.println("Ukupna cena korpe je " + korpa.ukupnaCena(sp));
    }
}
