package Array;

public class Main {
    public static void main(String[] args) {

        //2D array = an array of arrays

        String[][] anime = new String[3][3];

        anime[0][0] = "ichigo";
        anime[0][1] = "naruto";
        anime[0][2] = "sasuke";
        anime[1][0] = "aizen";
        anime[1][1] = "goku";
        anime[1][2] = "asta";
        anime[2][0] = "yami";
        anime[2][1] = "gojo";
        anime[2][2] = "sukuna";

        for(int i=0; i<anime.length; i++) {
            for(int a=0; a<anime[i].length;a++) {
                System.out.println(anime[i][a]+" ");

            }
            System.out.println();
        }
       

        

    }
}