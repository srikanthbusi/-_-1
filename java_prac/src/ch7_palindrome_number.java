import java.util.Scanner;
public class ch7_palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an palindrome string");
        String str = sc.next();
//        to generate the reverse of a string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        if (rev.equals(str)){
            System.out.println("this is an palindrome number");
        }else {
            System.out.println(str+ "is not an palindrome ");
        }
        String str1 = "hello";
        char [] ch = {'h','e','l','l','o'};
        char [] arr2 = str1.toCharArray();
        System.out.println(str1);

        String str2 = new String(ch);
        System.out.println(str2);

        char ch1 = 'S';

        char ch2 = 'C';

        String s = ch1 + ch2 + "ALER";

        System.out.println(s);

        Scanner scn = new Scanner(System.in);



        String s1 = scn.next();

        String s2 = scn.next();



        if(s1 == s2) {

            System.out.println("Strings are equal");

        }

        else {

            System.out.println("Strings are not equal");

        }

    }
}
