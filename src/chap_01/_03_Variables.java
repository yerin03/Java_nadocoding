package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "예린";
        int hour = 15;
        double score = 90.5;
        char grade = 'A';
        boolean pass = true;

        System.out.println(name + "님의 평균 점수는" + score + "이고 학점은" + grade +"입니다.");

        System.out.println(name + "님 " + hour + "시 입니다.");

        System.out.println("이번 시험 합격 했나?" + pass);

        double d = 3.141234567;
        float f = 3.14123456f;

        System.out.println(d);
        System.out.println(f);

        long l = 100000000000l;

        System.out.println(l);


    }
}
