package Week07_review;

public class multiDimentionalArray {
    public static void main(String[] args) {
        String[]row1= {"Java","SQL", "HTM", "CSS","Phyton"};
        String[] row2 = {"Selenium", "APT", "Genkin"};
        String[] row3= {"Cydeo", "Wooden Spoon", "batch 28"};

        String[][] sheet1 ={ row1, row2, row3};
        String[][] sheet2 ={};
        String[][] sheet3 ={};
        System.out.println(sheet1[0][1]);
        String[][][] exxelfile = {sheet1, sheet2, sheet3};
    }
}
