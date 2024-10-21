package oct.exe_015102024;

public class TernaryTask {
    public static void main(String[] args) {

        //result= condition?expression1 : (condition ?expression2 :expression3)

        int score=85;
        String grade= (score >= 90) ? "A" :(score >= 80) ? "B" : (score >= 70) ?"C": "F";
        System.out.println(score);
    }
}
