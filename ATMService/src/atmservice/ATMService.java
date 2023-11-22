package atmservice;

interface ATMService {
    void Musteri(Musteri musteri);
    void bakiyeSorgula(Musteri musteri);
    void paraTransferi(Musteri gonderenM, Musteri alanM, int Tutar);
    void paraEkle(Musteri musteri, int Tutar);
    void paraCek(Musteri musteri, int Tutar);
      
}


