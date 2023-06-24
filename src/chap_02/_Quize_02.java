package chap_02;

import org.w3c.dom.ls.LSOutput;

public class _Quize_02 {
    public static void main(String[] args) {


        int child_1 = 123;
        int child_2 = 110;

        String result = (child_1 > 120) ? "탑승 가능" : "탑승 불가능";
        String result2 = (child_2 > 120) ? "탑승 가능" : "탑승 불가능";

        System.out.println(result);
        System.out.println(result2);

    }

}
