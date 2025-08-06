package ch06_abstract_interface.beveragetest;

public class Latte00 extends Beverage{
    private String milkType;

    public Latte00(String name, double price, String milkType){
        super(name,price);
        this.milkType = milkType;
    }
    @Override
    public void drink(){
        String message ="부드럽고 크리미한 "+super.getName()+"를 마십니다.";
        System.out.println(message);
    }
    @Override
    public void make(){
        System.out.println(super.getName()+" 제조법");
        System.out.println("바닐라 시럽 1~2펌프 컵에 넣기");
        System.out.println("에스프레소 1~2샷 추출해서 컵에 붓기");
        System.out.println(this.milkType+ "180~200ml 추가하기");



    }

}
