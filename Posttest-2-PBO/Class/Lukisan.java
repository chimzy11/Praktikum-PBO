package Class;

public class Lukisan {
    private String Judul;
    private String NamaPelukis;
    private String JenisLukisan;
    private int Panjang;
    private int Lebar;
    private int TahunPembuatan;
    private int Harga;

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

    public String getJenisLukisan() {
        return JenisLukisan;
    }

    public void setJenisLukisan(String jenisLukisan) {
        JenisLukisan = jenisLukisan;
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

    public Lukisan(String Judul, String NamaPelukis, String JenisLukisan, int Panjang, int Lebar, int TahunPembuatan, int Harga){
        this.Judul = Judul;
        this.NamaPelukis = NamaPelukis;
        this.JenisLukisan = JenisLukisan;
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.TahunPembuatan = TahunPembuatan;
        this.Harga = Harga;
    }
    
    public Lukisan(){}
    
}