package oct.exe_10102024.typecasting;

public class typeCasting {
    public static void main(String[] args) {
        byte b=10;
        int a=b;
        System.out.println(a); //Valid,implicit casting- automatically does by JVM
        //compatible data types are type-casted implicitly
        int a1 =(int) b; //This is same as above, explicitly given

        int val=200;
        byte b2= (byte)val; //valid
        System.out.println(b2);
       // byte b1 =(int) val;  //error as int can not be converted to byte - ava: incompatible types: possible lossy conversion from int to byte

        //GST=18.45;

        int course=100;
        float GST= 18.45f;

        int total_course= course;
        int total_course2= (int)GST;
        System.out.println(total_course);
        System.out.println(total_course2);


    }
}
