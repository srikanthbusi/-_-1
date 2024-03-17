import java.util.Scanner;
public class Ch4_Elseif_Switch {
    public static void main(String[]args){
        System.out.println("Enter the age of applicant:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
       /* if(age >50){
            System.out.println("he is an veteran");
        }                                          //if else ladder
        else if(age >35){
            System.out.println("he is experienced");
        } else if (age > 25) {
            System.out.println("he is novice");
        } else{
            System.out.println("you are not experienced!!!!");
        }  */

        switch(age){        //in enhanced switch there is no need to use the break statement
            case 12:
                System.out.println("you are an adolescent");
                break;
            case 18:
                System.out.println("you are going to become an Adult");
                break;
            case 25:
                System.out.println("you are going to  an profession");
                break;
            default:
                System.out.println("enjoy life bro");


        }
        System.out.println("you are using java");
    }
}
