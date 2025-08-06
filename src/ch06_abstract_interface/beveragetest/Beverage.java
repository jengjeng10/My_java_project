package ch06_abstract_interface.beveragetest;

public abstract class Beverage {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public Beverage() {

    }

    protected final void showData() {
       String message = "음료 "+this.name+"의 단가는 "+this.price+"입니다.";
       System.out.println(message);

    }

   public abstract void drink();
   public abstract void make();
}
