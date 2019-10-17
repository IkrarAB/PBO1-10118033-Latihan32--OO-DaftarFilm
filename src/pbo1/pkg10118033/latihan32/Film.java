package pbo1.pkg10118033.latihan32;

public class Film {
    String filmName, filmGenre;
    double filmRating;
    int filmDuration;
    
    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration ){
        this.filmName = filmName;
        this.filmGenre = filmGenre;
        this.filmRating = filmRating;
        this.filmDuration = filmDuration;
        System.out.println("Judul Film    : "+filmName);
        System.out.println("Genre Film    : "+filmGenre);
        System.out.println("Rating Film   : "+filmRating);
        System.out.println("Duration Film : "+filmDuration+" Menit\n");
    }
}
