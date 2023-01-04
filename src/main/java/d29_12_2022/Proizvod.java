package d29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;
    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + " dinara, " + this.tezina
                + " grama." );
    }
    public void povecajCenu(int povecanje){
        this.cena = this.cena + povecanje;
        System.out.println("Cena sa povecanjem je " + this.cena + " dinara");
    }
        public double vratiCenuSaPopustom(int popust) {
            return (cena * (100 - popust)) / 100;
        }

        public double racunajPostarinu() {
            if (tezina <= 100) {
                return 200;
            } else if (tezina <= 500) {
                return 400;

            } else {
                return 1000;
            }
    }
}
