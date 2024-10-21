package oct.exe_015102024;

public class IncrDecrementTask {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        System.out.println(a++  + a); //21
        System.out.println(a); //11
        System.out.println(++b  + b); //42
        System.out.println(b++  + ++b); //44

        int c=5;
        int result= --c;
        System.out.println(c);
        System.out.println(c--);

    }
}
