package d13_01_2023;

public class Ispit {

 private String nazivPredmeta;
private int ocena;
private String imeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imeProfesora = imeProfesora;
    }
    public String getNazivPredmeta(){
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)

    public boolean polozioJe(){
        if(this.ocena>5 && this.ocena<=10){
            return true;
        }
        return false;
    }
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
public void stampaj(){
    System.out.println(this.nazivPredmeta+"-"+ this.imeProfesora + " - "+ this.ocena);
}
}
