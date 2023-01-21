package d19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{

    private double kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza() {
    }

    public StaklenaAmbalaza(String barKod, String nazivArikla, double netoTezina, double brutoTezina, double kaucija, boolean placaSeKaucija, double osnovnaCena) {
        super(barKod, nazivArikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double racunajCenu() {
        if(this.placaSeKaucija==true){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }else{
            return this.osnovnaCena * 1.2;
        }

    }
//stampa: barKod, nazivArikla, netoTezina, brutoTezina, kaucija, placaSeKaucija, osnovnaCena) {
//        super(barKod, nazivArikla, netoTezina, brutoTezina);
    @Override
    public void stampaj() {
        System.out.print(this.barKod + ", ");
        System.out.print(this.nazivArikla + ", ");
        System.out.print(this.netoTezina + ", ");
        System.out.print(this.brutoTezina + ", ");
        System.out.print(this.kaucija+ ", ");
        System.out.print(this.placaSeKaucija + ", ");
        System.out.println(this.osnovnaCena);


    }
}
