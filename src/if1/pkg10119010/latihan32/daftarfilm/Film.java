/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan32.daftarfilm;

/**
 *
 * @author MIM
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying() {
        System.out.println();
        System.out.println("Judul Film\t: ".concat(filmName));
        System.out.println("Genre Film\t: ".concat(filmGenre));
        System.out.println("Rating Film\t: "+ Double.toString(filmRating));
        System.out.println("Duration Film\t: "+ Integer.toString(filmDuration) + " Menit");
    }
}
