package ch02_control_statement;

public class For05 {
    public static void main(String[] args) {
        int a = 0; //


        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                a += i;



            }


        }
        System.out.println(a);
    }
}