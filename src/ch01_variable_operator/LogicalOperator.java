package ch01_variable_operator;

public class LogicalOperator {
    public static void main(String[] args){
       int x = 3 , y = 2;

        System.out.println("x = "+x+", y = "+y);
        System.out.println("(x >= y) : "+ (x >= y)); // x = 3 이 y = 2 보다 크거나 같을 경우 true 결과값 :true
        System.out.println("!(x >= y) : "+ !(x >= y)); // x = 3 이 y = 2 보다 크거나 같을 경우 true ! 트루를 펄스로 펄스를 트루로 결과값 :false
        System.out.println("!(x == y) : "+ (x == y)); // x와 y 값이 같을 경우 true 다르니 false
        System.out.println("(x != y) : "+ (x != y)); // x와 y 값이 다를 경우 true 결과값: true


        System.out.println("(-1 < 0) : "+ (-1 < 0)); // -1 값이 0보다 작을 때 true

        System.out.println("(3>2)&&(3>4) : "+ ((3>2)&&(3>4))); // 3의 값이 2보다 클경우 true and 3의 값이 4보다 클경우 true 답:false   && 모든 조건이 참일 때만 true 답:false


        System.out.println("(x != y)&&(-1 > 0) : "+ ((x != y)&&(-1 > 0))); // x의 값이 y와 다를경우 false  -1 의 값이 0보다 클경우 true &&둘 다 참일 경우 true 아니면 false
        System.out.println("('a' > 'b') : "+ ('a' > 'b')); // 아스키 코드 예를들어 a는 97 b는 98 정수로 치환됨 a가 b보다 클경우 true

        System.out.println("(13 >= 5)||(-5 <= 10) : "+ ((13>=5)||(13<=15)) );// 13 값이 5보다 크거나 같을경우 true || 13값이 15보다 작거나 같을경우 true || 조건중 하나라도 참일 때 true


    }
}
