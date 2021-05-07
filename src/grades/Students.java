import java.util.ArrayList;
package grades;

public class Students {
    private ArrayList<Integer> Grades = new ArrayList<>;

    private String Name;

    public String getName(){
        return this.Name;
    }

    public void addGrade(int grade){
        Grades.add(grade);
    }

}
