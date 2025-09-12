public class Civilian {

    String name;
    boolean dead;
    String userInteraction;

    void guilty() {
        System.out.println("Hi, " + name + "is not guilty!");
    }

    void status() {
        System.out.println("Civilian: " + name + "Civilian Died: " + dead);
    }

    void interactionCivilian() {
        System.out.println(userInteraction);
    }
}
