package d27_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println("Naziv proizvoda je: " + naziv + ", a cena mu je " + cena + " dinara za " + tezina + " grama.");
    }

    public void konvertuj(){
        double kg = tezina / 1000;
        System.out.println("Tezina u kilogramima je: " + kg + " kg.");

    }
}
