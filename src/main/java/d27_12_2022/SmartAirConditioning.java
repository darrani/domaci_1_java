package d27_12_2022;

public class SmartAirConditioning {

    public String marka;
    public int izabranaTemperatura;
    public String mod;
    public void stampaj(){
        System.out.println(" Marka klime je " + this.marka + " koja ima samo mod " + this.mod + ".");
    }
    public boolean vecaTemperatura(int spoljasnjaTemperatura) {
        return spoljasnjaTemperatura > this.izabranaTemperatura;
    }



}
