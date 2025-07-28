package ch02_control_statement;

public class Switch08 {
    public static void main(String[] arg){
        int month = 4;
        String season ;

        switch (month) {
            case 3: case 4: case 5:
                season = month+"월은 봄 입니다.";
                break;
            case 6: case 7: case 8:
                season = month+"월은 여름 입니다.";
                break;
            case 9: case 10: case 11:
                season = month+"월은 가을 입니다";
                break;
            default:
                    season =month+"월은 겨울 입니다.";
        }
        System.out.println(season);
    }
}
