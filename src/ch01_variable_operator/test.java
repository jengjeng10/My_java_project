package ch01_variable_operator;

public class test {
    public static void main(String[] args) {
        int a = 3 , b = 5 ; // 정수형 변수 a와 b를 정의후 할당 a는 3, b는 5
        int result ; //정수타입의 변수 result를 정의

        result = a < b ? b - a  : a - b ;
        //result = a가 b보다 작으면 ? b - a를 빼기 : a - b 를 빼기
            System.out.println("절대 값 : "+result);









    }
}
