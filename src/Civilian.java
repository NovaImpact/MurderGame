class Civilian extends AllPeople {
/*
    String name;
    boolean dead;
    String userDialogue;
*/

    public Civilian(String userDialogue, boolean dead, String name) {
        super(userDialogue, dead, name);
    }

    void guilty() {

        System.out.println( getName() + " is not guilty!");
    }

    void status() {
        System.out.println(" Civilian: " + getName() + " Civilian Dead: " + isDead());
    }

    void interactionCivilian() {
        System.out.println(getUserDialogue());
    }

    public String toString(){
        String civilianString = "Innocent Civilan ";
        civilianString += getName();
        return civilianString;
    }

}
