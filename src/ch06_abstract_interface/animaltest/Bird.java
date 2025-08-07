package ch06_abstract_interface.animaltest;

public interface Bird {
   final int speed = 300;
   //public static final int speed = 300;
    void fly();
    //public abstract void fly(); 뒤에 public abstract이 숨겨져 있음

    default void flutter(){
        System.out.println("날개를 펄럭입니다.");
    }



}
