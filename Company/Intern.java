package Company;

public class Intern extends Employee {
    private String university;

    public Intern(String name, String department, double salary, String university) {
        super(name, department, salary);
        this.university = university;
    }

    @Override
    public String toString() {
        return super.toString() + ", University: " + university;
    }
}
