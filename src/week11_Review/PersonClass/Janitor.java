package week11_Review.PersonClass;

public class Janitor extends Employee {
    public Janitor(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, "Janitor", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " is cleaning.");
    }
}
