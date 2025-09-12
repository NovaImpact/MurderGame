public class Civilian {

    String name;
    boolean dead;
    String userDialogue;

    void guilty() {
        System.out.println( name + " is not guilty!");
    }

    void status() {
        System.out.println(" Civilian: " + name + " Civilian Dead: " + dead);
    }

    void interactionCivilian() {
        System.out.println(userDialogue);
    }

}
