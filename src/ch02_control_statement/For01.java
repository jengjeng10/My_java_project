package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total;
        total = 0;

        for (int i = 0; i <= 10; i++) {
            total += i;
        }
        System.out.println("총합01 : " + total);


        total = 0;
        for (int i = 1;i <= 100 || i < 101 ; i += 3) {
                total += i; //누적

        }

        System.out.println("총합02 : " + total);

        total = 0;
        for (int i = 97 ; i > 1  ; i -= 5){
            total += i;



        }
        System.out.println("총합03 : " + total);

        total = 0;
        for (int i = 1 ; i < 97 ; i += 5){
            total += i * i ;
        }

        System.out.println("총합04 : " + total);

        total = 0;
        for (int i = 1 ; i < 6  ; i++ ){
            total += i * (i+1);

        }
        System.out.println("총합05 : " + total);
    }

}
