package ch02_control_statement;

public class If04 {
    public static void main(String[] args) {
        int score = 90 ;
        System.out.println("점수 : "+score);
        if(score >= 90){
            System.out.println("A학점");
            //스코어가 80보다 크거나 같을경우 true
            //스코어가 90보다 작거나 같을경우 true
        }else if (score >= 80 && score < 90){
            System.out.println("B학점");
        }else if (score >= 70 && score < 80){
            System.out.println("C학점");
        }else if (score >= 60 && score < 70){
            System.out.println("D학점");
        }else{
            System.out.println("F학점");

        }

    }
}
