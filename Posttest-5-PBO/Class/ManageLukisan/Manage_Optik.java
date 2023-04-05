package Class.ManageLukisan;
import Class.*;
import Class.DataLukisan.Lukisan_Optik;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Manage_Optik {

    static ArrayList<Lukisan_Optik> clsOptik = new ArrayList<>();
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in));  

    public void createLksOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();

        System.out.println("\n      T A M B A H - L U K I S A N - O P T I K\n");
        int IdOptik = clsOptik.size() + 1;
        
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
        Lukisan_Optik NewLukisan = new Lukisan_Optik(Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdOptik, null);
        
        clsOptik.add(NewLukisan);
        
        System.out.print("\n");
        Msg.msgAddSucces(); 
        
        Msg.clrScreen();
    }

    public void katalogLksOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        System.out.println("\n   K A T A L O G - L U K I S A N - O P T I K\n");

        if (clsOptik.size() != 0){
            for (int i = 0; i < clsOptik.size(); i++){
                int j = i + 1;
                System.out.print((char)27 +  "[01;35m [" + j + "]");
                clsOptik.get(i).display("Optik");
            }
            System.out.print ("\nLihat Biografi Lukisan? [1:Yes/0:No] : ");
            int shw = Integer.parseInt(inp.readLine());
            int Y = 1;
            Msg.clrScreen();
            if(shw == Y){
                biografiLksOptik();
            } 
        }
        else {
            Msg.msgSoldout();
        }
    }

    public void biografiLksOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        if (clsOptik.size() != 0){
            System.out.println("\n   B I O G R A F I - L U K I S A N - O P T I K\n");
            for (int i = 0; i < clsOptik.size(); i++){
                System.out.println("Lukisan ke-" + (i+1));
                System.out.println("__________________");
                clsOptik.get(i).display("");

                System.out.print("\nPress to Continue...");
                System.out.println("");
                inp.readLine();
            }
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }

    public void updateLksOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        if (clsOptik.size() > 0){
            for (int i = 0; i < clsOptik.size(); i++){
                int j = i + 1;
                System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  clsOptik.get(i).getJudul() + "\n    ID LK" + clsOptik.get(i).getIdOptik() + (char)27 + "[00;00m");
                System.out.println("");
            }

            System.out.print("Input Digit Akhir ID   : ");
            int idx = Integer.parseInt(inp.readLine());

            Msg.clrScreen();
            Hdr.header();
            if (idx > 0 ){
                if (idx <= clsOptik.size() && idx > 0){

                    System.out.println("\n      U P D A T E - L U K I S A N - O P T I K\n");

                    int IdOptik = idx;
                    
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

                    System.out.print("Update Teknik Buat    : ");
                    int TahunPembuatan = Integer.parseInt(inp.readLine());

                    System.out.print("Update Harga Lukisan  : Rp.");
                    int Harga = Integer.parseInt(inp.readLine());

                    Lukisan_Optik updateLukisan = new Lukisan_Optik (Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdOptik, null);
                    clsOptik.set(idx- 1, updateLukisan);

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

    public void menuDeleteOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        System.out.println("\n      D E L E T E - L U K I S A N - O P T I K\n");
        System.out.println("[1] Delete");
        System.out.println("[2] Delete All");
        System.out.println("[3] Back");
        System.out.print("\nPilih Menu Delete : ");
        int chsDelete = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsDelete){
            case 1:
                deleteLksOptik();  
                Msg.clrScreen();
                break;
            case 2:
                deleteAllLksOptik();
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

    public void deleteLksOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        if (clsOptik.size() > 0){
            for (int i = 0; i < clsOptik.size(); i++){
                int j = i + 1;
                System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  clsOptik.get(i).getJudul() + "\n    ID LK" + clsOptik.get(i).getIdOptik() + (char)27 + "[00;00m");
                System.out.println("");
            }
            
            System.out.print("Input Digit Akhir ID   : ");
            int idx = Integer.parseInt(inp.readLine());
            
            if (idx > 0){
                if (idx <= clsOptik.size() && idx > 0){
                    clsOptik.remove(idx - 1);
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

    public void deleteAllLksOptik() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        if (clsOptik.size() > 0){
            clsOptik.clear();
            Msg.msgDeletedSucces();
        } else {
            Msg.msgSoldout();
        }
        Msg.clrScreen();
    }
}
