package Class;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Message {
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in));  

    public static void msgIsntAny() throws IOException{
        System.out.println((char)27 +  "[01;31m \nInformation : Menu Options are Not Available!" + (char)27 + "[00;00m");
        System.out.print("\nPress to Continue...");
        inp.readLine();
    }

    public static void msgDeletedSucces() throws IOException{
        System.out.println((char)27 +  "[01;32m \nInformation : Deleted Successfully!" + (char)27 + "[00;00m");
        System.out.print("\nPress to Continue...");
        inp.readLine();
    }

    public static void msgDeletedNoSucces() throws IOException{
        System.out.println((char)27 +  "[01;31m \nInformation : Failed To Deleted!" + (char)27 + "[00;00m");
        System.out.print("\nPress to Continue...");
        inp.readLine();
    }

    public static void msgUpdateSucces() throws IOException{
        System.out.println((char)27 +  "[01;32m \nInformation : Updated Successfully!" + (char)27 + "[00;00m");
        System.out.print("\nPress to Continue...");
        inp.readLine();
    }

    public static void msgAddSucces() throws IOException{
        System.out.println((char)27 +  "[01;32m\nInformation : Succesfully Added!" + (char)27 + "[00;00m");
        System.out.print("\nPress to Continue...");
        inp.readLine();
    }

    public static void msgSoldout() throws IOException{
        System.out.println((char)27 +  "[01;33m \nInformation : Paintings Sold Out!" + (char)27 + "[00;00m");
        System.out.print("\nPress to Continue...");
        inp.readLine();
    }

    public static void msgExit() throws IOException{
        System.out.println((char)27 +  "[01;32m \n                                Y O U - E X I T - T H E - S Y S T E M" + (char)27 + "[00;00m");
        System.out.print("\n");
    }

    public static void clrScreen() throws IOException{
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }    
}




