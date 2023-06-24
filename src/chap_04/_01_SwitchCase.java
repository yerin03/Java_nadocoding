package chap_04;

public class _01_SwitchCase {
    public static void main(String[] args) {

        //Switch Case

        int ranking = 1;

        switch(ranking){

            case 1:
                System.out.println("전액장학금");
                break;

            case 2 :
                System.out.println("반 장");
                break;

            default:
                System.out.println("장학금 대상 아님");
                break;

        }

    }


}
