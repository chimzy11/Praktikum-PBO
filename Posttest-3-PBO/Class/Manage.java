package Class;
import Class.ManageLukisan.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Manage {
    static BufferedReader inp = new BufferedReader (new InputStreamReader (System.in)); 
    Header hdr = new Header();
    Message Msg = new Message();
    Manage_Abstrak MngAbs = new Manage_Abstrak();
    Manage_Klasikisme MngKlsk = new Manage_Klasikisme();
    Manage_Optik MngOpt = new Manage_Optik();

    public void Create() throws IOException{
        hdr.header();
        hdr.MenuLukisan();

        int chsCreate = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsCreate){
            case 1 : MngAbs.createLksAbstrak(); break;
            case 2 : MngKlsk.createLksKlasikisme(); break;
            case 3 : MngOpt.createLksOptik(); break;
            case 4 : break;
            default : hdr.header(); Msg.msgIsntAny(); Msg.clrScreen(); break;
        }
    }

    public void Katalog() throws IOException{
        hdr.header();
        hdr.MenuLukisan(); 

        int chsKatalog = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsKatalog){
            case 1 : MngAbs.katalogLksAbstrak(); break;
            case 2 : MngKlsk.katalogLksKlasikisme(); break;
            case 3 : MngOpt.katalogLksOptik(); break;
            default : hdr.header(); Msg.msgIsntAny(); Msg.clrScreen(); break;
        }
    }

    public void Update() throws IOException{
        hdr.header();
        hdr.MenuLukisan(); 

        int chsUpdate = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsUpdate){
            case 1 : MngAbs.updateLksAbstrak(); break;
            case 2 : MngKlsk.updateLksKlasikisme(); break;
            case 3 : MngOpt.updateLksOptik(); break;
            default : hdr.header(); Msg.msgIsntAny(); Msg.clrScreen(); break;
        }
    }

    public void Delete() throws IOException{
        hdr.header();
        hdr.MenuLukisan(); 

        int chsDelete = Integer.parseInt(inp.readLine());
        Msg.clrScreen();
        switch(chsDelete){
            case 1 : MngAbs.menuDeleteAbstrak(); break;
            case 2 : MngKlsk.menuDeleteKlasikisme(); break;
            case 3 : MngOpt.menuDeleteOptik(); break;
            case 4 : break;
            default : hdr.header(); Msg.msgIsntAny(); Msg.clrScreen(); break;
        }
    }
}

