package hogwarts;

public class GriffindorStudents extends HogwartsStudents{
    private int nobility;
    private int honor;
    private int bravery;
    public GriffindorStudents(String firstName, String lastName, int nobility, int honor, int bravery) {
        super(firstName,lastName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    @Override
    public int getTotalAbility() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "GriffindorStudents{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery + '/'+ "first name - " +
                this.getFirstName()+" }";
    }
}
