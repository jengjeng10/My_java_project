package ch04_class;

import java.util.Scanner;

public class RPGgameMain01 {
    public static void main(String[] args) {
        RPGgame01 character ;
        character = new RPGgame01 ();
        Scanner scan = new Scanner(System.in);

        System.out.print("캐릭터의 이름: ");
        character.setName (scan);

        System.out.println("1~4 정수중 원하는 숫자 : ");
        character.setJob (scan);


        System.out.println("선택한 직업: "+character.job_number());


        character.stat(scan,10);

        character.display();



    }
}
