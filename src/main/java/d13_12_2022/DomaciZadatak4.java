package d13_12_2022;

public class DomaciZadatak4 {
    public static void main(String[] args) {
//        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//        KOREN BROJA 3 neka bude konstanta 1.73.
//        Za stranicu trougla postavite proizvoljnu vrednost.
//                Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30
         int a = 5;
         final double KOREN = 1.73;
         double povrsinaTrougla = a * a * KOREN / 4;
         double obimTrougla = 3 * a;
        System.out.println("a: "+ a);
        System.out.println("Povrsina trougla je " + povrsinaTrougla);
        System.out.println("Obim trougla je " + obimTrougla);



    }
}
