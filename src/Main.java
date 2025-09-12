import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome!You are the murderer.");

        Civilian adil = new Civilian();
        adil.name = "Adil";
        adil.dead = false;
        adil.userDialogue = "Hello!";
        adil.status();
        adil.guilty();
        adil.interactionCivilian();

        Civilian sam = new Civilian();
        sam.name = "Sam";
        sam.dead = false;
        sam.userDialogue = "Hi, how are you?";
        sam.status();
        sam.guilty();
        sam.interactionCivilian();

        Civilian tai = new Civilian();
        tai.name = "Tai";
        tai.dead = false;
        tai.userDialogue = "What are you doing?";
        tai.status();
        tai.guilty();
        tai.interactionCivilian();

        Murderer minghao = new Murderer();
        minghao.murdererName = "Minghao;";
        minghao.killCounter = 0;

        Scanner myTextScanner = new Scanner(System.in);

        boolean killGUI = true;
        while (killGUI){

            System.out.print("Type person to kill");
            String typedName1 = myTextScanner.nextLine();
            System.out.print(typedName1 + " Died");
            String typedName2 = myTextScanner.nextLine();


            if (adil.name.equals(typedName1)) {
                adil.dead = true;
                adil.status();
                minghao.killCounter = 1;
                System.out.println("Adil died...");
                }



            }

        }


    }


