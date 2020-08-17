public class Student extends Person {

    private int studyCredits;

    public Student(String name, String adress) {
        super(name, adress);
        this.studyCredits = 0;
    }

    public void study() {
        this.studyCredits += 1;
    }

    public int credits() {
        return this.studyCredits;
    }


    public String toString() {
        return super.toString() + "\n" + "  Study credits " + credits();
    }
}
