package hogwarts;

public abstract class HogwartsStudents {
    private String firstName;
    private String lastName;
    private int sumMagic;


    public HogwartsStudents(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public HogwartsStudents setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public HogwartsStudents setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getCommonAbilities() {
        return sumMagic;
    }

    public abstract int getTotalAbility();
    public void compareWith(HogwartsStudents students) {
        if (this.getTotalAbility() > students.getTotalAbility()) {
            System.out.println(this.firstName+" лучше чем "+students.firstName);
        }else if (this.getTotalAbility() < students.getTotalAbility()) {
                System.out.println(students.firstName+" лучше чем "+this.firstName);
        }else if (this.getTotalAbility() == students.getTotalAbility()) {
            System.out.println("Студенты " + students.firstName + " и " + this.firstName + " равны");
        }
    }
}
