package ch02_control_statement;

public class AdultCheck {
    public static void main(String[] args) {
        String name = "홍길동"; // 이름
        int age = 18 ; // 나이
        int _gender = 3 ;// 주민 번호 뒷자리 성별(숫자)
        String gender ; //성별(한글)

        System.out.print("이름 : "+name);
        if(age >= 19){

            System.out.print(" 성인 체크 : 성인");


        }else{

            System.out.print(" 성인 체크: 미성년자");

        }

        if(_gender == 3|| _gender == 1){

            System.out.print(" 성별 : 남자");

        }else{

            System.out.print(" 성별 : 여자");

        }


    }
}
