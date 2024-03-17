import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class ch3_sums {
    public static void main(String[]args){
        //1 question
        /*String name = "SRIkAnth";
        System.out.println("the converted string to lowercase is: " +name.toLowerCase());
        */
        //2 question
     /*   String newname = "busi vara prasad";
        System.out.println("the replaced white spaces with underscores are  "+newname.replace(" ","_"));

     */
     /*   Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("letter = DEAR " +name+ ",Trains a lot");
        System.out.println();*/

        //or
   /*     String Letter = "Dear  <|Name|>, thanks a lot";
        String newletter = Letter.replace("<|Name|>","Srikanth");
        System.out.println(newletter);*/

        //4 question
   /*     String str = "this   contains triple and  double  white spaces";
            System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));*/

     //5 question
        String newletter = "Dear Srikanth, \n\tThe java course was awesome \n\tThank you";
        System.out.println(newletter);


    }
}
