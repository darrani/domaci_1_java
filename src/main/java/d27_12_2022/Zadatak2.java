package d27_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
//        Kreirati klasu SmartAirConditioning koja ima:
//atribut za marku klime (npr: Samsung, Galanz, Gree, …)te
//atribut za izabranu temperaturu
//atribut za mod (hladi/greje) - string
//metodu za stampu (proizvoljno)
//metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima
// postavljena.
// Metoda kao parametar prima temperaturu koja je napolju.
//
//U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih
// pozvati metode

    SmartAirConditioning klima = new SmartAirConditioning();
    klima.marka = "Samsung";
    klima.izabranaTemperatura = 24;
    klima.mod = "greje";
    klima.stampaj();
        if(klima.vecaTemperatura(16)){
            System.out.println("Temperatura je veca.");
        }else{
            System.out.println("Temperatura je manja." );
        }

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "LG";
        klima2.izabranaTemperatura = 22;
        klima2.mod = "hladi";
        klima2.stampaj();
    if(klima.vecaTemperatura(35)){
        System.out.println("Temperatura je veca.");
    }else{
        System.out.println("Temperatura je manja." );
    }

    }

}


