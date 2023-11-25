package vehicle;

public class Main {
    public static void main(String[] args){
        HavaTasiti ucak = new HavaTasiti("3000 feet", "Pilot", "Motor", "\n1-Hava freni\n2-Thrust reverser sistemi\n3-Inis takimi frenleri", 480 );
        ucak.TercihSebebi();
        ucak.Yazdir();
        System.out.println();
        DenizTasiti gemi = new DenizTasiti(232, "Kaptan", "KW Man 16 V 32/40", "yok", 1400);
        gemi.TercihSebebi();
        gemi.Yazdir();
        System.out.println();
        Otomobil araba = new Otomobil(true, 7, 5, "benzinli", 1, 4, 34, "Şoför", "Motor", "Hidrostatik Rejeneratif", 5);
        araba.TercihSebebi();
        araba.Yazdir();
    }
    
}
