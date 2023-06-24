package chap_03;

public class _02_String2 {
    public static void main(String[] args) {

        String s = "I like Java and Python and C.";

        System.out.println(s.replace("and",",")); //and를 ,로 바꾸기

        System.out.println(s.substring(7)); //Java부터 출력
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 끝 위치는 끝 직전을 자른다 이건 온점 안나와

        //공백 제거
        s = "           I love you                 ";
        System.out.println(s);
        System.out.println(s.trim());


        //문자열 합치기

        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.concat(",").concat(s2));


    }
}
