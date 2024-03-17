import java.util.Enumeration;
import java.util.Scanner;

public class Ch5_whileloops {
    public static void main(String[] args) {
    /*    int i = 100;
        while (i <= 200) {         //inside the parenthesis must be boolean
            System.out.println(i);
            i++;
        }
       /* while(true){
            System.out.println("yo mama");  //infinite loop
        } */
    /*    int b;
        do {
            b = 10;
            System.out.println(b);   //first executes the code and sees the condition
            b++;

        } while (b <= 5);*/

    /*    int n =1;
        do{
            System.out.println("the first n natural numbers are: "+n);
            n++;
        }while(n<=100);*/

//       for (int n = 1; n%2!= 0;n++){
//            System.out.println(n);
//        }
        //   largest of N integers:::given an integer N i.e, the size of the
        //   input of the integers find the largest integer
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxValue =  Integer.MIN_VALUE;

        for(int i = 0;i<=N; i++ ){
            int Current = sc.nextInt();
            maxValue = Math.max(maxValue, Current);
        }
        System.out.println(maxValue);

//count the digit of a number N and print its number of digits
    /*    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digits = 0;
        while(N>0){
            N /= 10;
            digits++;
        }
        System.out.println(digits);*/

//Random Game
//        while(true){
//        int num = (int) (Math.random()*10+1);
//        if (num == 5)
//            break;
//        if(num %4 ==0)
//            continue;
//            System.out.println(num+ " ");
//
//        }

    }
}
