package d29_12_2022;

public class FacebookPost {
    private String objavio;
    private String profil;
    private String text;
    private int like;
    private int share;
    public String getObjavio(){
        return  this.objavio;
    }
    public String getProfil(){
        return this.objavio;
    }
    public String getText(){
        return this.text;
    }
    public int getLike(){
        return this.like;
    }
    public int getShare(){
        return this.share;
    }


    public void setObjavio(String objavio) {
        this.objavio = objavio;
    }
    public void setProfil(String profil){
        this.profil = profil;
    }
    public void setText(String text){
        this.text = text;
    }
        public void lajkuj(){
            this.like = this.like + 1;}
        public void dislajkuj() {
            if (this.like > 0) {
                this.like = this.like - 1;}
            else { this.like = 0;}
        }
        public void sheruj(){
            this.share++;
        }
//        print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
        public void stampaj(){
            System.out.println(objavio + " >>> " + profil);
            System.out.println(text);
            System.out.println("Likes: " + this.like + " |  Shares: " + this.share);
        }


}
