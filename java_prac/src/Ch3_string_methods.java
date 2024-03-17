public class Ch3_string_methods {
     public static void main(String[]args){
         String nam = "Srikanth";
         System.out.println(nam.length());
         System.out.println(nam.toLowerCase());
         System.out.println(nam.toUpperCase());
         String nontrimstr = "    srikanth     ";
         System.out.println(nontrimstr.trim());
         System.out.println(nam.substring(2,6));
         System.out.println(nam.replace('r','h'));
         System.out.println(nam.replace("ri","hri"));
         System.out.println(nam.replace("r","ier"));
         System.out.println(nam.startsWith("Sri"));
         System.out.println(nam.endsWith("h"));
         System.out.println(nam.charAt(6));
         System.out.println(nam.indexOf("th"));
         String modified_name = "srrrikanth";
         System.out.println(modified_name.indexOf("r",3));
         System.out.println(modified_name.lastIndexOf("r"));
         System.out.println(modified_name.equals("SrikANTH"));
         System.out.println((nam.equalsIgnoreCase("srikanth")));

         System.out.println("hello every one \"bgunnara");
     }
}
