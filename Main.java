import Class.*;
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
            Hdr.MainMenu();
            
            int chs = Integer.parseInt(inp.readLine());

            Msg.clrScreen();
            switch(chs){
            case 1:
                Mng.Create();
                break;
            case 2:
                Mng.Katalog();
                break;
            case 3:
                Mng.Update();
                break;
            case 4:
                Mng.Delete();
                break;
            case 5:
                Hdr.header();
                Msg.msgExit();
                System.exit(0);
                break;
            default :
                Hdr.header();
                Msg.msgIsntAny();
                Msg.clrScreen();
                break;
            }
        }
    }
}
