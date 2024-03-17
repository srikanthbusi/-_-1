public class method {
    static void introduce(String name, int age, String[] hobbies){
        System.out.println("my name is:"+name);
        System.out.println("my age is :"+age);
        System.out.println("my hobbies are:");
        for (String hobby: hobbies){
            System.out.println(" "+hobby);
        }

    }
    public static void main(String[] args){
        String name = "srikanth";
        int age= 20;
        String [] hobbies = {"books,cfime"};
        introduce(name,age,hobbies);

    }
}
