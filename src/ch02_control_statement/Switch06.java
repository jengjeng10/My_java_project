package ch02_control_statement;

public class Switch06 {
    public static void main(String[] args){
        int score = 59 ;
        String total;

        switch(score/ 10) {
            case 10: case 9:
                total = score+" 점은 A학점";
                break;
            case 8:
                total = score+" 점은 B학점";
                break;
            case 7:
                total = score+" 점은 C학점";
                break;
            case 6:
                total = score+" 점은 D학점";
                break;
            default:
                total = score+" 점은 F학점";

        }
        System.out.println(total);


    }
}
