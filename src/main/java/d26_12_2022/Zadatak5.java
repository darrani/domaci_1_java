package d26_12_2022;

public class Zadatak5 {
    public static void main(String[] args) {
//    5.   Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//Napomena: Metoda nista ne vraca.
        stampanjeKaraktera(3, "|");
    }
    public static void stampanjeKaraktera(int n, String karakter){
        for (int i = 0; i < n; i++) {
            System.out.print(karakter + " ");

        }
    }
}
