package Class;

public class Lukisan {
    protected String Judul;
    protected String NamaPelukis;
    protected int Panjang;
    protected int Lebar;
    protected int TahunPembuatan;
    protected int Harga;
    protected int Berat;

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getNamaPelukis() {
        return NamaPelukis;
    }

    public void setNamaPelukis(String namaPelukis) {
        NamaPelukis = namaPelukis;
    }

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int panjang) {
        Panjang = panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int lebar) {
        Lebar = lebar;
    }

    public int getTahunPembuatan() {
        return TahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        TahunPembuatan = tahunPembuatan;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        Harga = harga;
    }

    public int getBerat() {
        return Berat;
    }

    public void setBerat(int berat) {
        Berat = berat;
    }

    public Lukisan(String Judul, String NamaPelukis, int Panjang, int Lebar, int TahunPembuatan, int Harga, int Berat){
        this.Judul = Judul;
        this.NamaPelukis = NamaPelukis;
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.TahunPembuatan = TahunPembuatan;
        this.Harga = Harga;
        this.Berat = Berat;
    }
    
    public Lukisan(){}
    
}