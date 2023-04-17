package hogwarts;

public class Application {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.griffindorStudents[0] = new GriffindorStudents("Harry", "Potter", 7, 7, 7);
        hogwarts.griffindorStudents[1] = new GriffindorStudents("Hermione", "Granger", 9, 9, 9);
        hogwarts.griffindorStudents[2] = new GriffindorStudents("Ron", "Weasley", 8, 8, 8);
        hogwarts.puffenduiStudents[0] = new PuffenduiStudents("Zacharias", "Smith", 6, 6, 6);
        hogwarts.puffenduiStudents[1] = new PuffenduiStudents("Cedric", "Diggory", 5, 5, 5);
        hogwarts.puffenduiStudents[2] = new PuffenduiStudents("Justin", "Finch-Fletchley", 4, 4, 4);
        hogwarts.griffindorStudents[0].compareWith(hogwarts.griffindorStudents[1]);
        hogwarts.griffindorStudents[1].compareWith(hogwarts.griffindorStudents[2]);
        hogwarts.puffenduiStudents[1].compareWith(hogwarts.puffenduiStudents[1]);
        hogwarts.puffenduiStudents[0].compareWith (hogwarts.griffindorStudents[2]);
        System.out.println(hogwarts.griffindorStudents[1]);
        System.out.println(hogwarts.puffenduiStudents[2]);
    }
}