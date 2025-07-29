package ch02_control_statement;

public class WhileTest1 {
    public static void main(String[] args){
        int dan = 3;
        int total = 0;
        int i = 1;

        while(i < 10){
            total = dan * i ;
            System.out.println(dan+" * "+i+" = "+total );
            i++;

        }


    }
}
