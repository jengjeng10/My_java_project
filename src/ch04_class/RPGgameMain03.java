package ch04_class;


import java.sql.SQLOutput;

public class RPGgameMain03 {
    public static void main(String [] args){

        RPGgame03 character1 ;
        character1 = new RPGgame03();

        RPGgame03 character2 ;
        character2 = new RPGgame03();

        character1.setName("철수");
        character1.setJob("전사");
        character1.setStr(6);
        character1.setDex(4);
        character1.setCon(10);

        character2.setName("영희");
        character2.setJob("도적");
        character2.setStr(4);
        character2.setDex(10);
        character2.setCon(6);

        System.out.println("캐릭터의 이름 : "+character1.getName());
        System.out.println("캐릭터의 직업 : "+character1.getJob());
        System.out.print("STR : "+character1.getStr()+" ");
        System.out.print("DEX : "+character1.getDex()+" ");
        System.out.println("CON : "+character1.getCon()+" ");

        System.out.println();

        System.out.println("캐릭터의 이름 : "+character2.getName());
        System.out.println("캐릭터의 직업 : "+character2.getJob());
        System.out.print("STR : "+character2.getStr()+" ");
        System.out.print("DEX : "+character2.getDex()+" ");
        System.out.println("CON : "+character2.getCon()+" ");

    }


}
