package ch02_control_statement;

public class ForTest01 {
    public static void main(String[] args) {
        int three = 3;
        int total = 0;

        for(int i = 1 ; i < 10 ; i++) {
            total = three * i;

            System.out.println(three + "*" + i + "= " + total);
        }
    }
}
