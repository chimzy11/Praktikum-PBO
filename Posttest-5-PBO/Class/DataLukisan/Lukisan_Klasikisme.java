package Class.DataLukisan;
import Class.*;

public class Lukisan_Klasikisme extends Lukisan{
    private int IdKlasikisme;
    public final String KodeLukisan = "LK";
    
    public Lukisan_Klasikisme(String Judul, String NamaPelukis, int Panjang, int Lebar,
            int TahunPembuatan, int Harga, int Berat, int idKlasikisme) {
        super(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat);
        this.IdKlasikisme = idKlasikisme;
    }

    public int getIdKlasikisme() {
        return IdKlasikisme;
    }

    public void setIdKlasikisme(int idKlasikisme) {
        this.IdKlasikisme = idKlasikisme;
    }

    public String getKodeLukisan() {
        return KodeLukisan;
    }
    
    @Override
    public void display(){
        System.out.println("Id Lukisan        : " + this.KodeLukisan +  this.IdKlasikisme);
        System.out.println("Nama Pelukis      : " +  this.NamaPelukis);
        System.out.println("Ukuran Lukisan    : " +  this.Panjang + " cm" + " x " + this.Lebar + " cm");
        System.out.println("Berat Lukisan     : " +  this.Berat + " Kg");
        System.out.println("Tahun Pembuatan   : " +  this.TahunPembuatan);
        System.out.println("Harga Lukisan     : Rp." +  this.Harga);
        System.out.println("");
    }

    public void display(String Klasikisme){
        if (Klasikisme.equals("Klasikisme")){
            System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
        } else {
            display();
        }
    }
}