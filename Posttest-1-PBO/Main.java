import Class.Manage;
import Class.Message;
import Class.Header;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in));  

    public static void main(String[] args)throws IOException{

        Manage Mng = new Manage();
        Message Msg = new Message();
        Header Hdr = new Header();

        boolean menu = true;

        while(menu == true){

            Hdr.header();

            System.out.print("\n           ");
            System.out.print("[1] Create          ");
            System.out.print("[2] Katalog          ");
            System.out.print("[3] Update          ");
            System.out.print("[4] Delete          ");
            System.out.println("[5] Exit");

            System.out.print ("\nPilih Menu : ");
            int chs = Integer.parseInt(inp.readLine());

            Msg.clrScreen();
            Hdr.header();

            switch(chs){
            case 1:
                Mng.createLks();
                break;
            case 2:
                Mng.katalogLks();
                System.out.print ("\nLihat Biografi Lukisan? [1:Yes/0:No] : ");
                int shw = Integer.parseInt(inp.readLine());
                int Y = 1;
                Msg.clrScreen();
                if(shw == Y){
                    Mng.biografiLks();
                }
                break;
            case 3:
                Mng.updateLks();
                break;
            case 4:
                Mng.menuDelete();
                System.out.print("\nPilih Menu : ");
                int chs1 = Integer.parseInt(inp.readLine()); 
                Msg.clrScreen();
                if(chs1 == 1){
                    Mng.deleteLks();
                } else if (chs1 == 2){
                    Mng.deleteAllLks();
                } else if (chs1 == 3){
                    menu = true;
                } else {
                    Hdr.header();
                    Msg.msgIsntAny();
                    Msg.clrScreen();
                }
                break;
            case 5:
                Msg.msgExit();
                System.exit(0);
                break;
            default :
                Msg.msgIsntAny();
                Msg.clrScreen();
                break;
            }
        }
    }
}
