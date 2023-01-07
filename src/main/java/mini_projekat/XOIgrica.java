package mini_projekat;

import java.util.Scanner;

public class XOIgrica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        XOTabla xoIgrica = new XOTabla();
        System.out.println("Unesite igraca X: ");
        xoIgrica.setImeIgracaX(s.next());

        System.out.println("Unesite igraca O: ");
        xoIgrica.setImeIgracaO(s.next());


        xoIgrica.pokreniIgru();

        while (!xoIgrica.popunjenaTabla() && !xoIgrica.pobednikX() && !xoIgrica.pobednikO()) {
            xoIgrica.stampaj();

            System.out.println("Odigraj potez: ");
            String potez = s.next();
            xoIgrica.odigrajPotez(potez);

            if (xoIgrica.pobednikX()) {
                System.out.println("Pobednik je igrac " + xoIgrica.getImeIgracaX() + "!");

            } else if (xoIgrica.pobednikO()) {
                System.out.println("Pobednik je igrac " + xoIgrica.getImeIgracaX() + "!");

            } else if (xoIgrica.popunjenaTabla()) {
                System.out.println("Nereseno!");
            }
            xoIgrica.zameniIgraca();


        }
    }
}








