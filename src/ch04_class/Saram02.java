package ch04_class;

public class Saram02 {
    static String nationality ="대한 민국" ;
    // static 변수 =클래스 변수 = 정적 변수
    //멤버(인스턴스)변수
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    //double PI = 3.14 ; // 인스턴스 변수
    final double PI = 3.14 ; // 상수(constant)


    public void display() { //멤버 메소드 new *
       // PI = 5.14 ;
        int total = 0 ; // 메소드 범위 내에서 선언된 변수를 지역변수라 한다.
        for (int i = 1; i < 11; i++){
            total += i;
        }


        System.out.println("총합 : "+total);

        System.out.println("국적 : "+nationality);
        System.out.println("이름 : "+name);
        System.out.println("키 : "+height);
        System.out.println("몸무게 : "+weight);
        System.out.println("취미 :  "+hobby);
        System.out.println("혈액형 : "+blood);
    }
}
