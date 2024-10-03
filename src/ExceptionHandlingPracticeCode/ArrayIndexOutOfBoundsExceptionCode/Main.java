package ExceptionHandlingPracticeCode.ArrayIndexOutOfBoundsExceptionCode;

public class Main {
    public static void main(String[] args) {
        try {
            int arr[] = {1,2,3,5};
            int i = arr[5];

        }catch (NumberFormatException e)
        {
            System.out.println(1);
        }
        catch (NullPointerException e)
        {
            System.out.println(2);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(3);
        }
    }
}
