package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        score = 93 + (int)98.9;
        System.out.println(score);

        double score_2 = 101.12;

        double convertedScoreDouble = score; // 93 -> 93.0
        // int -> long -> float -> double (자동 형변환)

        int convertedScoreInt =  (int)score_2;
        //(수동 형변환)

        //숫자 -> 문자
        String s1 = String.valueOf(93); //String이 제공해주는 Class를 이용하여 숫자를 문자로 형변환
        s1 = Integer.toString((93)); //이 방법도 있어
        System.out.println(s1);

        //double -> string
        String s2 = String.valueOf(93.3);
        s2 = Double.toString(93.3);
        System.out.println(s2);

        //문자열 -> 숫자

        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("89.9");
        System.out.println(d);


    }
}
