package d10_01_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Kupac dragana = new Kupac("Petar Kotevski");
        dragana.setKartica(new Kartica());
        Proizvod proizvod = new Proizvod("Proizvod", 200);
        proizvod.setKupac(dragana);
        proizvod.print();

    }
}
