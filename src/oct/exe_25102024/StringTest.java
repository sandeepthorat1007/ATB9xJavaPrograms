package oct.exe_25102024;

import java.sql.SQLOutput;
import java.lang.*;

public class StringTest {
    public static void main(String[] args) {

        String s= "Sandeep"; //stored in SCP- String Constant Pool
        s="thorat";
        int L= s.length();
        System.out.println(L);
        System.out.println(s);

        String name= new String("Sandeep1");
        System.out.println(name);

        String name2= new String ("Siddhant");
        String name3= new String ("Siddhant");

        System.out.println(name2);
        System.out.println(name3);






    }
}
