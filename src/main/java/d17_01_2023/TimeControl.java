package d17_01_2023;

public class TimeControl extends  Control{

    private boolean pomeri;

    public boolean isPomeri() {
        return pomeri;
    }

    public void setPomeri(boolean pomeri) {
        this.pomeri = pomeri;
    }

    public TimeControl() {
    }

    public TimeControl(boolean pomeri) {
        this.pomeri = pomeri;
    }
    //metoda pomeri trenutno vreme videa za 15s unapred ili unazad zavisno od atributa

    @Override
    public void izvrsiAkciju(VideoPlayer player) {

        if(this.pomeri){
          double  novoVreme = player.getTrenutnoVreme() + 15;
            player.setTrenutnoVreme((int) novoVreme);
            if (novoVreme > player.getTrenutnoVreme()){
                novoVreme = player.getTrenutnoVreme();
                player.setTrenutnoVreme((int) novoVreme);
            }
        }else {
            double pomeriUnazad = player.getTrenutnoVreme() - 15;
            player.setTrenutnoVreme((int) pomeriUnazad);
            if(pomeriUnazad < 0){
                player.setTrenutnoVreme((int) pomeriUnazad);
            }
        }


    }

}
