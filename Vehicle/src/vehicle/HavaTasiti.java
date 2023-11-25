package vehicle;

public class HavaTasiti extends Vehicle{
    String maxYukseklik;

    public HavaTasiti(String maxYukseklik, String Surucu, String GucKaynagi, String FrenSistemi, int YolcuSayisi) {
        super(Surucu, GucKaynagi, FrenSistemi, YolcuSayisi);
        this.maxYukseklik = maxYukseklik;
    }
    
    @Override
    public void TercihSebebi(){
        super.TercihSebebi();
        System.out.println("Havadan ulasim saglamak. ");
    } 
    
    @Override
    public void Yazdir(){
        super.Yazdir();
        System.out.println("Maksimum yukseklik: " + maxYukseklik);
    }
}
