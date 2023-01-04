package d29_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        Proizvod cokolada = new Proizvod();
        cokolada.naziv = "Milka";
        cokolada.cena = 358;
        cokolada.tezina = 250;
        cokolada.stampaj();

        cokolada.povecajCenu(20);
        System.out.println("Cena cokolade sa popustom od 20% je " + cokolada.vratiCenuSaPopustom(20));
        System.out.println("Postarina za dostavu cokolade je " + cokolada.racunajPostarinu());


        Proizvod keks = new Proizvod();
        keks.naziv = "Plazma";
        keks.cena = 287;
        keks.tezina = 300;
        keks.stampaj();

        keks.povecajCenu(10);
        System.out.println("Cena plazme sa popustom od 20% je " + keks.vratiCenuSaPopustom(20));
        System.out.println("Postarina za dostavu keksa je " + keks.racunajPostarinu());



    }
}
