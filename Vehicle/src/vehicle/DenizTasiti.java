package vehicle;

public class DenizTasiti extends Vehicle{
    int Uzunluk;

    public DenizTasiti(int Uzunluk, String Surucu, String GucKaynagi, String FrenSistemi, int YolcuSayisi) {
        super(Surucu, GucKaynagi, FrenSistemi, YolcuSayisi);
        this.Uzunluk = Uzunluk;
    }
    
    @Override
    public void TercihSebebi(){
        super.TercihSebebi();
        System.out.println("Denizden ulasim saglamak. ");
    }  
    
    @Override
    public void Yazdir(){
        super.Yazdir();
        System.out.println("Uzunluk: " + Uzunluk );
    }
}
