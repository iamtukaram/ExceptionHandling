package PatternPractice;

public class LeftDown {
    void leftDown(){
        int size = 5;
        for (int i=0;i<size;i++) {
            for (int j=size;j>i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
