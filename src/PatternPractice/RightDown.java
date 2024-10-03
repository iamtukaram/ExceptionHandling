package PatternPractice;

public class RightDown {
    void  rightDown() {
        int size = 5;
        for (int i=0;i<size;i++) {
            for (int j=0;j<i;j++) {
                System.out.print(" ");
            }
            for (int k=size;k>i;k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
