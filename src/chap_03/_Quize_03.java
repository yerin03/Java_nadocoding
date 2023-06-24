package chap_03;

public class _Quize_03 {
    public static void main(String[] args) {

        String pId = "000303-4112342";

        System.out.println(pId.substring(0,8));
        System.out.println(pId.substring(0,pId.indexOf("-")+2));
    }
}
