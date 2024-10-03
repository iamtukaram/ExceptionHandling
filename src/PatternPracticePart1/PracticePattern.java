package PatternPracticePart1;



class  Test{
    void trianglePattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
    }

    void numberIncreasingPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=5;j<i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();

    }

    void numberIncreasingReversePyramid(int num){

        for(int i=num;i>1;i--){

            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
    }
    void numberChangingPyramid(int l){
        int count =0;
        for(int i=1;i<=l;i++){
            for(int j=1;j<=i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
    }
    void practiceMethod(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" "); //1 1
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
    }
    void practiceMethodSecond(){
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for (int k=0;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=3;j>=i;j--){
                System.out.print("*");
            }


            System.out.println();
        }

        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
    }


}


public class PracticePattern {
    public static void main(String[] args) {
        Test test = new Test();

        test.trianglePattern(5);
        test.numberIncreasingPyramid(6);
        test.numberIncreasingReversePyramid(6);
        test.numberChangingPyramid(6);
        test.practiceMethod();
        test.practiceMethodSecond();





        for (int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4 ) {
                    System.out.print(" "+j+" ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==3){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1 || i==5 || j==5){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==i-2 || j==1 || i+j==4){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("##########################OOXOO###########################");
        System.out.println();
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){//row
            for(int k=i;k>0;k--){
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print("*"+" ");
            }

            System.out.println();
        }

    }
}
