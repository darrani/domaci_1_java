package d16_01_2023;

public class Igrac extends Osoba{
    public int igracevBroj;
    public String pozicija;
    public boolean kapiten;

    public Igrac() {
    }

    public Igrac(String imeIPrezime, String jmbg, int godinarodjenja,int igracevBroj, String pozicija, boolean kapiten) {
        super(imeIPrezime,jmbg, godinarodjenja);
        this.igracevBroj = igracevBroj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;

    }

    public int getIgracevBroj() {
        return igracevBroj;
    }

    public void setIgracevBroj(int igracevBroj) {
        this.igracevBroj = igracevBroj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }
@Override
    public void stampaj(){
        super.stampaj();
    System.out.println("je igrac sa brojem "+ this.igracevBroj+ " i igra na poziciji "+
            this.pozicija+ " i kapiten je .");
    System.out.println();
}


    }
