package atmservice;


public class ATMApp implements ATMService{
    
    
    @Override
    public void Musteri(atmservice.Musteri musteri) {
        String isim = musteri.getIsim();
        String soyIsim = musteri.getSoyisim();
        int bakiye = musteri.getBakiye();
        int tcNo = musteri.getTCKNo();
        String adres = musteri.getAdres();
        System.out.println("Isim: " + isim + "\nSoyisim: " + soyIsim + "\nBakiye: " + bakiye + "\nTc. Kimlik No: " + tcNo + "\nAdres: " + adres);
    }

    @Override
    public void bakiyeSorgula(atmservice.Musteri musteri) {
        String isim = musteri.getIsim();
        System.out.println(isim + "'in bakiyesi: " + musteri.getBakiye());
    } 
    
    @Override
    public void paraTransferi(atmservice.Musteri gonderenM, atmservice.Musteri alanM, int Tutar) {
        
        int yeniBakiyeAlan = alanM.getBakiye() + Tutar;
        int yeniBakiyeGonderen = gonderenM.getBakiye() - Tutar;
        alanM.setBakiye(yeniBakiyeAlan);
        gonderenM.setBakiye(yeniBakiyeGonderen);
        String isim = gonderenM.getIsim();
        String isim2 = alanM.getIsim();
        System.out.println(isim + " " + isim2 + "'a " + Tutar + " TL gonderdi");
        System.out.println(isim2 + " " + "'in guncel bakiyesi:" + alanM.getBakiye());
        System.out.println(isim + "'in guncel bakiyesi:" + gonderenM.getBakiye());   
    }

    @Override
    public void paraEkle(atmservice.Musteri musteri, int Tutar) {
        int yeniBakiye = musteri.getBakiye() + Tutar;
        musteri.setBakiye(yeniBakiye);
        String isim = musteri.getIsim();
        System.out.println(Tutar + " eklendi");
        System.out.println(isim + "'in guncel bakiyesi:" + musteri.getBakiye());
    }

    @Override
    public void paraCek(atmservice.Musteri musteri, int Tutar) {
        int yeniBakiye = musteri.getBakiye() - Tutar;
        musteri.setBakiye(yeniBakiye);
        String isim = musteri.getIsim();
        System.out.println(Tutar + " cekildi");
        System.out.println(isim + "'in guncel bakiyesi:" + musteri.getBakiye());
    }        
}
