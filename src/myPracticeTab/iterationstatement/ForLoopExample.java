package myPracticeTab.iterationstatement;

public class ForLoopExample {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
           System.out.println(i);
       }
        //print 10 to 1 for loop syntax for(){}

//        for (int i=10; i>0; i--){
//            System.out.println(i);
//        }
        //print odd number between 1 to 10

//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//                i++;
//            }
        //print even number between 1 to 10

//        for(int i = 1; i<=10; i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }
        for(int i =1; i<=10; i++){
            if(i!=5 && i!=7){
                System.out.println(i);
            }else{
                System.out.println("This is not required");
            }
        }

    }
}
