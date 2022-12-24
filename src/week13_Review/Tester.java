package week13_Review;

public class Tester extends Employee implements RemoteJob{
    public Tester(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+ " " + "working at "+ " "+ getJobTitle());

    }

    @Override
    public void workFromHome() {
        System.out.println(getName()+ " " + "testing from home if needed "+ " "+ getJobTitle());

    }

    public void smokeTesting(){
        System.out.println(getName()+ " " + "is do smoke testing "+ " "+ getJobTitle());
    }
}
