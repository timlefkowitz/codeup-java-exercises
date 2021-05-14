package oopLecture;

public class StudentTest {

    public static void main(String[] args){
        Student kenneth = new Student("Kenneth Howell", "Deimos", 80);

        System.out.println("kenneth.cohort = " + kenneth.cohort);
        System.out.println("kenneth.name = " + kenneth.name);
        System.out.println("kenneth.shareGrade() = " + kenneth.shareGrade());




    }
}