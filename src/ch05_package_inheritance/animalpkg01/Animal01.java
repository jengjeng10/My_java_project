package ch05_package_inheritance.animalpkg01;

public class Animal01  {
    private String name;
    private int lifespan;
    private String habitat;
    private int speed;

    public int getSpeed(){
        return speed;
    }

    public Animal01(String name,int lifespan, String habitat, int speed){
    this.name = name;
    this.lifespan = lifespan;
    this.habitat = habitat;
    this.speed = speed;
    }
    public void showInfo(){
        String message = "평균 수명이 "+this.lifespan+"인 "+this.name+"의";
        message +=" 서식지는 "+this.habitat+"입니다";
        System.out.println(message);
    }
public String getName(){
        return name;
}

    public Animal01(){


    }
}
