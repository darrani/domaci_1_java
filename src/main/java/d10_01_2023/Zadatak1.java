package d10_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//U glavnom programu napraviti vise autora sa vise knjiga.
        Autor autor1 = new Autor("Zika");

        Knjiga knjiga1 = new Knjiga("870004", "Naslov jedne knjige", 2015, "Zika");
        knjiga1.stampaj();
    }
}
