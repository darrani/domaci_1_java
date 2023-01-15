package d13_01_2023;

import java.util.ArrayList;

public class Student {
    private String brojIndexa;
    private String imeIPrezime;
    private String tipStudija;
    private ArrayList<Ispit>ispiti;

    public Student(String brojIndexa, String imeIPrezime, String tipStudija) {
        this.brojIndexa = brojIndexa;
        this.imeIPrezime = imeIPrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public String getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }
    public ArrayList<Ispit>getIspiti(){
        return ispiti;
    }
  //  metoda dodaj ispit
    public void dodajIspit(Ispit ispit){
        this.ispiti.add(ispit);
    }

    //metoda koja racuna prosek
    public double prosek() {
        double ocene = 0;
        int brojacIspita = 0;
        double prosek = 0;
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).polozioJe() == true){
                brojacIspita++;
                ocene = ocene + this.ispiti.get(i).getOcena();
            }
            prosek = ocene / brojacIspita;
        }
        return prosek;
    }
    //metoda stampaj
    public void stampaj(){
        System.out.println(this.brojIndexa+ "-"+this.imeIPrezime+"-"+this.tipStudija);
        System.out.println("Predmeti: ");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNazivPredmeta()+"-"+this.ispiti.get(i).getOcena());

        }
        System.out.println("Prosekje: " + this.prosek());
    }
}
