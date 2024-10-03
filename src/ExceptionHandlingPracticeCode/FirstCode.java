package ExceptionHandlingPracticeCode;

public class FirstCode {
    public static void main(String[] args) {
        try{
            System.out.println("this block contains which may throw exceptions during run time");
        }


//        System.out.println("here should not be any other statements in between try and catch blocks.");


        catch(Exception e){
            System.out.println("this block  handles the exceptions thrown by  the try block");
        }
        // System.out.println("here should not be any other statements in between try and catch blocks and finally.");

        finally {
            System.out.println("this block is always executed whether an exception is thrown or not and thrown exception is caught or not");
            System.out.println("releasing the resources are kept in this block");
        }

    }
}
