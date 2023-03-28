package Class.ManageLukisan;
import Class.*;
import Class.DataLukisan.Lukisan_Abstrak;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Manage_Abstrak {

    static ArrayList<Lukisan_Abstrak> TeknikPlakat = new ArrayList<>();
    static ArrayList<Lukisan_Abstrak> TeknikTransparan = new ArrayList<>();
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in));  

    public void createLksAbstrak() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        boolean crt = true;

        Hdr.header();
        System.out.println("\n-----TEKNIK PEMBUATAN-----");
        System.out.println("[1] Teknik Plakat");
        System.out.println("[2] Teknik Transparan");
        System.out.print("\nPilih Teknik Pembuatan : ");
        int chsTeknik = Integer.parseInt(inp.readLine());
        
        Msg.clrScreen(); 

        Hdr.header();

        if (chsTeknik > 2){
            crt = false;
            Msg.msgIsntAny(); 
            Msg.clrScreen(); 
        } 

        while (crt == true){
            System.out.println("\n       T A M B A H - L U K I S A N - A B S T R A K");
            if (chsTeknik == 1){
                System.out.println("              [ T~E~K~N~I~K   P~L~A~K~A~T ]\n");
            } else if (chsTeknik == 2){
                System.out.println("           [ T~E~K~N~I~K   T~R~A~N~S~P~A~R~A~N ]\n");
            }
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
        
            if(chsTeknik == 1){
                int IdAbstrak = TeknikPlakat.size() + 1;
                String TeknikPembuatan = "Teknik Plakat";

                Lukisan_Abstrak NewLukisanPlakat = new Lukisan_Abstrak (Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdAbstrak, TeknikPembuatan);
                TeknikPlakat.add(NewLukisanPlakat);
            
                System.out.print("\n");
                Msg.msgAddSucces(); 
            } else if (chsTeknik == 2){
                int IdAbstrak = TeknikTransparan.size() + 1;
                String TeknikPembuatan = "Teknik Transparan";

                Lukisan_Abstrak NewLukisanTransparan = new Lukisan_Abstrak (Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdAbstrak, TeknikPembuatan);
                TeknikTransparan.add(NewLukisanTransparan);
            
                System.out.print("\n");
                Msg.msgAddSucces(); 
            } else {
                Msg.msgIsntAny();
            }
        crt = false;
        Msg.clrScreen(); 
        }
    }

    public void katalogLksAbstrak() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        System.out.println("\n K A T A L O G - L U K I S A N - GALLERY THE GREATEST WISH");
        System.out.println("-----------------------------------------------------------");
        System.out.println("[1] Teknik Plakat");
        System.out.println("[2] Teknik Transparan");
        System.out.print("\nPilih Teknik Pembuatan : ");
        int chsTeknik = Integer.parseInt(inp.readLine()); 

        Msg.clrScreen();
        Hdr.header();
        System.out.println("\n     K A T A L O G - L U K I S A N - A B S T R A K");
        switch(chsTeknik){
            case 1:
                System.out.println("            [ T~E~K~N~I~K   P~L~A~K~A~T ]\n");
                if (TeknikPlakat.size() != 0){
                    for (int i = 0; i < TeknikPlakat.size(); i++){
                        int j = i + 1;
                        System.out.print((char)27 +  "[01;35m [" + j + "]");
                        TeknikPlakat.get(i).display("Teknik Plakat");
                        System.out.println("");
                    }

                    System.out.print ("\nLihat Biografi Lukisan? [1:Yes/0:No] : ");
                    int shw = Integer.parseInt(inp.readLine());
                    int Y = 1;

                    Msg.clrScreen();
                    if(shw == Y){
                        if (TeknikPlakat.size() != 0){
                            Hdr.header();
                            System.out.println("\nB I O G R A F I - L U K I S A N - A B S T R A K");
                            System.out.println("         [ T~E~K~N~I~K   P~L~A~K~A~T ]\n");
                            for (int i = 0; i < TeknikPlakat.size(); i++){
                                System.out.println("Lukisan ke-" + (i+1));
                                System.out.println("__________________");
                                TeknikPlakat.get(i).display("Biografi Plakat");
                
                                System.out.print("\nPress to Continue...");
                                System.out.println("");
                                inp.readLine();
                            }
                        } else {
                            Msg.msgSoldout();
                        } 
                    } 

                }
                else {
                    Msg.msgSoldout();
                }
                break;
            case 2:
                System.out.println("         T~E~K~N~I~K   T~R~A~N~S~P~A~R~A~N ]\n");
                if (TeknikTransparan.size() != 0){
                    for (int i = 0; i < TeknikTransparan.size(); i++){
                        int j = i + 1;
                        System.out.print((char)27 +  "[01;35m [" + j + "]");
                        TeknikTransparan.get(i).display("Teknik Transparan");
                        System.out.println("");
                    }
                    System.out.print ("\nLihat Biografi Lukisan? [1:Yes/0:No] : ");
                    int shw = Integer.parseInt(inp.readLine());
                    int Y = 1;

                    Msg.clrScreen();
                    if(shw == Y){
                        if (TeknikTransparan.size() != 0){
                            Hdr.header();
                            System.out.println("\nB I O G R A F I - L U K I S A N - A B S T R A K");
                            System.out.println("      T~E~K~N~I~K   T~R~A~N~S~P~A~R~A~N ]\n");
                            for (int i = 0; i < TeknikTransparan.size(); i++){
                                System.out.println("Lukisan ke-" + (i+1));
                                System.out.println("__________________");
                                TeknikTransparan.get(i).display("Biografi Transparan");
                
                                System.out.print("\nPress to Continue...");
                                System.out.println("");
                                inp.readLine();
                            }
                        } else {
                            Msg.msgSoldout();
                        } 
                    } 
                }
                else {
                    Msg.msgSoldout();
                } break;
            default :
                Msg.msgIsntAny();
                break;
        }
        Msg.clrScreen();
    }

    public void updateLksAbstrak() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();

        Hdr.header();
        System.out.println("\n-----TEKNIK PEMBUATAN-----");
        System.out.println("[1] Teknik Plakat");
        System.out.println("[2] Teknik Transparan");
        System.out.print("\nPilih Teknik Pembuatan : ");
        int chsTeknik = Integer.parseInt(inp.readLine());
        
        Msg.clrScreen(); 
        Hdr.header();
        
        switch(chsTeknik){
            case 1:
                if (TeknikPlakat.size() > 0){
                    for (int i = 0; i < TeknikPlakat.size(); i++){
                        int j = i + 1;
                        System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  TeknikPlakat.get(i).getJudul() + "\n    ID LK" + TeknikPlakat.get(i).getIdAsbtrak() + (char)27 + "[00;00m");
                        System.out.println("");
                    }
                    System.out.print("Input Digit Akhir ID   : ");
                    int idx = Integer.parseInt(inp.readLine());
                    
                    if (idx > 0 ){
                        if (idx <= TeknikPlakat.size() && idx > 0){
                            Msg.clrScreen();
                            Hdr.header();

                            System.out.println("\n     U P D A T E - L U K I S A N - A B S T R A K");
                            System.out.println("            [ T~E~K~N~I~K   P~L~A~K~A~T ]\n");
        
                            int IdAbstrak= idx;
                            
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
        
                            System.out.print("Update Tahun Buat   : ");
                            int TahunPembuatan = Integer.parseInt(inp.readLine());
        
                            System.out.print("Update Harga Lukisan : Rp.");
                            int Harga = Integer.parseInt(inp.readLine());

                            String TeknikPembuatan = "Teknik Plakat";
                            Lukisan_Abstrak updateLukisan = new Lukisan_Abstrak (Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdAbstrak, TeknikPembuatan);
                            TeknikPlakat.set(idx- 1, updateLukisan);
        
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
                break;
            case 2:
                if (TeknikTransparan.size() > 0){                    
                    for (int i = 0; i < TeknikTransparan.size(); i++){
                        int j = i + 1;
                        System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  TeknikTransparan.get(i).getJudul() + "\n    ID LK" + TeknikTransparan.get(i).getIdAsbtrak() + (char)27 + "[00;00m");
                        System.out.println("");
                    }

                    System.out.print("Input Digit Akhir ID   : ");
                    int idx = Integer.parseInt(inp.readLine());
                    
                    if (idx > 0 ){
                        if (idx <= TeknikTransparan.size() && idx > 0){
                            Msg.clrScreen();
                            Hdr.header();

                            System.out.println("\n      U P D A T E - L U K I S A N - A B S T R A K");
                            System.out.println("          T~E~K~N~I~K   T~R~A~N~S~P~A~R~A~N ]\n");
        
                            int IdAbstrak = idx;
                            
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
        
                            System.out.print("Update Tahun Buat   : ");
                            int TahunPembuatan = Integer.parseInt(inp.readLine());
        
                            System.out.print("Update Harga Lukisan : Rp.");
                            int Harga = Integer.parseInt(inp.readLine());
        
                            String TeknikPembuatan = "Teknik Transparan";

                            Lukisan_Abstrak updateLukisan = new Lukisan_Abstrak (Judul, NamaPelukis, Panjang, Lebar, TahunPembuatan, Harga, Berat, IdAbstrak, TeknikPembuatan);
                            TeknikTransparan.set(idx- 1, updateLukisan);
        
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
                break;
            default:
                Msg.msgIsntAny();
                break;
        }
        Msg.clrScreen();
    }

    public void menuDeleteAbstrak() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        System.out.println("\n      D E L E T E - L U K I S A N - A B S T R A K");
        System.out.println("-----------------------------------------------------------");
        System.out.println("[1] Delete");
        System.out.println("[2] Delete All");
        System.out.println("[3] Back");
        System.out.print("\nPilih Menu Delete : ");
        int chsDelete = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsDelete){
            case 1:
                deleteLksAbstrak();  
                break;
            case 2:
                deleteAllLksAbstrak();
                break;
            case 3:
                break;
            default :
                Msg.msgIsntAny();
                break;
        }
        Msg.clrScreen();
    }

    public void deleteLksAbstrak() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        System.out.println("\n-----TEKNIK PEMBUATAN-----");
        System.out.println("[1] Teknik Plakat");
        System.out.println("[2] Teknik Transparan");
        System.out.print("\nPilih Teknik Pembuatan : ");
        int chsTeknik = Integer.parseInt(inp.readLine());
        
        Msg.clrScreen(); 

        Hdr.header();
        switch(chsTeknik){
            case 1 :
                if (TeknikPlakat.size() > 0){
                    for (int i = 0; i < TeknikPlakat.size(); i++){
                        int j = i + 1;
                        System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  TeknikPlakat.get(i).getJudul() + "\n    ID LK" + TeknikPlakat.get(i).getIdAsbtrak() + (char)27 + "[00;00m");
                        System.out.println("");
                    }

                    System.out.print("Input Digit Akhir ID   : ");
                    int idx = Integer.parseInt(inp.readLine());
                    
                    if (idx > 0){
                        if (idx <= TeknikPlakat.size() && idx > 0){
                            TeknikPlakat.remove(idx - 1);
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
                break;
            case 2 :
                if (TeknikTransparan.size() > 0){                    
                    for (int i = 0; i < TeknikTransparan.size(); i++){
                        int j = i + 1;
                        System.out.println((char)27 +  "[01;35m [" + j + "]" + " " +  TeknikTransparan.get(i).getJudul() + "\n    ID LK" + TeknikTransparan.get(i).getIdAsbtrak() + (char)27 + "[00;00m");
                        System.out.println("");
                    }
                    
                    System.out.print("Input Digit Akhir ID   : ");
                    int idx = Integer.parseInt(inp.readLine());
                    
                    if (idx > 0){
                        if (idx <= TeknikTransparan.size() && idx > 0){
                            TeknikTransparan.remove(idx - 1);
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
                break;
            default :
                Msg.msgIsntAny();
                break;
        }
        Msg.clrScreen();
    }

    public void deleteAllLksAbstrak() throws IOException{
        Message Msg = new Message();
        Header Hdr = new Header();
        
        Hdr.header();
        System.out.println("\n-----TEKNIK PEMBUATAN-----");
        System.out.println("[1] Teknik Plakat");
        System.out.println("[2] Teknik Transparan");
        System.out.print("\nPilih Teknik Pembuatan : ");
        int chsTeknik = Integer.parseInt(inp.readLine());
        
        Msg.clrScreen(); 

        Hdr.header();
        switch(chsTeknik){
            case 1:
                if (TeknikPlakat.size() > 0){
                    TeknikPlakat.clear();
                    Msg.msgDeletedSucces();
                } else {
                    Msg.msgSoldout();
                }
                break;
            case 2:
                if (TeknikPlakat.size() > 0){
                    TeknikPlakat.clear();
                    Msg.msgDeletedSucces();
                } else {
                    Msg.msgSoldout();
                }
                break;
            default:
                Msg.msgIsntAny();
                break;
        }
        Msg.clrScreen();
    }

}