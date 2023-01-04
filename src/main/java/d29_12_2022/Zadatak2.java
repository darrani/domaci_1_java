package d29_12_2022;

public class Zadatak2 {
    public static void main(String[] args) {
        FacebookPost newPost = new FacebookPost();
        newPost.setObjavio("Dragana Nikolic");
        newPost.setProfil("Pera Peric");
        newPost.setText("Polozili smo ispit!");
        newPost.lajkuj();
        newPost.lajkuj();
        newPost.lajkuj();
        newPost.lajkuj();
        newPost.lajkuj();
        newPost.dislajkuj();
        newPost.dislajkuj();
        newPost.sheruj();
        newPost.sheruj();
        newPost.sheruj();
        newPost.sheruj();
        newPost.sheruj();
        newPost.stampaj();

        //settere za sve atribute osim broja lajkova i broja deljenja
    }
}
