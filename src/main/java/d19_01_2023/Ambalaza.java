package d19_01_2023;

public abstract class Ambalaza {
    protected String barKod;
    protected String nazivArikla;
    protected double netoTezina;
    protected double brutoTezina;

    //difoltni
    public Ambalaza() {
        super();
    }
// sa parametrima
    public Ambalaza(String barKod, String nazivArikla, double netoTezina, double brutoTezina) {
        this.barKod = barKod;
        this.nazivArikla = nazivArikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNazivArikla() {
        return nazivArikla;
    }

    public void setNazivArikla(String nazivArikla) {
        this.nazivArikla = nazivArikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double tezinaPakovanja(){
        return this.brutoTezina - this.netoTezina;
    }
    public abstract double racunajCenu();
    public abstract void stampaj();
}
