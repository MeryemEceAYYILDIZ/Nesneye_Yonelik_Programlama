package atmservice;

public class Musteri{
    private String isim;
    private String soyisim;
    private int bakiye;
    private int TCKNo;
    private String adres;

    public Musteri(String isim, String soyisim, int bakiye, int TCKNo, String adres) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bakiye = bakiye;
        this.TCKNo = TCKNo;
        this.adres = adres;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public int getTCKNo() {
        return TCKNo;
    }

    public void setTCKNo(int TCKNo) {
        this.TCKNo = TCKNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
}
