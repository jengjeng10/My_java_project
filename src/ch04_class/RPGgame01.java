package ch04_class;
import java.util.Scanner;

public class RPGgame01 {

    private String name; // 플레이어의 이름
    void setName (Scanner scan){
        name = scan.next();
    }

    private int job; // 직업
    void setJob (Scanner scan){
        job = scan.nextInt();

    }



    private int STR , DEX , CON ; // 힘 , 민첩 , 체력


    String job_number() {
        if (job == 1) {
            return "모험가";
        } else if (job == 2) {
            return "도적";
        } else if (job == 3) {
            return "전사";
        } else if (job == 4) {
            return "마법사";
        } else  {
            return "잘못된 숫자 입니다.";

        }
    }

    void stat (Scanner scan,int totalpoints ) {

        while (true) {
            System.out.println("총" + totalpoints + "스텟 포인트를 STR , DEX ,CON 에 분배하세요");

            System.out.print("STR: ");
            STR = scan.nextInt();

            System.out.print("DEX: ");
            DEX = scan.nextInt();

            System.out.print("CON: ");
            CON = scan.nextInt();

            int sum = STR + DEX + CON;

            if (sum == totalpoints && STR >= 0 && DEX >= 0 && CON >= 0) {
                System.out.println("스텟 분배 완료!");
                break;
            } else {
                System.out.println("잘못된 분배입니다. 총합이 " + totalpoints + "이 되어야 합니다.");
            }
        }
    }
            void display(){

                System.out.println("캐릭터 이름 : "+name);
                System.out.println("캐릭터 직업 : "+job_number());
                System.out.print("STR : "+STR+", ");
                System.out.print("DEX : "+DEX+", ");
                System.out.println("CON : "+CON);
            }


    }
