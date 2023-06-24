package chap_03;

public class _01_String1 {
    public static void main(String[] args) {

        String s = "I hate Java ~ Python ~ All ~";
        System.out.println(s);

        System.out.println(s.length()); //13

        System.out.println(s.toUpperCase()); //대문자로 변환
        System.out.println(s.toLowerCase()); //소문자로 변환

        //포함관계
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("~")); //처음 일치하는 정보
        System.out.println(s.lastIndexOf("~")); //마지막 정보
        System.out.println(s.indexOf("C#")); //포함되지 않으면 -1 반환


        //문장구조 확인
        System.out.println(s.startsWith("I like"));
        System.out.println(s.endsWith("~"));








    }
}
