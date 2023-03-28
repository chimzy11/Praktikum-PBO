    package Class.ManageLukisan;
import Class.*;
import Class.DataLukisan.Lukisan_Klasikisme;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Manage_Klasikisme {

    static ArrayList<Lukisan_Klasikisme> clsKlasikisme = new ArrayList<>();
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in));  

    public void createLksKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();

        System.out.println("\n   T A M B A H - L U K I S A N - K L A S I K I S M E\n");
        int IdKlasikisme = clsKlasikisme.size() + 1;
        
        System.out.print("Masukkan Judul Lukisan : ");
        String Judul = inp.readLine();
        
        System.out.print("Masukkan Nama Pelukis  : ");
        String NamaPelukis = inp.readLine();
        
        System.out.println("\n-----UKURAN LUKISAN-----");
        System.out.print("Masukkan Panjang/CM    : ");
        int Panjang = Integer.parseInt(inp.readLine());
        
        System.out.print("Masukkan Lebar/CM      : ");
        int Lebar = Integer.parseInt(inp.readLine());
        
        System.out.print("\nMasukkan Berat[Kg]     : ");
        int Berat = Integer.parseInt(inp.readLine());
        
        System.out.print("Masukkan Tahun Buat    : ");
        int TahunPembuatan = Integer.parseInt(inp.readLine());
        
        System.out.print("Masukkan Harga Lukisan : Rp.");
        int Harga = Integer.parseInt(inp.readLine());
        Lukisan_Klasikisme NewLukisan = new Lukisan_Klasikisme(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdKlasikisme);
        
        clsKlasikisme.add(NewLukisan);
        
        System.out.print("\n");
        Msg.msgAddSucces(); 
        
        Msg.clrScreen();
    }

    public void katalogLksKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        System.out.println("\n  K A T A L O G - L U K I S A N - K L A S I K I S M E\n");
        
        if (clsKlasikisme.size() != 0){
            for (int i = 0; i < clsKlasikisme.size(); i++){
                int j = i + 1;
                System.out.print((char)27 +  "[01;35m [" + j + "]");
                clsKlasikisme.get(i).display("Klasikisme");
            }
            System.out.print ("\nLihat Biografi Lukisan? [1:Yes/0:No] : ");
            int shw = Integer.parseInt(inp.readLine());
            int Y = 1;
            Msg.clrScreen();
            if(shw == Y){
                biografiLksKlasikisme();
            } 
        }
        else {
            Msg.msgSoldout();
        }
    }

    public void biografiLksKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        if (clsKlasikisme.size() != 0){
            System.out.println("\nB I O G R A F I - L U K I S A N - K L A S I K I S M E\n");
            for (int i = 0; i < clsKlasikisme.size(); i++){
                System.out.println("Lukisan ke-" + (i+1));
                System.out.println("__________________");
                clsKlasikisme.get(i).display("");

                System.out.print("\nPress to Continue...");
                System.out.println("");
                inp.readLine();
            }
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }

    public void updateLksKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        if (clsKlasikisme.size() > 0){
            for (int i = 0; i < clsKlasikisme.size(); i++){
                int j = i + 1;
                System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  clsKlasikisme.get(i).getJudul() + "\n    ID LK" + clsKlasikisme.get(i).getIdKlasikisme() + (char)27 + "[00;00m");
                System.out.println("");
            }

            System.out.print("Input Digit Akhir ID   : ");
            int idx = Integer.parseInt(inp.readLine());

            Msg.clrScreen();
            Hdr.header();
            if (idx > 0 ){
                if (idx <= clsKlasikisme.size() && idx > 0){

                    System.out.println("\n   U P D A T E - L U K I S A N - K L A S I K I S M E\n");

                    int IdKlasikisme = idx;
                    
                    System.out.print("Update Judul Lukisan : ");
                    String Judul = inp.readLine();

                    System.out.print("Update Nama Pelukis  : ");
                    String NamaPelukis = inp.readLine();

                    System.out.println("\n-----UKURAN LUKISAN-----");
                    System.out.print("Update Panjang/CM    : ");
                    int Panjang = Integer.parseInt(inp.readLine());
                    
                    System.out.print("Update Lebar/CM      : ");
                    int Lebar = Integer.parseInt(inp.readLine());
                    
                    System.out.print("\nUpdate Berat[Kg]     : ");
                    int Berat = Integer.parseInt(inp.readLine());

                    System.out.print("Update Tahun Buat    : ");
                    int TahunPembuatan = Integer.parseInt(inp.readLine());

                    System.out.print("Update Harga Lukisan  : Rp.");
                    int Harga = Integer.parseInt(inp.readLine());

                    Lukisan_Klasikisme updateLukisan = new Lukisan_Klasikisme (Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdKlasikisme);
                    clsKlasikisme.set(idx- 1, updateLukisan);

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

    public void menuDeleteKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        System.out.println("\n   D E L E T E - L U K I S A N - K L A S I K I S M E\n");
        System.out.println("[1] Delete");
        System.out.println("[2] Delete All");
        System.out.println("[3] Back");
        System.out.print("\nPilih Menu Delete : ");
        int chsDelete = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsDelete){
            case 1:
                deleteLksKlasikisme();  
                Msg.clrScreen();
                break;
            case 2:
                deleteAllLksKlasikisme();
                Msg.clrScreen();
                break;
            case 3:
                break;
            default :
                Msg.msgIsntAny();
                Msg.clrScreen();
                break;
        }
        Msg.clrScreen();
    }

    public void deleteLksKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        if (clsKlasikisme.size() > 0){
            for (int i = 0; i < clsKlasikisme.size(); i++){
                int j = i + 1;
                System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  clsKlasikisme.get(i).getJudul() + "\n    ID LK" + clsKlasikisme.get(i).getIdKlasikisme() + (char)27 + "[00;00m");
                System.out.println("");
            }
            
            System.out.print("Input Digit Akhir ID   : ");
            int idx = Integer.parseInt(inp.readLine());
            
            if (idx > 0){
                if (idx <= clsKlasikisme.size() && idx > 0){
                    clsKlasikisme.remove(idx - 1);
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

    public void deleteAllLksKlasikisme() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        if (clsKlasikisme.size() > 0){
            clsKlasikisme.clear();
            Msg.msgDeletedSucces();
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }
}