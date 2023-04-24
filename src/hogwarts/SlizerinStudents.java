package hogwarts;

public class SlizerinStudents extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int savvy;
    private int powerLust;

    public SlizerinStudents(String firstName, String lastName, int cunning, int determination, int ambition,int savvy,int powerLust) {
        super(firstName, lastName);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.savvy = savvy;
        this.powerLust = powerLust;
    }
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }
    public int getSavvy() {
        return savvy;
    }
    public int getPowerLust() {
        return powerLust;
    }
    @Override
    public int getTotalAbility() {
        return cunning + determination + ambition + savvy+ powerLust;
    }

    @Override
    public String toString() {
        return "SlizerinStudents{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", savvy=" + savvy +
                ", powerLust=" + powerLust + '/'+ " - " +
                this.getFirstName() + ' ' + this.getLastName() + " }";
    }
}
