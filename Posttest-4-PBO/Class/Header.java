package Class;
import java.io.IOException;

public class Header {
    public void header()  throws IOException{
        System.out.println("---------------------------------------------------------------------------------------------------------------");
            System.out.println("                   S I S T E M || P E N G E L O L A A N || L U K I S A N || G A L L E R Y " );
            System.out.println((char)27 +  "[01;35m \n.....   .  .   ....       ....   ....   ....   ....   .....   ....   ....   .....       .   .   .   ....   .  .");
            System.out.println(                   "  :     :..:   :...   -   : ..   :..:   :...   :..:     :     :...   :...     :     -   : . :   :   :...   :..:");
            System.out.println(                     "  :     :  :   :...       :..:   :  .   :...   :  :     :     :...   ...:     :         .: :.   :   ...:   :  :"+ (char)27 + "[00;00m");
            System.out.println("---------------------------------------------------------------------------------------------------------------");
    }

    public void MenuLukisan() throws IOException{
        System.out.print("\n           ");
        System.out.print("[1] Abstrak          ");
        System.out.print("[2] Klasikisme          ");
        System.out.print("[3] Optik          ");
        System.out.println("[4] Back          ");
        System.out.print("\nPilih Menu : ");
    }

    public void MainMenu() throws IOException{
        System.out.print("\n           ");
        System.out.print("[1] Create          ");
        System.out.print("[2] Katalog          ");
        System.out.print("[3] Update          ");
        System.out.print("[4] Delete          ");
        System.out.println("[5] Exit");
    
        System.out.print("\nPilih Menu : ");
    }
}
