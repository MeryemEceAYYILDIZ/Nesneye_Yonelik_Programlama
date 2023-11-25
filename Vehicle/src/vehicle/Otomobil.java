package vehicle;

public class Otomobil extends MotorluKaraTasiti{
    boolean cocukKilidi;
    int havayastigiSayisi;

    public Otomobil(boolean cocukKilidi, int havayastigiSayisi, int VitesSayisi, String yakitTuru, int MotorHacmi, int TekerlekSayisi, int TekerlekCapi, String Surucu, String GucKaynagi, String FrenSistemi, int YolcuSayisi) {
        super(VitesSayisi, yakitTuru, MotorHacmi, TekerlekSayisi, TekerlekCapi, Surucu, GucKaynagi, FrenSistemi, YolcuSayisi);
        this.cocukKilidi = cocukKilidi;
        this.havayastigiSayisi = havayastigiSayisi;
    }

    
    public void TercihSebebi(){
        super.TercihSebebi();
        System.out.println("Dis etkenlere karsi surucuyu korur. ");
    }  
    
    @Override
    public void Yazdir(){
        super.Yazdir();
        System.out.println("Cocuk kilidi: " + cocukKilidi + "\nHava Yastigi sayisi: " + havayastigiSayisi);
    }
    
}
