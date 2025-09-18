public class Murderer extends AllPeople{
    //String murdererName;
    int killCounter;
    String targetName;

    void killCivilan() {
        System.out.println("Select Target " + name);
    }

    void gulity() {
        System.out.println("Hi," + name + "is not guilty!");
    }

    void status() {
        System.out.println(name + "is the murderer!");
    }

    public String toString(){
        String murderString = "Minghao";
        murderString += name;
        return murderString;
    }
}

