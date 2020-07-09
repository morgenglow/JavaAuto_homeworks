public class Robot implements Run, Jump {
    private String name;
    int abilityRun;
    int abilityJump;

    public Robot (String name, int abilityJump, int abilityRun) {
        this.name = name;
        this.abilityJump = abilityJump;
        this.abilityRun = abilityRun;
    }

    public void pleaseJump(int height) {
        if (abilityRun>height) {
            System.out.println(name + " will Jump " + height);
        }
        else
            System.out.println(name + " doesn't Jump " + height);
    }

    public void pleaseRun(int length) {
        if (abilityJump>length) {
            System.out.println(name + " will Run " + length);
        }
        else
            System.out.println(name + " doesn't Run" + length);
    }

}
