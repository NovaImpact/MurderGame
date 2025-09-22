class Murderer extends AllPeople{
    //String murdererName;

    private int killCounter;
    private String targetName;

    public Murderer(String userDialogue, boolean dead, String name, int killCounter, String targetName) {
        super(userDialogue, dead, name);
        this.killCounter = killCounter;
        this.targetName = targetName;
    }



    public int getKillCounter() {
        return killCounter;
    }

    public void setKillCounter(int killCounter) {
        this.killCounter = killCounter;
    }


    void killCivilan() {
        System.out.println("Select Target " + getName());
    }

    void gulity() {
        System.out.println("Hi," + getName() + "is not guilty!");
    }

    void status() {
        System.out.println(getName() + "is the murderer!");
    }

    public String toString(){
        String murderString = "Minghao";
        murderString += getName();
        return murderString;
    }
}

