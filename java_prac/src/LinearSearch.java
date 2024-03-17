import java.util.Scanner;
public class LinearSearch {
    public static void main(String []args){
     /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ans = -1;
        int [] arr = new int[n];
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();

        }
        int key = sc.nextInt();
    /*    for(int i = 0;i<n;i++){
            if (arr[i]==key){
                ans = i;
                break;*/

        //from reverse order
       /*         for(int i = n-1;i>=n;i--){
                    if (arr[i]==key){
                        ans = i;
                        break;
            }

        }
        System.out.println(ans);*/
        int [] arr = {3,5,9,10};
        boolean found= false;
        int key = 5;
        for(int num : arr){                      //For each loop  ____enhanced for loop
            System.out.println(num);
            if (num == key){
                System.out.println(found = true);

            }
        }
        if (found==true){
            System.out.println("yes " +key+ " is found");
        }else {
            System.out.println("not found");
        }

    }
}
