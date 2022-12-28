package d26_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {
//  1.      Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
//  prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.


        stampajVrednostZa10Vecu(10);
    }
    public static void stampajVrednostZa10Vecu(int broj){
        broj = broj + 10;
        System.out.println(broj);
    }
}
