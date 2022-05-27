package monday;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");


        Student[] myTestStudents = {student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);

        System.out.println(testDb.toString());
    }
}
