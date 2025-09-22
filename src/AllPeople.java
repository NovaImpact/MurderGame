class AllPeople extends Object {
    private String name;
    private boolean dead;
    private String userDialogue;

    public AllPeople(String userDialogue, boolean dead, String name) {
        this.userDialogue = userDialogue;
        this.dead = dead;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getUserDialogue() {
        return userDialogue;
    }

    public void setUserDialogue(String userDialogue) {
        this.userDialogue = userDialogue;
    }
}
