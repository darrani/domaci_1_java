package d16_01_2023;

public class Trener extends Osoba{
    public int godineIskustva;
    public String tip;

    public Trener(String imeIprezime, String jmbg, int godinarodjenja, int godineIskustva, String tip) {
        super(imeIprezime,jmbg, godinarodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
    @Override
    public void stampaj(){
        super.stampaj();
        System.out.println("je trener "+this.tip+" sa "+
                        this.godineIskustva +" godina iskustva.");
        System.out.println();

    }
}
