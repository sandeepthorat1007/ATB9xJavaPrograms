package oct.exe_018102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditions_Loops {
    public static void main(String[] args) {

        //int age=20;
        //if age is >18 then vote
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt ();

        if (age >18) {
            System.out.println("Allowed to vote");
        }

        else {
            System.out.println("Not allowed to vote");
        }

    }
}
