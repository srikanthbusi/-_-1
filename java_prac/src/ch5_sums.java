import java.util.Scanner;
public class ch5_sums {
    public static void main(String[] args) {
        //1 question
//        int n = 4;
//        for (int i = n;i>0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//
//        }


        //2 question
        int sum = 0,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first n even numbers:");
        int n= sc.nextInt();
        while(i<n){
            i++;
            sum +=  (2*i);
        }
        System.out.println("the summation of n numbers are :"+sum);
        //3 question
//
//        int mul = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first multiplier::");
//        int n = sc.nextInt();
//
//        for (int i = 0;i<=10;i++){
//            mul = n*i;
//            System.out.println(+n+"x"+i+ "=" +mul );
//        }
//
        //      4 question
//        int mul = 0;
//        int n = 10;
//        System.out.println("The "+n+ "in reverse order is:");
//
//
//        for (int i = 10;i>=1;i--){
//            mul = n*i;
//            if (i==0)
//                break;
//            System.out.println(+n+"x"+i+ "=" +mul );
//        }
        //5 question factorial 5=5*4*3*2*1

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int n = sc.nextInt();
//        int factorial = 1;
//        int i = 1;
//        while (i <= n) {
//
//            factorial = factorial * i;
//        i++;
//
//
//        }
//        System.out.println("the factorial of" + n + "is:" + factorial);

        //using for loop
//        int N = sc.nextInt();
//        int factorial = 1;
//        for (int i = 1; i <= N; i++) {
//            factorial = factorial*i;
//
//        }
//        System.out.println("the factorial of " +N+ "is: " +factorial);
//            6 question
//        System.out.println("Enter the repetitive times of a given number::");
//        int N = sc.nextInt();
//        int i = 0;
//        while (i <= N) {
//            System.out.println(5);
//            i++;
//        }
       //   7 question
//        int mul = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the first multiplier::");
//        int n = sc.nextInt();
//        int sum = 0;
//
//        for (int i = 0;i<=10;i++) {
//            mul = n * i;
//            System.out.println(+n + "x" + i + "=" + mul);
//            sum +=n*i;
//
//        }
//        System.out.println(sum);



    }
}


