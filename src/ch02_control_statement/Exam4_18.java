package ch02_control_statement;

public class Exam4_18 {
    public static void main(String[] args) {
        int su = 7 ;
        int result ;

        for (int i = 1 ; i <= 7 ; i ++) {

            result = i * i;
            System.out.println(i + "의 제곱은 " + result + "입니다.");

        }

        result = 0 ;
        int su01 = 3 ;
        int su02 = 7 ;
        // 3 +4 +5+ 6+ 7 = 합
        for(int i = su01; su01 <= su02 ; su01++){
          result += su01 ;

        }
        System.out.println(result);


    }
}