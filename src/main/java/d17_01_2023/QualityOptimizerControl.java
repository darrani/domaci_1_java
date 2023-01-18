package d17_01_2023;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer player) {
        if (this.brzinaInterneta * 10.1 < 144) {
           player.setKvalitet(144);
        } else if (this.brzinaInterneta * 10.1 <240) {
            player.setKvalitet(240);
        }else if (this.brzinaInterneta * 10.1 <360) {
            player.setKvalitet(360);
        }else if (this.brzinaInterneta * 10.1 <480) {
            player.setKvalitet(480);
        }else if (this.brzinaInterneta * 10.1 <720) {
            player.setKvalitet(720);
        }else if (this.brzinaInterneta * 10.1 < 1080) {
            player.setKvalitet(1080);
        }

    }
}
