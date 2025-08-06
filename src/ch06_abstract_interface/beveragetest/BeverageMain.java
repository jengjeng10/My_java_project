package ch06_abstract_interface.beveragetest;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage[] beverages = {
                new Americano00("아메리카노",4000.0,250.0),
                new Espresso00("마이뿌레소",2000.0,1),
                new Latte00("바닐라라떼",3000.0,"따듯한 우유")
        };


        for (int i = 0; i < beverages.length; i++) {
            beverages[i].showData();
            beverages[i].drink();
            beverages[i].make();
            System.out.println("-----------------------------");
        }
    }
}
