package d17_01_2023;

public class VideoPlayer {
    private int duzina;
    private int trenutnoVreme;
    private int jacina;
    private int kvalitet;
//getter/setter
    public int getDuzina() {
        return duzina;
    }

    public void setDuzina(int duzina) {
        this.duzina = duzina;
    }

    public int getTrenutnoVreme() {
        return trenutnoVreme;
    }

    public void setTrenutnoVreme(int trenutnoVreme) {
        this.trenutnoVreme = trenutnoVreme;
    }

    public int getJacina() {
        return jacina;
    }

    public void setJacina(int jacina) {
        this.jacina = jacina;
    }

    public int getKvalitet() {
        return kvalitet;
    }

    public void setKvalitet(int kvalitet) {
        this.kvalitet = kvalitet;
    }

//    public VideoPlayer() {
//        this.duzina = duzina;
//        this.trenutnoVreme = trenutnoVreme;
//        this.jacina = jacina;
//        this.kvalitet = kvalitet;

    //}


    public VideoPlayer(int duzina, int trenutnoVreme, int jacina, int kvalitet) {
        this.duzina = duzina;
        this.trenutnoVreme = trenutnoVreme;
        this.jacina = jacina;
        this.kvalitet = kvalitet;
    }

    public void stampaj(){
        System.out.println("Trenutno vreme videa: " + this.trenutnoVreme);
        System.out.println("Jacina zvuka: " + this.jacina);
        System.out.println("Kvalitet videa: " + this.kvalitet);
    }

}
