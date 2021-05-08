package grades;
import java.util.ArrayList;


public class Student {
    //Properties
    private String name;
    private static ArrayList<Integer> grades;

    //Method Testing..
    public static void main(String[] args){
        Student Clare = new Student("Clare");
        System.out.println(Clare.getName());
        addGrade(85);
        addGrade(92);
        addGrade(78);
        addGrade(84);
        addGrade(98);
        addGrade(58);
        System.out.println(Clare.getGradeAverage());
    }


    //Returns the students name
    public String getName(){
        return this.name;
    }

    //Create a student
    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    public static void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        Integer sum = 0;
        if(!grades.isEmpty()){
            for(Integer grade : grades){
                sum += grade;
            }
            return sum.doubleValue() / grades.size();
        }
        return sum;
    }



}
