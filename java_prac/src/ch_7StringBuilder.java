public class ch_7StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello everyone");
        sb.append(" this is srikanth");
        sb.insert(23,"BUSI ");
        sb.replace(0,4,"chau");
        sb.delete(4,5);
        String str = sb.toString();
        System.out.println(str);
    }


}
