package ch04_class;

public class SaramMain02 {
    public static void main(String[] args){
        System.out.println(Saram02.nationality);

        Saram02 yusin ;
        yusin = new Saram02();
        yusin.name = "김유신";
        yusin.height = 172.5 ;
        yusin.weight = 65.8 ;
        yusin.hobby = "축구";
        yusin.blood = "AB" ;


        Saram02 soon ;
        soon = new Saram02();
        soon.name = "유관순";
        soon.height = 165.5 ;
        soon.weight = 55.8 ;
        soon.hobby = "당구";
        soon.blood = "O" ;

        yusin.nationality = "한국";

        System.out.println(soon.nationality);
        System.out.println(Saram02.nationality);
        //스태틱 yusin이 변수의 값을 변경하면 soon도 nati
        // 스태틱 메소드도 있고

        yusin.display(); // . 메소드를 호출 한다
        soon.display();
    }
}
