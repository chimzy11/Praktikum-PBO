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
        this.Judul = judul;
    }

    public String getNamaPelukis() {
        return NamaPelukis;
    }

    public void setNamaPelukis(String namaPelukis) {
        this.NamaPelukis = namaPelukis;
    }

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int panjang) {
        this.Panjang = panjang;
    }

    public int getLebar() {
        return Lebar;
    }

    public void setLebar(int lebar) {
        this.Lebar = lebar;
    }

    public int getTahunPembuatan() {
        return TahunPembuatan;
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.TahunPembuatan = tahunPembuatan;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int harga) {
        this.Harga = harga;
    }

    public int getBerat() {
        return Berat;
    }

    public void setBerat(int berat) {
        this.Berat = berat;
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
    
    public void display(){
        System.out.println("Judul Lukisan     : " +  this.Judul);
        System.out.println("Nama Pelukis      : " +  this.NamaPelukis);
        System.out.println("Ukuran Lukisan    : " +  this.Panjang + " cm" + " x " + this.Lebar + " cm");
        System.out.println("Berat Lukisan     : " +  this.Berat + " Kg");
        System.out.println("Tahun Pembuatan   : " +  this.TahunPembuatan);
        System.out.println("Harga Lukisan     : Rp." +  this.Harga);
        System.out.println("");
    }
}