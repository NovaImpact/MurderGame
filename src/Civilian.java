public class Civilian extends AllPeople {
/*
    String name;
    boolean dead;
    String userDialogue;
*/
    void guilty() {
        System.out.println( name + " is not guilty!");
    }

    void status() {
        System.out.println(" Civilian: " + name + " Civilian Dead: " + dead);
    }

    void interactionCivilian() {
        System.out.println(userDialogue);
    }
    public String toString(){
        String civilianString = "Civilan";
        civilianString += name;
        return civilianString;
    }

}
