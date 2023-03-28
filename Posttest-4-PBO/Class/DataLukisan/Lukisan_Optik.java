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
        this.IdOptik = idOptik;
    }
    
    @Override
    public void display(){
        System.out.println("Id Lukisan        : LOP" + this.IdOptik);
        super.display();
    }
    
    public void display(String Optik){
        if (Optik.equals("Optik")){
            System.out.println(" " +  this.Judul + "\n    ldr " + this.Harga  + (char)27 + "[00;00m");
        } else {
            display();
        }
    }
}