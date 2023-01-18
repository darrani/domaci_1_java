package d17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        VideoPlayer player = new VideoPlayer(100,74, 45, 720);

        player.stampaj();

        TimeControl time = new TimeControl(true);


        time.izvrsiAkciju(player);
        time.setPomeri(true);

        AudioControl audio = new AudioControl(falsegit);


        audio.izvrsiAkciju(player);
        audio.isPromeniZvuk(true);


        QualityOptimizerControl optimizerControl = new QualityOptimizerControl(100);
        optimizerControl.izvrsiAkciju(player);



    }
}
