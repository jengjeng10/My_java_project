package ch01_variable_operator;

public class Trapezoid {
    public static void main(String[] args) {

        int Upper_Base = 10 ;
        int Height = 15 ;
        int Lower_Base = 20 ;
        int area ;

        area = (Upper_Base + Lower_Base)*Height / 2 ;

        System.out.println("밑변 : "+Lower_Base);
        System.out.println("윗변 : "+Upper_Base);
        System.out.println("높이 : "+Height);
        System.out.println("면적 : "+area);

    }
}
