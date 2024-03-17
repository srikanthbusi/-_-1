import java.util.Scanner;
public class Arrays_scaler {
    public static void main(String []args){
     /*   int [] marks = new int[10];
        marks[0]= 4;
        marks[1]= 4;
        marks[5]= 4;
        marks[4]= 4;
        marks[3]= 5;
        System.out.println(marks[5]);
        System.out.println(marks[1]);
        System.out.println(marks);
        int [] marks1 = {1, 2, 3, 6, 8, 9};
        System.out.println(marks1[3]);
        float [] arr  = new float[5];
        System.out.println(arr[2]);
        String[] str = {"pehlee","bu","tu ankon"};
        System.out.println(str[0]);
        System.out.println(arr.length);*/
        // array input output
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N = sc.nextInt();
        int [] arr1 = new int[N];
        for(int i= 0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
            System.out.println("the iterations are ");
        }
        System.out.println(arr1[3]);
        //output
        for(int i = 0;i<arr1.length;i++ ){
            System.out.println("At index :" + i + "  value is ==" +arr1[i]);
        }





    }
}
