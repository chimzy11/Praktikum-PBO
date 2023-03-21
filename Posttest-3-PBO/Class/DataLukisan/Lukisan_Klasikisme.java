package Class.DataLukisan;
import Class.*;

public class Lukisan_Klasikisme extends Lukisan{
    private int IdKlasikisme;
    
    public Lukisan_Klasikisme(String Judul, String NamaPelukis, int Panjang, int Lebar,
            int TahunPembuatan, int Harga, int Berat, int idKlasikisme) {
        super(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat);
        this.IdKlasikisme = idKlasikisme;
    }

    public int getIdKlasikisme() {
        return IdKlasikisme;
    }

    public void setIdKlasikisme(int idKlasikisme) {
        IdKlasikisme = idKlasikisme;
    }
}
