package ch05_package_inheritance.mybeverage;

import ch05_package_inheritance.general.Beverage03;

public class InheTest04 {
    public static void main(String[] args) {
        //승급 : 서브 클래스가 일시적으로 슈퍼 클래스의 타입으로 변환이 되는 과정 :업 캐스팅
       Beverage04 beverage01 = new Americano04("아메리카노",4000.0,250.0);


        //슈퍼 클래스 내에 있는 메소드는 상속개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();
        System.out.println(beverage01.toString());

        // 승급시 서브 클래스내의 변수와 메소드는 일시적으로 접근을 하지 못하도록 설계되어 있습니다.
        // 단 , 강등을 하게 되면 서브 클래스 내의 변수와 메소드를 접근할 수 있습니다. 다운 캐스팅
        //int i = (int)3.14;
        Americano04 ame = (Americano04)beverage01; //강등
        ame.sipAmericano();

        Beverage04 beverage02 = new Espresso04("에스프레소",5000.0,2);
        beverage02.showInfo();
        System.out.println(beverage02.toString());
        Espresso04 espresso = (Espresso04)beverage02;
        espresso.drinkEspresso();

        Beverage04 beverage03 = new Latte04("라떼",6000.0,"아몬드 우유");
        beverage03.showInfo();
        System.out.println(beverage03.toString());
        Latte04 latte = (Latte04)beverage03;
        latte.enjoylatte();

        //승급 개념과 배열을 같이 사용하기
        //배열 초기화 기법 : 타입[] 배열이름 = {요소1,요소2,요소3 ...}
        Beverage04[] beverage ={
              beverage01, // 아메리카노
              new Espresso04("마이뿌레소",2000.0,1),
              new Latte04("바나나라떼",3000.0,"바나나 우유")
        };

        for(int i = 0; i < beverage.length; i++){
            System.out.println("--------------------------------");
            beverage[i].showInfo();
            System.out.println(beverage[i].toString());
            //beverage[i] instanceof Americano04
            //베브리지의 i번째 요소가 오른쪽에 있는 아메리카노 타입이 맞습니까? //개게 beverage[i]는 Ameicano04 클래스로 생성된 물건이 맞나요?
            if (beverage[i] instanceof Americano04){
                Americano04 xxx = (Americano04)beverage[i];
            }else if(beverage[i] instanceof Espresso04){
                Espresso04 yyy = (Espresso04)beverage[i];
            }else if(beverage[i] instanceof Latte04){
                Latte04 zzz = (Latte04)beverage[i];
            }else{

            }
        }

    }
}
