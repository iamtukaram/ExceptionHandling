package Projects.StudentGrade;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        try{
            s1.marks(70);
        }catch (InvalidMarksException e){
            System.out.println(e);
        }
    }
}
