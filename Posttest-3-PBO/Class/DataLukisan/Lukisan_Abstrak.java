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
        IdAsbtrak = idAsbtrak;
    }

    public String getTeknikPembuatan() {
        return TeknikPembuatan;
    }

    public void setTeknikPembuatan(String teknikPembuatan) {
        TeknikPembuatan = teknikPembuatan;
    }
}
