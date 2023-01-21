package d19_01_2023;

import java.sql.Struct;

public class Tetrapak extends Ambalaza{
    private boolean zaReciklazu;
    private double osnovnaCena;


    public boolean isZaReciklazu() {
        return zaReciklazu;
    }

    public void setZaReciklazu(boolean zaReciklazu) {
        this.zaReciklazu = zaReciklazu;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }





    public Tetrapak(String barKod, String nazivArikla, double netoTezina, double brutoTezina, boolean zaReciklazu, double osnovnaCena) {
        super(barKod, nazivArikla, netoTezina, brutoTezina);// atributi klase Ambalaza
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double racunajCenu() {
//        if(this.zaReciklazu){
//            return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
//        } else  {
//            return this.osnovnaCena;

        return this.zaReciklazu ? this.tezinaPakovanja() * 1.5 + this.osnovnaCena : this.osnovnaCena;
        }


//stampa: barKod,  nazivArikla,  netoTezina,  brutoTezina, zaReciklazu,  osnovnaCena
    @Override
    public void stampaj() {
        System.out.print(this.barKod + ", ");
        System.out.print(this.nazivArikla + ", ");
        System.out.print(this.netoTezina + ", ");
        System.out.print(this.brutoTezina + ", ");
        System.out.print(this.zaReciklazu+ ", ");
        System.out.println(this.osnovnaCena);

    }
}
