public class Human implements Run, Jump {
    String name;
    int abilityRun;
    int abilityJump;
    boolean flagR = true;
    boolean flagJ = true;

    public Human(String name, int abilityJump, int abilityRun){
        this.name = name;
        this.abilityJump = abilityJump;
        this.abilityRun = abilityRun;
        this.flagR = true;
        this.flagJ = true;
    }

    public void pleaseJump(int height) {
            if (abilityJump > height) {
                System.out.println(name + " desires to Jump " + height);
            } else {
                System.out.println(name + " can't Jump " + height);
                this.flagJ = false;
                System.out.println("Action interrupted");
            }
        }

        public void pleaseRun (int length){
                if (abilityRun > length) {
                    System.out.println(name + " will Run " + length);
                } else {
                    System.out.println(name + " can't Run" + length);
                    this.flagR = false;
                    System.out.println("Action interrupted");
                }
        }
}
