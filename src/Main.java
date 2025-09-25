import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


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
        ArrayList <AllPeople> allPeople = new ArrayList<AllPeople>();
        for (int i = 0; i < 10; i = i + 1) {
            Civilian newCivilian = new Civilian("Hello!", false, "notYet");
            allPeople.add(newCivilian);
        }
        allPeople.get(0).setName("Bob");
        allPeople.get(1).setName("Sam");
        allPeople.get(2).setName("Joe");
        allPeople.get(3).setName("Tai");
        allPeople.get(4).setName("MrH");
        allPeople.get(5).setName("George");
        allPeople.get(6).setName("Jotaro");
        allPeople.get(7).setName("Shoeb");
        allPeople.get(8).setName("Minghao");
        allPeople.get(9).setName("adil");

        System.out.println(allPeople);

        Collections.shuffle(allPeople);

        System.out.println("Welcome!");
        System.out.println(allPeople + "is the murderer.");


/*
        Civilian adil = new Civilian();
        adil.name = "Adil";
        adil.dead = false;
        adil.userDialogue = "Hello!";
        adil.status();
        adil.guilty();
        adil.interactionCivilian();
        allPeople.add(adil);

        Civilian sam = new Civilian();
        sam.name = "Sam";
        sam.dead = false;
        sam.userDialogue = "Hi, how are you?";
        sam.status();
        sam.guilty();
        sam.interactionCivilian();
        allPeople.add(sam);

        Civilian tai = new Civilian();
        tai.name = "Tai";
        tai.dead = false;
        tai.userDialogue = "What are you doing?";
        tai.status();
        tai.guilty();
        tai.interactionCivilian();
        allPeople.add(tai);
*/
        Murderer minghao = new Murderer();
        minghao.getName();
        minghao.getKillCounter();

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

/*
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
*/

            }

        }


    }


