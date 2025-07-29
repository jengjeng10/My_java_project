package ch02_control_statement;

import java.util.Scanner;

public class whileTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0; //횟수
        int total = 0; // 총점

        double ave = 0; // 평균
        while (true) {
            System.out.print("점수 입력 : " );
            int grade = scan.nextInt();

            if (grade < -10) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else if (grade < 0) {
                grade = -grade;
            } else {

            }
            count++;
            total += grade;

        }
        ave = (double) total / count;
        System.out.println("총 시험 빈도(회수) : " + count);
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + ave);
    }
}

