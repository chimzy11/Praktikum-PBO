package Class.DataLukisan;
import Class.*;

public class Lukisan_Optik extends Lukisan{
    private int IdOptik;
    public final String KodeLukisan = "LOP";

    public Lukisan_Optik(String Judul, String NamaPelukis, int Panjang, int Lebar,
            int TahunPembuatan, int Harga, int Berat, int idOptik) {
        super(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat);
        this.IdOptik = idOptik;
    }

    public int getIdOptik() {
        return IdOptik;
    }

    public void setIdOptik(int idOptik) {
        this.IdOptik = idOptik;
    }

    public String getKodeLukisan() {
        return KodeLukisan;
    }

    
    @Override
    public void display(){
        System.out.println("Id Lukisan        : " + this.KodeLukisan + this.IdOptik);
        System.out.println("Nama Pelukis      : " +  this.NamaPelukis);
        System.out.println("Ukuran Lukisan    : " +  this.Panjang + " cm" + " x " + this.Lebar + " cm");
        System.out.println("Berat Lukisan     : " +  this.Berat + " Kg");
        System.out.println("Tahun Pembuatan   : " +  this.TahunPembuatan);
        System.out.println("Harga Lukisan     : Rp." +  this.Harga);
        System.out.println("");
    }

    public void display(String Optik){
        if (Optik.equals("Optik")){
            System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
        } else {
            display();
        }
    }
}