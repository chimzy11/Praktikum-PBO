package Class.DataLukisan;
import Class.*;

public class Lukisan_Abstrak extends Lukisan{
     private int IdAsbtrak;
     private String TeknikPembuatan;

    public Lukisan_Abstrak(String Judul, String NamaPelukis,  int Panjang, int Lebar,
            int TahunPembuatan, int Harga, int Berat, int idAsbtrak, String teknikPembuatan) {
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
    
    @Override
    public void display(){
        System.out.println("Id Lukisan        : LATP" +  this.IdAsbtrak);
        super.display();
    }
    
    public void display(String abstrak){
         switch (abstrak) {
             case "Teknik Plakat":
                 System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
                 break;
             case "Biografi Plakat":
                 display();
                 break;
             case "Teknik Transparan":
                 System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
                 break;
             default:
                 System.out.println("Id Lukisan        : LATT" +  this.IdAsbtrak);
                 super.display();
                 break;
         }
    }
}
