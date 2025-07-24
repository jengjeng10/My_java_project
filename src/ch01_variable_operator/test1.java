package ch01_variable_operator;


public class test1 {
    public static void main(String[] args){
        int a = 3 , b = 8 , c = 4;
        int result ;

        result = a > b? a : b ;
        result = result > c ? result : c ;
        //result 가 거짓일 경우 b의 값을 불러와서  c보다 크기가 클경우 result 호출 아니면 c 값 호출
        System.out.println(result);






    }
}
