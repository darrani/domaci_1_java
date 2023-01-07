package mini_projekat;

public class XOTabla {
    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeIgracaX;
    private String imeIgracaO;

    private String naPotezu;
    private  String igrac;

//    getter
    public String getImeIgracaX(){
        return this.imeIgracaX;
    }public String getImeIgracaO(){
        return this.imeIgracaO;
    }
    public String getNaPotezu(){
        return this.naPotezu;
    }
//setter
    public void setImeIgracaX(String imeIgracaX){
        this.imeIgracaX = imeIgracaX;
    }
    public void setImeIgracaO(String imeIgracaO) {
        this.imeIgracaO = imeIgracaO;
    }
    public void pokreniIgru(){
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        this.naPotezu = "X";
    }


    public void stampaj() {
        System.out.println(" " + polje1 + " | " + polje2 + " " + " | " + polje3);
        System.out.println(" " + polje4 + " | " + polje5 + " " + " | " + polje6);
        System.out.println(" " + polje7 + " | " + polje8 + " " + " | " + polje9);
        System.out.println("Igrac X: " + this.imeIgracaX);
        System.out.println("Igrac O: " + this.imeIgracaO);
        System.out.println("Na potezu je igrac " + this.naPotezu);

    }


    public boolean poljePrazno(int polje){
        if(polje == 1 && polje1.equals(" ")){
            return true;
        }else if(polje == 2 && polje2.equals(" ")){
            return true;
        }else if(polje == 3 && polje3.equals(" ")){
            return true;
        }else if(polje == 4 && polje4.equals(" ")){
            return true;
        }else if(polje == 5 && polje5.equals(" ")){
            return true;
        }else if(polje == 6 && polje6.equals(" ")){
            return true;
        }else if(polje == 7 && polje7.equals(" ")){
            return true;
        }else if(polje == 8 && polje8.equals(" ")){
            return true;
        }else if(polje == 9 && polje9.equals(" ")){
            return true;
        }else{
            return false;
        }

    }
    public void zameniIgraca(){
        if(this.naPotezu.equals("X")){
            this.naPotezu = "O";
        }else {
            this.naPotezu = "X";
        }

    }
    public void odigrajPotez(String polje) {
        if (polje.equals("1")  && naPotezu.equals("X")) {
            this.polje1 = "X";
        } else if (polje.equals("2")  && naPotezu.equals("X")) {
            this.polje2 = "X";
        }else if (polje.equals("3")  && naPotezu.equals("X")) {
            this.polje3 = "X";
        }else if (polje.equals("4")  && naPotezu.equals("X")) {
            this.polje4 = "X";
        }else if (polje.equals("5")  && naPotezu.equals("X")) {
            this.polje5 = "X";
        }else if (polje.equals("6")  && naPotezu.equals("X")) {
            this.polje6 = "X";
        }else if (polje.equals("7")  && naPotezu.equals("X")) {
            this.polje7 = "X";
        }else if (polje.equals("8")  && naPotezu.equals("X")) {
            this.polje8 = "X";
        }else if (polje.equals("9")  && naPotezu.equals("X")) {
            this.polje9 = "X";
        }else if (polje.equals("1")  && naPotezu.equals("O")) {
            this.polje1 = "O";
        }else if (polje.equals("2")  && naPotezu.equals("O")) {
            this.polje2 = "O";
        }else if (polje.equals("3")  && naPotezu.equals("O")) {
            this.polje3 = "O";
        }else if (polje.equals("4")  && naPotezu.equals("O")) {
            this.polje4 = "O";
        }else if (polje.equals("5")  && naPotezu.equals("O")) {
            this.polje5 = "O";
        }else if (polje.equals("6")  && naPotezu.equals("O")) {
            this.polje6 = "O";
        }else if (polje.equals("7")  && naPotezu.equals("O")) {
            this.polje7 = "O";
        }else if (polje.equals("8")  && naPotezu.equals("O")) {
            this.polje8 = "O";
        }else if (polje.equals("9")  && naPotezu.equals("O")) {
            this.polje9 = "O";
        }

    }


    public boolean popunjenaTabla (){
        if (!(this.polje1.equals(" ") && this.polje2.equals(" ") && this.polje3.equals(" ")
                && this.polje4.equals(" ") && this.polje5.equals(" ") && this.polje6.equals(" ") &&
                this.polje7.equals(" ") && this.polje8.equals(" ") && this.polje9.equals(" "))) {

             return true;
        }else{
            return false;
        }
    }
    public boolean pobednikX(){
        if (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")) {
            return true;
        } else if ((this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")) ||
                (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")) ||
                (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")) ||
                (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")) ||
                (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")) ||
                (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")) ||
                (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X"))) {
            return true;
        } else {
            return false;
        }

    }

    public boolean pobednikO() {
        if((this.polje1.equals("O") && this.polje2.equals("O") && this.polje3.equals("O"))||
                (this.polje1.equals("O") && this.polje4.equals("O") && this.polje7.equals("O"))||
                (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O"))||
                (this.polje2.equals("O") && this.polje5.equals("O") && this.polje8.equals("O"))||
                (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O"))||
                (this.polje3.equals("O") && this.polje6.equals("O") && this.polje9.equals("O"))||
                (this.polje4.equals("O") && this.polje5.equals("O") && this.polje6.equals("O"))||
                (this.polje7.equals("O") && this.polje8.equals("O") && this.polje9.equals("O"))){
                    return true;
        }else{
                    return false;
        }

    }


}
