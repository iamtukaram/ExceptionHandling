package PatternPractice;

public class RightTriangle {
    void rightTriangle(){
        int size = 5;
        for (int i=0;i<size;i++) {
            for (int j=0;j<size-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
