package atmservice;
//import java.util.Scanner;

public class ATMTest {
    //Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("Ahmet", "Yalcin", 20000, 1234567891, "Malatya");
        Musteri musteri2 = new Musteri("Mahmut", "Yalcin", 50000, 1548769215, "Elazig");
        ATMApp atm = new ATMApp();
        atm.Musteri(musteri1);
        atm.Musteri(musteri2);
        atm.bakiyeSorgula(musteri1);
        atm.bakiyeSorgula(musteri2);
        atm.paraCek(musteri1, 200);
        atm.paraEkle(musteri2, 500);
        atm.paraTransferi(musteri1, musteri2, 700);
    }    
}
