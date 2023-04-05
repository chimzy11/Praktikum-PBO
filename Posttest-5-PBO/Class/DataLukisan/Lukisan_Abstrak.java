package Class.DataLukisan;
import Class.*;

public class Lukisan_Abstrak extends Lukisan{
     private int IdAsbtrak;
     private String TeknikPembuatan;
     public final String KodeLukisan = "LA";

    public Lukisan_Abstrak(String Judul, String NamaPelukis,  int Panjang, int Lebar,
            int TahunPembuatan, int Harga, int Berat, int idAsbtrak, String teknikPembuatan, String KodeLukisan) {
        super(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat);
        this.IdAsbtrak = idAsbtrak;
        this.TeknikPembuatan = teknikPembuatan;
    }

    public int getIdAsbtrak() {
        return IdAsbtrak;
    }

    public void setIdAsbtrak(int idAsbtrak) {
        this.IdAsbtrak = idAsbtrak;
    }

    public String getTeknikPembuatan() {
        return TeknikPembuatan;
    }

    public void setTeknikPembuatan(String teknikPembuatan) {
        this.TeknikPembuatan = teknikPembuatan;
    }

    public String getKodeLukisan() {
        return KodeLukisan;
    }

    @Override
    public void display(){
        System.out.println("Judul Lukisan     : " +  this.Judul);
        System.out.println("Nama Pelukis      : " +  this.NamaPelukis);
        System.out.println("Ukuran Lukisan    : " +  this.Panjang + " cm" + " x " + this.Lebar + " cm");
        System.out.println("Berat Lukisan     : " +  this.Berat + " Kg");
        System.out.println("Tahun Pembuatan   : " +  this.TahunPembuatan);
        System.out.println("Harga Lukisan     : Rp." +  this.Harga);
        System.out.println("");
    }
    
    public void display(String abstrak){
         switch (abstrak) {
             case "Teknik Plakat":
                 System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
                 break;
             case "Biografi Plakat":
                 System.out.println("Id Lukisan        : " + this.KodeLukisan + "TP" +  this.IdAsbtrak);
                 display();
                 break;
             case "Teknik Transparan":
                 System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
                 break;
             default:
                 System.out.println("Id Lukisan        : " + this.KodeLukisan + "TT" +  this.IdAsbtrak);
                 display();
                 break;
         }
    }
}
