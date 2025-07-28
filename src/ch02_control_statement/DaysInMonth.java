package ch02_control_statement;

public class DaysInMonth {
    public static void main(String[] args) {
        int month = 3;
        int day = 0 ;
        String soo ;
        switch (month) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:                      //1 ,3,5,7,8,10,12 31일
                day = 31;
                break;

            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            case 2:
                day = 28;
                break;
            default:
                System.out.println("잘못된 월입니다.");
                System.exit(0);
        }
            System.out.println(month+"월은 "+day+"일 입니다");
    }
}
