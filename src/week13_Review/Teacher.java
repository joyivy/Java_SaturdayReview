package week13_Review;

public class Teacher extends Employee implements RemoteJob {
    public Teacher(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, "Techer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" "+getName()+ " is teaching");

    }

    @Override
    public void workFromHome() {
        System.out.println(getJobTitle() + " "+ getName()+ " ican teach at home if needed. ");

    }
}
