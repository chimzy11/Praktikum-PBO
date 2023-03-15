package Class;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Manage {
    String Judul;
    String NamaPelukis;
    String JenisLukisan;
    int Panjang;
    int Lebar;
    int TahunPembuatan;
    int Harga;

    static ArrayList<Lukisan> clsLukisan = new ArrayList<>();
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in));  
    
    public static void createLks() throws IOException{
        Message Msg = new Message();

        System.out.println("\n  T A M B A H - L U K I S A N - GALLERY THE GREATEST WISH");
        System.out.println("-----------------------------------------------------------");

        System.out.print("\nMasukkan Judul Lukisan : ");
        String Judul = inp.readLine();

        System.out.print("Masukkan Nama Pelukis  : ");
        String NamaPelukis = inp.readLine();

        System.out.print("Masukkan Jenis Lukisan : ");
        String JenisLukisan = inp.readLine();

        System.out.println("\n-----UKURAN LUKISAN-----");
        System.out.print("Masukkan Panjang       : ");
        int Panjang = Integer.parseInt(inp.readLine());

        System.out.print("Masukkan Lebar         : ");
        int Lebar = Integer.parseInt(inp.readLine());

        System.out.print("\nMasukkan Tahun Buat    : ");
        int TahunPembuatan = Integer.parseInt(inp.readLine());

        System.out.print("Masukkan Harga Luksan  : Rp.");
        int Harga = Integer.parseInt(inp.readLine());

        Msg.msgAddSucces();

        Lukisan NewLukisan = new Lukisan (Judul, NamaPelukis, JenisLukisan, Panjang, Lebar, TahunPembuatan, Harga);
        
        clsLukisan.add(NewLukisan);

        System.out.print("\n");

        Msg.clrScreen();
    }

    public static void katalogLks() throws IOException{
        Message Msg = new Message();
        System.out.println("\n K A T A L O G - L U K I S A N - GALLERY THE GREATEST WISH");
        System.out.println("-----------------------------------------------------------");

        if (clsLukisan.size() != 0){
            for (int i = 0; i < clsLukisan.size(); i++){
                int j = i + 1;
                System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  clsLukisan.get(i).getJudul() + "\n    ldr " + clsLukisan.get(i).getHarga() + (char)27 + "[00;00m");
                System.out.println("");
            }
        }
        else {
            Msg.msgSoldout();
        }
    }

    public static void biografiLks() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        Hdr.header();

        if (clsLukisan.size() != 0){
            System.out.println("\nB I O G R A F I - L U K I S A N - GALLERY THE GREATEST WISH");
            System.out.println("-----------------------------------------------------------");
            for (int i = 0; i < clsLukisan.size(); i++){
                System.out.println("Lukisan ke-" + (i+1));
                System.out.println("__________________");
                System.out.println("Judul Lukisan     : " +  clsLukisan.get(i).getJudul());
                System.out.println("Nama Pelukis      : " +  clsLukisan.get(i).getNamaPelukis());
                System.out.println("Jenis Lukisan     : " +  clsLukisan.get(i).getJenisLukisan());
                System.out.println("Ukuran Lukisan    : " +  clsLukisan.get(i).getPanjang() + " cm" + " x " + clsLukisan.get(i).getLebar() + " cm");
                System.out.println("Tahun Pembuatan   : " +  clsLukisan.get(i).getTahunPembuatan());
                System.out.println("Harga Lukisan     : " +  clsLukisan.get(i).getHarga());
                System.out.println("");

                System.out.print("\nPress to Continue...");
                inp.readLine();
            }
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }

    public static void updateLks() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        Manage Mng = new Manage();

        if (clsLukisan.size() > 0){
            Mng.katalogLks();

            System.out.print("Pilih Lukisan    : ");
            int idx = Integer.parseInt(inp.readLine());
            
            if (idx > 0 ){
                if (idx <= clsLukisan.size() && idx > 0){
                    Msg.clrScreen();
                    Hdr.header();

                    System.out.println("\n  U P D A T E - L U K I S A N - GALLERY THE GREATEST WISH");
                    System.out.println("-----------------------------------------------------------");

                    System.out.print("\nUpdate Judul Lukisan : ");
                    String Judul = inp.readLine();

                    System.out.print("Update Nama Pelukis  : ");
                    String NamaPelukis = inp.readLine();

                    System.out.print("Update Jenis Lukisan : ");
                    String JenisLukisan = inp.readLine();

                    System.out.println("\n-----UKURAN LUKISAN-----");
                    System.out.print("Update Panjang       : ");
                    int Panjang = Integer.parseInt(inp.readLine());

                    System.out.print("Update Lebar         : ");
                    int Lebar = Integer.parseInt(inp.readLine());

                    System.out.print("\nUpdate Tahun Buat    : ");
                    int TahunPembuatan = Integer.parseInt(inp.readLine());

                    System.out.print("Update Harga Luksan  : Rp.");
                    int Harga = Integer.parseInt(inp.readLine());

                    Lukisan updateLukisan = new Lukisan (Judul, NamaPelukis, JenisLukisan, Panjang, Lebar, TahunPembuatan, Harga);
                    clsLukisan.set(idx- 1, updateLukisan);

                    Msg.msgUpdateSucces();

                } else {
                    Msg.msgIsntAny();
                }
            } else {
                    Msg.msgIsntAny();
            }
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }

    public static void menuDelete() throws IOException{
        System.out.println("\n  D E L E T E - L U K I S A N - GALLERY THE GREATEST WISH");
        System.out.println("-----------------------------------------------------------");
        System.out.println("[1] Delete");
        System.out.println("[2] Delete All");
        System.out.println("[3] Back");
    }

    public static void deleteLks() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        Manage Mng = new Manage();

        Hdr.header();
        if (clsLukisan.size() > 0){
            Mng.katalogLks();
            
            System.out.print("Pilih Lukisan    : ");
            int idx = Integer.parseInt(inp.readLine());
            
            if (idx > 0){
                if (idx <= clsLukisan.size() && idx > 0){
                    clsLukisan.remove(idx - 1);
                    Msg.msgDeletedSucces();
                } else{
                    Msg.msgDeletedNoSucces();
                }
            } else {
                Msg.msgIsntAny();
            }
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }

    public static void deleteAllLks() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        if (clsLukisan.size() > 0){
            clsLukisan.clear();
            Msg.msgDeletedSucces();
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }
}

