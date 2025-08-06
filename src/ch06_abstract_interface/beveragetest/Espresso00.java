package ch06_abstract_interface.beveragetest;

public class Espresso00 extends Beverage{
    private int shotCount ;

    public Espresso00(String name, double price, int shotCount){
        super(name,price);
        this.shotCount = shotCount;
    }
    @Override
    public void drink(){
        String message ="맛이 진하고 강렬한 "+super.getName()+"를 마십니다.";
        System.out.println(message);
    }
    @Override
    public void make(){
        System.out.println(super.getName()+" 제조법");
        System.out.println("원두를 미세하게 갈아서, 탬퍼로 평평하게 눌러줍니다");
        System.out.println("포터필터를 머신에 장착하고, 25-30초 동안 30ml의 에스프레소를 추출합니다.");

    }
}
