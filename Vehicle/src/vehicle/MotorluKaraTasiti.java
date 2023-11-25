package vehicle;

public class MotorluKaraTasiti extends KaraTasiti{
    int VitesSayisi;
    String yakitTuru;
    double MotorHacmi;

    public MotorluKaraTasiti(int VitesSayisi, String yakitTuru, int MotorHacmi, int TekerlekSayisi, int TekerlekCapi, String Surucu, String GucKaynagi, String FrenSistemi, int YolcuSayisi) {
        super(TekerlekSayisi, TekerlekCapi, Surucu, GucKaynagi, FrenSistemi, YolcuSayisi);
        this.VitesSayisi = VitesSayisi;
        this.yakitTuru = yakitTuru;
        this.MotorHacmi = MotorHacmi;
    }
    
    @Override
    public void TercihSebebi(){
        super.TercihSebebi();
        System.out.println("Motorlu olmasi dolayisiyla ulasimda kolaylik saglar. ");
    }  
    
    @Override
    public void Yazdir(){
        System.out.println("Vites sayisi: " + VitesSayisi + "\nYakit turu: " + yakitTuru + "\nMotorHacmi: " + MotorHacmi);
    }
}
