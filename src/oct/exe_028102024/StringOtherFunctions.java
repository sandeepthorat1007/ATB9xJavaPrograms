package oct.exe_028102024;

public class StringOtherFunctions {
    public static void main(String[] args) {
        String str= "Sandeep";
        String sub_str=str.substring(2, 3);
        System.out.println(sub_str);

        String str1= "Sandeep1";
        String str2= "Thorat";
        String result= str1 + str2;
        String s2= str1.concat("Superb");
        System.out.println(s2);

        System.out.println(result);

        //Splitt function
        //str1.split()

        //ChartAt()
        String s= "SandeepThorat";
        System.out.println(s.charAt(8));
        //System.out.println(s.charAt(20); //IndextOutOfBoundException

        //Trim ()

        String M= "sandeepthorat";
        System.out.println(M.indexOf('t'));

        //contains()
        System.out.println(M.contains("thorat"));
        //Practice all
        //replace
        //lastIndexOf
        //StartsWith
        //endsWith
        //replaceAll - regex



    }
}
