import java.util.Scanner;

public class input2darray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int [][]arr = new int[rows][col];
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[1].length;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[1].length;j++){
                System.out.println(arr[i][j]);

            }
        }

    }

}
