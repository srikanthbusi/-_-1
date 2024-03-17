import java.util.Scanner;

public class ch6_practise_sums {
    public static void main(String[]args){

        //1 question
//        float[]arr = {23.4f,45.3f,56.2f,44.2f,98.5f};
//        float sum = 0;
//        for (int i = 0;i<+arr.length;i++){
//            sum = sum + arr[i];
//
//        }
//        System.out.println(sum);

//        2 question
//        int [] arr1 = {23,12,45,90,78,45};
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i =0;i<arr1.length;i++){
//            if (n == arr1[i]){
//                System.out.println("the number is found in the given array");
//            }
//        }
//        3 question
//        int [] physics = {80,82,90,66,57,89,79};
//        int sum = 0;
//        for (int avg : physics){
//            sum = sum +avg;
//
//        }
//        System.out.println("the Total marks of students in physics are : "+sum);
//        float average = sum/7;
//        System.out.println(average);
//        4 question
//        int sum =0;
//        int [][] mat1 = {{2,3,4},
//                         {3,5,6}};
//
//        int[][]mat2= {{6,7,8},
//                      {2,1,6}};
//
//        for (int i = 0; i< mat1.length;i++){
//            for (int j = 0;j<mat1[i].length;j++){
//                sum= sum + mat1[i][j];
//            }
//        }
//        for (int k =0 ;k<mat2.length;k++){
//            for (int l = 0;l<mat2[k].length;l++){;
//                sum = sum + mat2[k][l];
//            }
//        }
//        System.out.println(sum);

//       4 Question
        int [][] mat1 = {{2,3,4},
                {3,5,6}};

        int[][]mat2= {{6,7,8},
                {2,1,6}};
        int[][] sum ={{0,0,0},
                      {0,0,0}};

        for (int i = 0; i< mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                System.out.format("the elements of i=%d and j=%d\n",i,j);
                sum[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        for (int i = 0; i< mat1.length;i++){
            for (int j = 0;j<mat1[i].length;j++){
                System.out.print(sum[i][j]+" ");
                sum[i][j]= mat1[i][j]+mat2[i][j];
            }
            System.out.println(" ");
        }

//    5 Question
//        int [] arr = {1, 21, 3, 4, 5, 34, 67};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//
//        for(int element: arr){
//            System.out.print(element + " ");
//        }
//        6 Question
//        long [] arr = {1,2,50,60,897,3467,3464366,346653236};
//        long max = 0;
//        for (long element : arr){
//            if (element>max){
//                max = element;
//            }
//        }
//        System.out.println("the maximum elements are"+max);
//        long min = max;
//        for (long element : arr){
//            if (element<min){
//                min= element;
//            }
//        }
//        System.out.println("the minimum elements are "+min);

//        7 Question
//        int [] arr1 = {23,45,6,98,445,233,123,45,23};
//        int min = 0;
//        for (int elements:arr1){
//            if (elements<min){
//

        // Practice Problem 7
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }

    }
}
