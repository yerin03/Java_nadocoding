package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equals("Java")); // true

        System.out.println(s2.equals("python")); //false
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 없음 true



        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); // true

        s1 = new String("1234");
        s2 = new String("1234"); //메모리 공간일 다르다. 참조 다름

        System.out.println(s1.equals(s2)); //true 내용일 비교하고
        System.out.println(s1 == s2); //false가 나온다 참조를 비교한다


    }
}
