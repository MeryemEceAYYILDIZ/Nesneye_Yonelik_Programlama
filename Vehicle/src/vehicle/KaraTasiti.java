package vehicle;

public class KaraTasiti extends Vehicle{
    int TekerlekSayisi;
    double TekerlekCapi;

    public KaraTasiti(int TekerlekSayisi, int TekerlekCapi, String Surucu, String GucKaynagi, String FrenSistemi, int YolcuSayisi) {
        super(Surucu, GucKaynagi, FrenSistemi, YolcuSayisi);
        this.TekerlekSayisi = TekerlekSayisi;
        this.TekerlekCapi = TekerlekCapi;
    }
    
    @Override
    public void TercihSebebi(){
        super.TercihSebebi();
        System.out.println("Karadan ulasim saglamak. ");
    }    
    
    @Override
    public void Yazdir(){
        System.out.println("Tekerlek sayisi: " + TekerlekSayisi + "\nTekerlek Capi: " + TekerlekCapi);
    }
     
}
