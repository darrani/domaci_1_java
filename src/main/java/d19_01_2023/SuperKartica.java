package d19_01_2023;

public class SuperKartica {
    private String brojKartice;
    private String imeIPrezime;
    private double popust;

    public SuperKartica() {
        super();
    }

    public SuperKartica(String brojKartice, String imeIPrezime, double popust) {
        this.brojKartice = brojKartice;
        this.imeIPrezime = imeIPrezime;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }


    public void stampajKarticu(){
        System.out.println(this.brojKartice + ", " + this.imeIPrezime);
    }
}
