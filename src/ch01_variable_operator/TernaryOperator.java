package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        // a = 3 b = 5  절대값 구하기
        int a = 3 , b = 5 ;
        int result ;

        result =  a >= b ? a - b : b - a ;
        System.out.println("절대 값 : " + result);



        int x = 2 ;
        result = x % 2 == 0 ? x + 3  : x * x ;
        System.out.println("절대 값 : " + result);


        x = 9 ;
        int y = 50 ;

        result = x >=y ? x : y ;
        System.out.println("큰 수 : "+ result);


        result = x <= y ? x : y ; // x가 y보다 작을 경우  true x 호출 : false y 호출
        System.out.println("작은 수 : "+ result);


        x = 5 ;
        y = 12 ;

        String yes;
        String no;
        yes = "yes";
        no  = "no" ;

        String str = y%x == 0 ? yes : no ;

        System.out.println("결과 : "+str);


        int su = 7 ;
        // 숫자 7은(는) 홀수입니다.

        String message = su % 2 !=0 ? "홀수" :"짝수" ;
        System.out.println("숫자 "+su+"은(는)"+message+"입니다");

        int score = 85 ; // 60점 이상이면 합격
        //85점이므로 합격입니다.
        String so ;
        so = score >= 60 ? "합격" : "불합격" ;

        System.out.println(score+"점이므로"+so+"입니다.");




    }
}
