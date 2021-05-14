package oopLecture;

public class Student {
    //Each Student will. .
    public String name;
    public String cohort;
    public String campus;
    private double grade;

    public double shareGrade(){
        return this.grade;
    }

    public Student (){
        this.name = "Unknown";
        this.cohort = "Unassigned";
        this.campus = "TBD";
        this.grade = 0;
    };

    public Student (String studentName){
        this.name = studentName;
        this.cohort = "Unassigned";
        this.campus = "TBD";
        this.grade = 0;
    };

    public Student (String studentName, String assignedCohort){
        this.name = studentName;
        this.cohort = assignedCohort;
        this.campus = "TBD";
    };

    public Student (String studentName, String assignedCohort, double grade){
        this.name = studentName;
        this.cohort = assignedCohort;
        this.campus = "TBD";
        this.grade = grade;
    };

    public String rollCall(){return this.name + " is here and ready for class!";}

    public static void main(String[] args){
        //Old way of doing things
//        Student exampleStudent = new Student();
        //From there. . we'd continue to fill in all of the fields ourselves.

        //Now though: Let's use our constructor
        Student nathan = new Student("Nathan Adcock");
        //nathan.name = "Nathan Adock", we didn't do this!
        System.out.println("nathan.name = " + nathan.name);
        System.out.println("nathan.cohort = " + nathan.cohort);

        //I'm still in a pickle: I need a method to handle if the student name is on record and we have an assigned cohort on record! Well, let's just make another method for that!

        Student kenneth = new Student("Kenneth Howell", "Deimos");

        System.out.println("kenneth.name = " + kenneth.name);
        System.out.println("kenneth.cohort = " + kenneth.cohort);

        Student unknown = new Student();

        System.out.println("unknown.name = " + unknown.name);
        System.out.println("unknown.cohort = " + unknown.cohort);

        System.out.println("kenneth.campus = " + kenneth.campus);

        System.out.println("nathan.rollCall() = " + nathan.rollCall());
        System.out.println("kenneth.rollCall() = " + kenneth.rollCall());
    }

}