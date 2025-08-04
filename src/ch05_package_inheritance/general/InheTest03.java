package ch05_package_inheritance.general;

public class InheTest03 {
    public static void main(String[] args) {
        //다양한 음료 객체 생성
        Americano03 americano = new Americano03("아메리카노",4000.0,200.0);

        Espresso03 espresso = new Espresso03("에스프레소",5000.0, 2);

        Latte03 Latte = new Latte03("라떼",4000,"아몬드");


        americano.printInfo();
        espresso.printInfo();
        Latte.printInfo();
    }
}
