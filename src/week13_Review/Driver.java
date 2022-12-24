package week13_Review;

public class Driver extends Employee{

    private char typeOfDl;

    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, "Driver", salary);
    }

    public char getTypeOfDl() {
        return typeOfDl;
    }

    public void setTypeOfDl(char typeOfDl) {
        if (!(typeOfDl=='A'|| typeOfDl=='B'|| typeOfDl=='C')){
            throw new RuntimeException("Invalid type of driving license. " + typeOfDl);
        }
        this.typeOfDl = typeOfDl;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+ " "+ getName()+ " is long way driver.");

    }
}
