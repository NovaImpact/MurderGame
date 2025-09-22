class Civilian extends AllPeople {
/*
    String name;
    boolean dead;
    String userDialogue;
*/

    private Civilian(boolean dead) {
        super(dead);
    }

    void guilty() {

        System.out.println( getName() + " is not guilty!");
    }

    void status() {
        System.out.println(" Civilian: " + getName() + " Civilian Dead: " + dead);
    }

    void interactionCivilian() {
        System.out.println(getUserDialogue();
    }

    public String toString(){
        String civilianString = "Innocent Civilan ";
        civilianString += getName();
        return civilianString;
    }

}
