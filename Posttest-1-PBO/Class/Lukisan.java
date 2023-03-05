package Class;

public class Lukisan {
    String Judul;
    String NamaPelukis;
    String JenisLukisan;
    int Panjang;
    int Lebar;
    int TahunPembuatan;
    int Harga;

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