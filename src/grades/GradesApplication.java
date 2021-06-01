package grades;

import java.util.*;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>(); //initializes Hashmap

        Student roland = new Student("Roland");//creates individual students
        roland.addGrade(0);
        roland.addGrade(0);
        roland.addGrade(0);
        roland.addGrade(100);
        roland.recordAttendance("2021-05-02", "A");
        roland.recordAttendance("2021-05-03", "A");
        roland.recordAttendance("2021-05-04", "A");
        roland.recordAttendance("2021-05-05", "P");

        Student norma = new Student("Norma");
        norma.addGrade(0);
        norma.addGrade(0);
        norma.addGrade(100);
        norma.addGrade(100);
        norma.recordAttendance("2021-05-02", "A");
        norma.recordAttendance("2021-05-03", "P");
        norma.recordAttendance("2021-05-04", "P");
        norma.recordAttendance("2021-05-05", "P");

        Student tatiana = new Student("Tatiana");
        tatiana.addGrade(0);
        tatiana.addGrade(100);
        tatiana.addGrade(100);
        tatiana.addGrade(100);
        tatiana.recordAttendance("2021-05-02", "A");
        tatiana.recordAttendance("2021-05-03", "A");
        tatiana.recordAttendance("2021-05-04", "P");
        tatiana.recordAttendance("2021-05-05", "P");

        Student alex = new Student("Alex");
        alex.addGrade(100);
        alex.addGrade(100);
        alex.addGrade(100);
        alex.addGrade(100);
        alex.recordAttendance("2021-05-02", "P");
        alex.recordAttendance("2021-05-03", "P");
        alex.recordAttendance("2021-05-04", "P");
        alex.recordAttendance("2021-05-05", "P");


        students.put("novice-programmer", roland);// adds individual key value entries to hashmap
        students.put("midlevel-programmer", norma);
        students.put("expert-programmer", tatiana);
        students.put("wizard-programmer", alex);
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Here is the list of the user names.");
            System.out.println(students.keySet());// prints out all keys from hashmap - students
            System.out.println("Which of the users would you like to see information on?");
            String userName = scanner.nextLine();


            if (students.get(userName) != null) { // looks for the value(Student) of the specified key typed in.  if not found returns null.
                String realName = students.get(userName).getName();
                double personalGrade = students.get(userName).getGradeAverage();
                System.out.println("The information for " + userName + " is the following.");
                System.out.println("Their real name is " + realName + " and their average grade is " + personalGrade);

                System.out.println("Would you like to view all of " + realName + "'s grades? yes or no");
                String allGrades = scanner.nextLine();
                if (allGrades.equalsIgnoreCase("y")) {
                    System.out.println(students.get(userName).getAllGrades());
                }

                System.out.println("Would you like to view all the student averages? yes or no");
                String everyGrade = scanner.nextLine();
                if (everyGrade.equalsIgnoreCase("y")) {
                    double total = 0;
                    for (Map.Entry student : students.entrySet()) {
                        Student person = students.get(student.getKey());//gets value of student
                        System.out.println(person.getName() + " has and average of " +person.getGradeAverage());
                    }
                }

                System.out.println("Would you like to view the class average? yes or no");
                String classAverage = scanner.nextLine();
                if (classAverage.equalsIgnoreCase("y")) {
                    double total = 0;
                    for (Map.Entry student : students.entrySet()) {
                        Student person = students.get(student.getKey());
                        total += person.getGradeAverage();
                    }
                    System.out.println("The class average is: " + total / students.size());
                }
            }
            else {
                System.out.println(userName + " does not exist. You will have to continue to try again.");
            }

            System.out.println("Woud you like to create a report of all student information? yes or no");
            String  report = scanner.nextLine();
            if (report.equalsIgnoreCase("y")) {
                System.out.println("name,github_username,average");
                for (Map.Entry student : students.entrySet()) {
                    Student person = students.get(student.getKey());
                    System.out.println(person.getName() + "," + student.getKey() + "," +person.getGradeAverage());
                }
            }

            System.out.println("Would you like to create an absence report of all student information? yes or no");
            String attendance = scanner.nextLine();
            if (attendance.equalsIgnoreCase("y")) {
                for (Map.Entry student : students.entrySet()) {
                    Student person = students.get(student.getKey());//gets value of student
                    System.out.println(person.getName() + " has an attendance of " + person.attendancePercentage() + "%");
                    person.dayAbsent();
                }
            }


            System.out.println("Would you like to continue? yes or no?");
            String yesNo = scanner.nextLine();
            if (!yesNo.equalsIgnoreCase("y")){
                break;
            }
        }

    }
}