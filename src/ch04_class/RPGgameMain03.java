package ch04_class;


import java.sql.SQLOutput;

public class RPGgameMain03 {
    public static void main(String [] args){
// 타입[] 배열명 = new 타입[요소개수];
        RPGgame03[] char3 = new RPGgame03[2];

        char3[0] = new RPGgame03("안철수",6,10,4);

        char3[1] = new RPGgame03("하란","궁수",10,6,4);


        for (int i = 0; i < char3.length; i++) {

            char3[i].display();
        }


        RPGgame03 character1 ;
        character1 = new RPGgame03( "김철수","전사",6,4,10 );
        character1.display();

        RPGgame03 character2 ;
        character2 = new RPGgame03("영희",  4 , 10,6);
        character2.display();


        RPGgame03[] char4 = {
                new RPGgame03("박기수","소환사",3.1,5.6,9.3), // 0번째 객체 생성
                new RPGgame03("박현진",5.2,3.5,2.2) // 1번쨰 객체 생성
        } ;

        for (int i = 0; i < char4.length; i++) {
            char4[i].display();

        }












     /*   character1.setName("철수");
        character1.setJob("전사");
        character1.setStr(6);
        character1.setDex(4);
        character1.setCon(10);

        character2.setName("영희");
        character2.setJob("도적");
        character2.setStr(4);
        character2.setDex(10);
        character2.setCon(6); /*

        /*System.out.println("캐릭터의 이름 : "+character1.getName());
        System.out.println("캐릭터의 직업 : "+character1.getJob());
        System.out.print("STR : "+character1.getStr()+" ");
        System.out.print("DEX : "+character1.getDex()+" ");
        System.out.println("CON : "+character1.getCon()+" ");

        System.out.println();

        System.out.println("캐릭터의 이름 : "+character2.getName());
        System.out.println("캐릭터의 직업 : "+character2.getJob());
        System.out.print("STR : "+character2.getStr()+" ");
        System.out.print("DEX : "+character2.getDex()+" ");
        System.out.println("CON : "+character2.getCon()+" "); */

    }


}
