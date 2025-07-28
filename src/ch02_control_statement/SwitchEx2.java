package ch02_control_statement;

public class SwitchEx2 {
    public static void main(String[] args) {

        String name = "홍길동";
        char grade = 'A';
        String ah = "" ;
        switch (grade) {
            case 'A':
                ah += "강남 빌딩";
            case 'B':
                ah += "고급 승용차";
            case 'C':
                ah += "노트북" ;
                break;
            default:
                System.out.println("꽝");

        }
        System.out.println(name+"님의 등급은 "+grade+"경품은 "+ah+"입니다");

    }
}
