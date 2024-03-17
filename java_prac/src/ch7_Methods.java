public class ch7_Methods {
     int logic(int x, int y){
        int z;
         if (x>y) {
             z = x + y;
         } else{
             z = (x+y)/2;
                                         //if static keyword is not used
             //we have to define our own object by initializing it
             //ch7_Methods obj = new ch7_Methods()
             //c = obj.logic(a,b);
         }
         return z;
    }
    public static void main(String[] args) {
        int a =39,b=69;
        int c;
        ch7_Methods obj = new ch7_Methods();
        c = obj.logic(a,b);
        System.out.println(c);

        int a1 = 60, b1 =34;
        int c1;
        ch7_Methods obj1 = new ch7_Methods();
        c1 = obj1.logic(a1,b1);

        System.out.println(c1);




    }
}

