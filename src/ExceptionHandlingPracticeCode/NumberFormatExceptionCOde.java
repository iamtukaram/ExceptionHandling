package ExceptionHandlingPracticeCode;

class Code2{
    void handlingException(){
        System.out.println(1);
        try{
            System.out.println(2);
            int a = Integer.parseInt("Bahir");
            System.out.println(3);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException "+4);
        }
        finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}

class Code1{
    void handlingExceptionWithParent(){
        System.out.println(1);
        try{
            System.out.println(2);
            int i = Integer.parseInt("ABC");
            System.out.println(3);
        }catch (Exception e){
            System.out.println(4);
        }
        finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}

public class NumberFormatExceptionCOde {
    public static void main(String[] args) {
        Code1 code1 = new Code1();
        code1.handlingExceptionWithParent();
        System.out.println("*********************************************");

        Code2 code2 = new Code2();
        code2.handlingException();
    }
}
