package ch02_control_statement;
//정수 1개에 대하여 3의 배수인 경우와 아닌 경우를 구분하여 다음과 같이 출력해 보세요

public class If03 {
    public static void main(String[] args) {
        int su = 4 ;

        if (su % 3 == 0) {

            System.out.println(su+"는(은) 3의 배수 입니다.");
            System.out.println(su * su);

        }else{

            System.out.println(su+"는(은) 3의 배수가 아닙니다");
            System.out.println(su + 5);

        }


    }
}
