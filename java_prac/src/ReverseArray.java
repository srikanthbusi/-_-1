import java.util.Arrays;

public class ReverseArray {
    public static void main(String[]args){
//        int [] array = {10,20,30,40,50,60};
//        System.out.println("before Reversing" +Arrays.toString(array));
//        reverseArray(array);
//        System.out.println("After Reversing"+ Arrays.toString(array));
//
//
//    }
//    public static void reverseArray(int[] arr){
//        int len = arr.length;
//        int count = len/2;
//        for (int i = 0; i<count ; i++) {
//            int temp = arr[i];
//            arr[i] = arr[len - 1 - i];
//            arr[len - 1 - i] = temp;
//        }

        int[] list = {20,30,40,50,60,70,80};
        for(int i =0 ;i<list.length;i++)
        System.out.print(list[i] + " ");
        for (int i =list.length-1;i>=0;i--){
            System.out.print(list[i] + "  ");
        }


//
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
    }
}
