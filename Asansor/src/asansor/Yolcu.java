package asansor;
import java.util.Random;
public class Yolcu {
    Random rand = new Random();
    int kilo;
    int gidilecekKat;
    
    public Yolcu() {
        this.kilo = rand.nextInt(120)+10;  //10 ile 130 arasında rastgele bir kilo atanıyor 
        this.gidilecekKat= gidilecekKat;
    }

    public int getKilo() {
        return kilo;
    }

    public void setGidilecekKat(int gidilecekKat) {
        this.gidilecekKat = gidilecekKat;
    }
    
}
