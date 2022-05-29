package monday;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gustav");
        Student student2 = new Student("Peter");


        Student[] myTestStudents = {student1, student2};
        StudentDB testDb = new StudentDB(myTestStudents);
        Student student3 = new Student("lal");

        testDb.addStudent(student3);

        System.out.println(testDb.list());
    }
}
