import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome!");
        System.out.println("You are the murderer.");


        Civilian adil = new Civilian();
        adil.name = "Adil";
        adil.dead = false;
        adil.userInteraction = "Hello!";

        Civilian sam = new Civilian();
        sam.name = "Sam";
        sam.dead = false;
        sam.userInteraction = "Hi, how are you?";

        Civilian tai = new Civilian();
        tai.name = "Tai";
        tai.dead = false;
        tai.userInteraction = "What are you doing?";


        Murderer minghao = new Murderer();
        minghao.murdererName = "Minghao;";
        minghao.killCounter = 0;
        Scanner myTextScanner = new Scanner(System.in);
        String typedName = myTextScanner.nextLine();
        boolean killGUI = true;
        while (killGUI){
            System.out.print("Type person to kill");
            String typeName = myTextScanner.nextLine();




            if (adil.name.equals(typedName)) {
                adil.dead = true;
                System.out.println("Adil died...");
                }


            }

        }


    }





