public class ch7_varargs {
//    static int sum(int a,int b){
//        return a+b;
//
//    }
//    static int sum(int a,int b,int c) {
//        return a+b+c;
//
//    }
//    static int sum(int a,int b,int c,int d,int e) {
//        return a+b+c+d+e;
//
//    }
    static int sum (int x,int ...arr){
//        int [] arr;
//available as int[]arr
       int  result = 0;
        for(int a :arr) {
            result = result + a;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("to demonstrate Varargs" );
        System.out.println("the summation of a and b are:" + sum(5,8));
        System.out.println("the summation of a and b are:" + sum(3,6,9));
        System.out.println("the summation of a and b are:" + sum(2,8,5,7,1));
        System.out.println("the summation of a and b are:" + sum(2,8,5,7,1,5,8,9));
    }
}
