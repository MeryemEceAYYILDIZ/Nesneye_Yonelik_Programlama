
package vehicle;
import java.util.Scanner;

public class Vehicle {
    String Surucu;
    String GucKaynagi;
    String FrenSistemi;
    int YolcuSayisi;

    public Vehicle(String Surucu, String GucKaynagi, String FrenSistemi, int YolcuSayisi) {
        this.Surucu = Surucu;
        this.GucKaynagi = GucKaynagi;
        this.FrenSistemi = FrenSistemi;
        this.YolcuSayisi = YolcuSayisi;
    }
    
    public void TercihSebebi(){
        System.out.println("Tercih sebebi: ");
    }
    
    public void Yazdir(){
        System.out.println("Surucu: " + Surucu + "\nGuc Kaynagi: " + GucKaynagi + "\nFren Sistemi: " + FrenSistemi + "\nYolcu Sayisi: " + YolcuSayisi);
    }
}
