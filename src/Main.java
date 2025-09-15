import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

       // Random random = new random();


/*String[] arr;
arr = new String[9];
arr[0] = "Bob";
arr[1] = "Sam";
arr[2] = "Joe";
arr[3] = "Tai";
arr[4] = "MrH";
arr[5] = "George";
arr[6] = "Shoeb";
arr[7] = "Alex";
arr[8] = "Harry";
*/


        System.out.println("Welcome!");
        System.out.println("You are the murderer.");

        System.out.println("Welcome!You are the murderer.");
        System.out.println("Welcome! You are the murderer.");

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

        minghao.killCivilan();
        minghao.status();
        minghao.gulity();
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
                System.out.println(adil.name + " died...");
                System.out.println(adil.name + "died...");
                }

            if (sam.name.equals(typedName1)) {
                sam.dead = true;
                sam.status();
                minghao.killCounter = 1;
                System.out.println(sam.name + " died...");
            }

            if (tai.name.equals(typedName1)) {
                tai.dead = true;
                tai.status();
                minghao.killCounter = 1;
                System.out.println(tai.name + " died...");
            }


            }

        }


    }


