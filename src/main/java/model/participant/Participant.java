package model.participant;

public class Participant {
    public int abilityJump;
    public int abilityRun;
    public String name;
    public boolean flagJ = true;
    public boolean flagR = true;

    public Participant(int abilityJump, int abilityRun, String name) {
        this.abilityJump = abilityJump;
        this.abilityRun = abilityRun;
        this.name = name;
        flagJ = true;
        flagR = true;
    }
}
