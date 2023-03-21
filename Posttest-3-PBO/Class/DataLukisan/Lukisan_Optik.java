package Class.DataLukisan;
import Class.*;

public class Lukisan_Optik extends Lukisan{
    private int IdOptik;

    public Lukisan_Optik(String Judul, String NamaPelukis, int Panjang, int Lebar,
            int TahunPembuatan, int Harga, int Berat, int idOptik) {
        super(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat);
        this.IdOptik = idOptik;
    }

    public int getIdOptik() {
        return IdOptik;
    }

    public void setIdOptik(int idOptik) {
        IdOptik = idOptik;
    }
}
