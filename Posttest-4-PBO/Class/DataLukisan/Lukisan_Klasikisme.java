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
        this.IdKlasikisme = idKlasikisme;
    }
    
    @Override
    public void display(){
        System.out.println("Id Lukisan        : LK" +  this.IdKlasikisme);
        super.display();
    }
    
    public void display(String Klasikisme){
        if (Klasikisme.equals("Klasikisme")){
            System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
        } else {
            display();
        }
    }
}