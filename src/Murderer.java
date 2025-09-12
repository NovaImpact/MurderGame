public class Murderer {
    String murdererName;
    int killCounter;
    String targetName;

    void killCivilan() {
        System.out.println("Select Target " + murdererName);
    }

    void gulity() {
        System.out.println("Hi," + murdererName + "is not guilty!");
    }

    void status() {
        System.out.println(murdererName + "is the murderer!");
    }
}

