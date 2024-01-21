package asansor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hareket implements metodlar{
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    int gidilecekKat;
    int katNo=0;
    int toplamAgirlik=0;
    int yolcuSayisi=0;
    int enUstKat=9;
    int kapasite=200;
    HashSet<Integer> gidilecekKatlar = new HashSet<>(); // aynı kata birden fazla kez gidilmeyeceği için HashSet kullandım
    HashMap<Integer, Integer> binenYolcu = new HashMap<>(); // gidilecek kat ve o kata gidecek kişinin kilo bilgisini birlikte tutmak için
    
    @Override
    public void dugme(){
        System.out.println("Kapi aciliyor!");
        bekleme();
        for(int i=0; i<rand.nextInt(5)+1; i++){ //1 ile 6 arasında rastgele sayıda yolcu almak için
            yolcuAlma();
        }
        System.out.println("Toplam agirlik: " + toplamAgirlik); //Kontrol için
        if(toplamAgirlik>=kapasite){
            System.out.println("Azami agirligin ustunde! Lutfen asansorun kapasitesinden fazla yolcu binisi olmasin!");
            yolcuIndir();
        }
        
        bekleme();
        System.out.println("Kapi kapaniyor!");
        for(int j=katNo; j<=enUstKat; j++){
            if(gidilecekKatlar.contains(j)){
                goUp(j);
                toplamAgirlik=toplamAgirlik-binenYolcu.get(j);
                System.out.println("Toplam agirlik: " + toplamAgirlik);
                binenYolcu.remove(j);
                gidilecekKatlar.remove(j);
            }
        }
        for(int k=katNo; k>=0; k--){
            if(gidilecekKatlar.contains(k)){
                goDown(k);
                toplamAgirlik=toplamAgirlik-binenYolcu.get(k);
                System.out.println("Toplam agirlik: " + toplamAgirlik);
                binenYolcu.remove(k);
                gidilecekKatlar.remove(k);
            }
        }
        /*
        else if((katNo-gidilecekKat)==0){
            System.out.println("Kat" + katNo + "Kapi aciliyor!");
            toplamAgirlik=toplamAgirlik-yolcu.getKilo();
        }*/
        
    }
    
    @Override
    public void yolcuAlma(){
        Yolcu yolcu = new Yolcu(); //Her yolcuAlma metodu çağırıldığında bir yolcu nesnesi oluşturuluyor
        yolcuSayisi++;
        toplamAgirlik=toplamAgirlik+yolcu.getKilo(); // Asansör taşıma kapasitesini aşıp aşmadığını kontrol etmek için
        System.out.println("Binen yolcunun agirligi: " + yolcu.getKilo() + "\nAsansordeki toplam agirlik: " + toplamAgirlik); //Kontrol için
        gidilecekKatAlma(yolcu);
        binenYolcu.put(gidilecekKat, yolcu.getKilo());
        gidilecekKatlar.add(gidilecekKat);
        System.out.println(binenYolcu); //Kontrol için
    }
    
    @Override
    public void gidilecekKatAlma(Yolcu yolcu){
        System.out.println("0-9 arasi gitmek istediginiz kati seciniz: ");
        gidilecekKat = input.nextInt();
        if(gidilecekKat<0 || gidilecekKat>9){
            System.out.println("Hatali secim yaptiniz!");
            gidilecekKatAlma(yolcu);
        }
        yolcu.setGidilecekKat(gidilecekKat);
    }
    
    @Override
    public void goUp(int j){
        System.out.println("Yukari yonde hareket ediliyor!");
        while(katNo!=j+1){
            bekleme();
            System.out.println("Kat:" + katNo++);
        }
        kapi();
    }
    
    @Override
    public void goDown(int k){
        System.out.println("Asagi yonde hareket ediliyor!");
        while(katNo!=k-1){
            bekleme();
            System.out.println("Kat:" + katNo--);
        }
        kapi();
    }
    
    @Override
    public void kapi(){
        System.out.println("Kapi aciliyor!");
        bekleme();
        bekleme();
        System.out.println("Kapi kapaniyor!");
        bekleme();
    }
    
    @Override
    public void bekleme(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hareket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void yolcuIndir(){
        for(int j=katNo; j<=enUstKat; j++){
            if(gidilecekKatlar.contains(j)){
                toplamAgirlik=toplamAgirlik-binenYolcu.get(j);
                System.out.println("Yolcu indi! Toplam agirlik: " + toplamAgirlik);
                binenYolcu.remove(j);
                gidilecekKatlar.remove(j); 
                if(toplamAgirlik<kapasite){
                    break;
                }
            }
        }
        for(int k=katNo; k>=0; k--){
            if(gidilecekKatlar.contains(k)){
                toplamAgirlik=toplamAgirlik-binenYolcu.get(k);
                System.out.println("Yolcu indi! Toplam agirlik: " + toplamAgirlik);
                binenYolcu.remove(k);
                gidilecekKatlar.remove(k);
                if(toplamAgirlik<kapasite){
                    break;
                }
            }
        }
        System.out.println(binenYolcu); //Kontrol için
    }
}
