package tuesday.heritage;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Informatikstudent("Gustav");
        Student student2 = new Geschichtsstudent("Larry");
        Student[] studentArray = {student1, student2};
        StudentDB studentList = new StudentDB(studentArray);

        System.out.println(studentList.toString());
    }
}
