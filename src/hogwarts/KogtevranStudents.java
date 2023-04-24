package hogwarts;

public class KogtevranStudents extends HogwartsStudents {
    private int mind;
    private int wisdom;
    private int esprit;
    private int creation;

    public KogtevranStudents(String firstName, String lastName, int mind, int wisdom, int esprit,int creation) {
        super(firstName, lastName);
        this.mind = mind;
        this.wisdom = wisdom;
        this.esprit = esprit;
        this.creation = creation;
    }
    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getEsprit() {
        return esprit;
    }
    public int getCreation() {
        return creation;
    }
    @Override
    public int getTotalAbility() {
        return mind + wisdom + esprit+creation;
    }

    @Override
    public String toString() {
        return "KogtevranStudents{" +
                "mind=" + mind +
                ", wisdom=" + wisdom +
                ", esprit=" + esprit +
                ", creation=" + creation + '/'+ " - " +
                this.getFirstName()+ ' ' + this.getLastName() + " }";
    }
}
