package Projects.StudentGrade;



public class Student {
  void marks(int marks) throws InvalidMarksException{
    if(marks < 0 || marks > 100){
        throw new InvalidMarksException("Invalid Marks");
    }
    if(marks >= 90){
        System.out.println("A");
    }else if(marks >= 80){
        System.out.println("B");
    }else if(marks >= 70){
        System.out.println("C");
    }else if(marks >= 60){
        System.out.println("D");
    }else {
        System.out.println("Fail");
    }
  }
}
