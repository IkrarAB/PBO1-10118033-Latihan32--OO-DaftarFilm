
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan daftar film
 *  
 */

package pbo1.pkg10118033.latihan32;

public class PBO110118033Latihan32 {
    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===\n");
        Film film1 = new Film();
        Film film2 = new Film();
        Film film3 = new Film();
        Film film4 = new Film();
        film1.nowPlaying("Venom", "Action, Horror, Scifi", 8.5, 120);
        film2.nowPlaying("Small Foot", "Animation", 9.0, 96);
        film3.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        film4.nowPlaying("Asih", "Horror", 6.0, 100);
        System.out.println("(Developed By : Ikrar AB)");
    }
}
