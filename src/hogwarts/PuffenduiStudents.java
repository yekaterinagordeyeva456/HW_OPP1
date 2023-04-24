package hogwarts;

public class PuffenduiStudents extends HogwartsStudents {
    private int industriousness;
    private int loyalty;
    private int honor1;

    public PuffenduiStudents(String firstName, String lastName, int industriousness, int loyalty, int honor1) {
        super(firstName,lastName);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honor1 = honor1;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor1() {
        return honor1;
    }
    @Override
    public int getTotalAbility() {
        return industriousness + loyalty + honor1;
    }

    @Override
    public String toString() {
        return "PuffenduiStudents{" +
                "industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honor1=" + honor1 +
                '/'+ " -  " +
                this.getFirstName()+ ' ' + this.getLastName() + " }";
    }
}
