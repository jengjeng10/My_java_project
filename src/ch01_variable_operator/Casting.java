package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {

        double d = 100 ;
        System.out.println("d : "+d);

        int a = (int)12.5;
        System.out.println("a : "+a);


        System.out.println((14/5));


        System.out.println((double)14/5);
        //             명시적                     암시적
        //(double)14/5-------> 14.0/5 -------> 14.0/5.0 ------->2.8

        System.out.println((double)(14/5));
        //               산술연산              명시적
        //(double)(14/5) ------> (double)(2) ------> 2.0


        int kor = 50 , eng = 60 , math = 80 ;

        int total = kor + eng + math ;
        double average= (double)total / 3 ;
        //total = 190 / 3 = 63 = 63 을 실수 average에 대입 63.0
        //                                암시적 형변환.
        // (double)을 붙혔으니 명시적 형변환


        System.out.println("총점 : "+ total);
        System.out.println("평균 : "+ average);


        char ch1 = 'c' ;
        char ch2 = 'a' ;

        boolean bool1 = ch1 > ch2 ; //암시적인 형변환이 되므로 99 > 97 즉, true
        System.out.println("bool1 : "+bool1);


        int result;
        result = ch1 - ch2 + 5 ;
        System.out.println("result : "+ result);


        //ch3 d가 대문자 일때 yes 아니면 no 해주세요
        char ch3 = 'D' ;
        String so ;
        so = ch3 >= 'A' && ch3 <= 'Z' ? "yes" : "no" ;

        System.out.println(so);
    }
}
