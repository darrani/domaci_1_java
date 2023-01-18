package d17_01_2023;

public class AudioControl extends Control{

    private boolean promeniZvuk;

    public boolean isPromeniZvuk(boolean b) {
        return promeniZvuk;
    }

    public void setPojacaj(boolean promeniZvuk) {
        this.promeniZvuk = promeniZvuk;
    }
 //kostruktor
    public AudioControl(){

    }

    public AudioControl(boolean promeniZvuk) {
        this.promeniZvuk = promeniZvuk;
    }

    //metoda pojacava ili smanjuje zvuk za 1, o opsegu od 0_100

    @Override
    public void izvrsiAkciju(VideoPlayer player) {

        if(this.promeniZvuk){
            int pojacaj = player.getJacina() + 1;
            player.setJacina(pojacaj);
            if(pojacaj >100){
                pojacaj = 100;
            }else {
                int smanji = player.getJacina() - 1;
                player.setJacina(smanji);
                if (smanji < 0) {
                    smanji = 0;
                }
            }
        }
    }



}
