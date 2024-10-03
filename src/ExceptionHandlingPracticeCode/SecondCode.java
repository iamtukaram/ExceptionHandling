package ExceptionHandlingPracticeCode;

public class SecondCode {
    public static void main(String[] args) {
        try{
            System.out.println(1);
            int i = 100/0;
            System.out.println(2);
        }catch (ArithmeticException e){
            System.out.println(3);
        }
    }
}
