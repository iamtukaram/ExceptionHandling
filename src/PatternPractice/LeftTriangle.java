package PatternPractice;

public class LeftTriangle {
    void leftTriangle(){
        int size = 5;
        for (int i=0;i<size;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
