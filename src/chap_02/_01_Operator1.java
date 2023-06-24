package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        //++val -> 더하고 연산
        //val++ -> 연산하고 증가

        int val = 10;
        System.out.println(val);//10
        System.out.println(val++);//10
        System.out.println(val);//11
        System.out.println(++val);//12


        //비교연산자

        System.out.println(5>3); //true
        System.out.println(5<3); //false


        //논리연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = false;
        boolean 냉모밀 = true;

        System.out.println(김치찌개 || 계란말이 || 냉모밀);
        System.out.println(김치찌개 && 계란말이 && 냉모밀);

        //삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)

        int x = 5;
        int y = 3;

        int max = (x > y)? x : y;

        System.out.println(max);





    }
}
