package week6_Rewiew;

import java.sql.SQLOutput;

public class TestObjects {
    public static void main(String[] args) {
        CydeoStudent student1 = new CydeoStudent();
        student1.setInfo("Joy", 35,'M',false,false, 2345, "Java student", "B28");

        CydeoStudent student2 = new CydeoStudent();
        student2.name ="Aynur";

        CydeoStudent student3 = new CydeoStudent();
        student3.name = "Fazilet";


        System.out.println(student1);
        System.out.println(student2.name);
        System.out.println(student3.name);
        
        student1.study();

    }
}
