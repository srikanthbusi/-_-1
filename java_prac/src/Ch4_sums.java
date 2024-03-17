import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class Ch4_sums {
    public static void main(String []args){

     //1 question
      /*  int a = 10;
       if(a=11)*/

        //2 question
     /*   System.out.println("Enter the subject marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Maths marks: ");
        byte m1 = sc.nextByte();
        System.out.println("Enter the Chemistry marks:");
        byte m2 = sc.nextByte();
        System.out.println("Enter the history marks:");
        byte m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage :  " +avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>= 33){
            System.out.println("You are passed ");
        }
        else {
            System.out.println("you are failed");
        }  */
        //3 question
        Scanner sc = new Scanner(System.in);
      /* System.out.println("Enter your income in Lakhs per annum");
       float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
       }
      else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
           tax = tax + 0.3f * (income - 10.0f);
        }

       System.out.println("The total tax paid by the employee is: " + tax);*/

        //4 question
    /*    System.out.println("Enter the days :");
        byte days = sc.nextByte();
        switch(days){
            case 1:
                System.out.println("Today is monday");
            break;
            case 2:
                System.out.println("Today is tuesday");
            break;
            case 3:
                System.out.println("Today is tuesday");
                break;
            case 4:
                System.out.println("Today is tuesday");
                break;
            case 5:
                System.out.println("Today is tuesday");
                break;
            case 6:
                System.out.println("Today is tuesday");
                break;
            default:
                System.out.println("today is holiday!!!!");
        }*/
        //5 question
    /*    System.out.println("enter the year:");
        int year= sc.nextInt();
        if (year %4== 0 && year %100!=0 || year %400 ==0){
            System.out.println("this is a leap year!");
        }else{
            System.out.println("this is not an leap year!!!!!");
        }*/
   /*     System.out.println("Enter the type of Urls :");
        String url = sc.next();
        if (url.endsWith(".com")){
            System.out.println("Commercial Website");
        } else if (url.endsWith(".org")) {
            System.out.println("This is an organizational Website");

        }
        else if(url.endsWith(".in")){
            System.out.println("Indian Website");
        }
        Random r = new Random();
        int a =r.nextInt();
        System.out.println(a);
        ROCK + PAPER = ROCK
        PAPER + ROCK = ROCK
        SCISSOR + ROCK =ROCK
        ROCK +SCISSOR = ROCK
        ROCK + ROCK = ROCK
        SCISSOR + SCISSOR = SCISSOR
        PAPER + PAPER = PAPER
        PAPER + ROCK = ROCK
        ROCK + PAPER = ROCK
        SCISSOR + ROCK = ROCK
        ROCK + SCISSOR = ROCK
        PAPER + SCISSOR = SCISSOR
        SCISSOR + PAER = SCISSOR
*/
    //    Random hand1 = new Random();
       // int ran1 = hand1.nextInt();
      //  System.out.println(ran1);
      //  Random hand2 = new Random("rock","paper","scissor");
       //  ran2 = hand2.nextInt();

     /*   System.out. println(1 + 1 + 1 + 1 + 1 == 5);
        int a = 10, b = 20;

        int c = a / b;
        System.out. println( (a >= 5) && (b <= 10) && (a/c >= 5));
*/



    }
}
