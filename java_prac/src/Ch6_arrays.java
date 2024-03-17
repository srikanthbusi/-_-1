public class Ch6_arrays {
    public static void main(String[] args) {
         /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together
//        int [] marks = {98, 45, 79, 99, 80};
//
//        // marks[5] = 96; - throws an error
//        System.out.println(marks[4]);
//        String[]arr = {"harry","hello","yo","yyyy"};
//        //displaying array in a naive way
//        System.out.println(arr[1]);
//        System.out.println(arr[0]);
//        System.out.println(arr[2]);
//        int[] arr1 = {20,30,50,56,72,48,66,70};
//        System.out.println(arr1.length);
//        //displaying array in For loop
//        for (int i = 0; i<arr1.length;i++){
//            System.out.println(arr1[i]);  //Array traversal
//        }
//        //printing in the reverse order
//        for( int i = arr1.length-1;i>=0;i--){
//            System.out.println(arr1[i]);
//
//        }
//        // Printing using  for each loop
//        for(int element : arr1){
//            System.out.println(element);
//        }
//        //declaring,memory allocating the 3 dimensional arrays
//        int [][] flats = new int[3][4];
//        flats [0][1] = 101;
//        flats [0][2] = 102;
//        flats [0][3] = 103;
//        flats [0][0] = 100;
//        flats [1][0] = 200;
//        flats [1][1] = 201;
//        flats [1][2] = 202;
//        flats [1][3] = 203;
//        flats [2][0] = 300;
//        flats [2][1] = 301;
//        flats [2][2] = 302;
//        flats [2][3] = 303;
//
//        System.out.println("Printing a 2-D array using for loop");
//        for(int i=0;i<flats.length;i++){
//            for(int j=0;j<flats[i].length;j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
//        int [] A = {34,32,13,45,6,56,89,67,99,90};
//        for(int i = 0 ;i<A.length;i++){
//
//
//
//
//        }
//        int arr1[][][] = new int[4][5][6];
//        for (int i = 0; i < 4; i++) {
//            arr1[i] = new int[2];
//            System.out.println(arr1[i]);
//        }
//        float sum = 0 ,avg;
//        int a [] = {10,20,30,40,50};
//        for (int i  = 0 ; i<a.length;i++){
//            System.out.println(a[i]);
//        }
//
//        for (int i = 0 ; i<a.length;i++){
//            sum += a[i];
//
//
//        }
//        avg = sum/a.length;
//        System.out.println("the average is "+avg);
//
//
        int arr1[][][] = new int[3][5][6];
        int i,j,k;
        for (i=0;i<3;i++)
            for (j = 0; j < 5; j++)
                for (k = 0; k < 6; k++)
                    arr1[i][j][k] = i * j * k;


                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 5; j++) {
                            for (k = 0; k < 6; k++)
                                System.out.println(arr1[i][j][k] + " ");
                                System.out.println();
                            }
                            System.out.println();
                        }





    }
}
