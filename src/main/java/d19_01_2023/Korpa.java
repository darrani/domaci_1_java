package d19_01_2023;

import com.sun.deploy.util.JVMParameters;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza>ambalaze;
    private Object sum;

    public Korpa() {

      this.ambalaze = new ArrayList<>();
    }
//dodaj Ambalazu  -- u zagradi je lista Ambalaza(tip) sa nazivom ambalaze

    //metoda dodavanja
    //public void dodajAmbalazu[ime metode](Ambalaza[tip niza]ambalaza[naziv niza]

    //this.ambalaze[naziv niza].add(ambalaza)[element niza]
    public void dodajAmbalazu(Ambalaza ambalaza){
        this.ambalaze.add(ambalaza);
    }
    // izbaci Ambalazu po barKodu

    public void izbaciAmbalazu(String barKod){

        for (int i = 0; i < ambalaze.size(); i++) {
            if(this.ambalaze.get(i).getBarKod().equals(barKod)){
                this.ambalaze.remove(i);
            }
        }
    }
    private double cenaSvihAmbalaza(double popust){

        double sumaCena = 0;
        for (int i = 0; i <this.ambalaze.size(); i++) {
            sumaCena = sumaCena + this.ambalaze.get(i).racunajCenu();
        }
        return sumaCena- popust;

    }
    public double ukupnaCena(SuperKartica popust){
        return cenaSvihAmbalaza(popust.getPopust());
    }



}
