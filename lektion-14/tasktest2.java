import java.util.ArrayList;

public class tasktest2 {
    public static void main(String[] args) {
        ArrayList<Student> myList = new ArrayList<Student>();
        
        myList.add(new Student("Johan"));
        myList.add(new Student("Isak"));
        myList.add(new Student("Kebemil"));
        for (Object st : myList) {
            System.out.println(st);
        }
    } 
   

}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}