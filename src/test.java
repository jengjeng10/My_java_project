public class test {
    public static void main(String[] args){
        int total = 0;


        for (int i = 97 ; i >= 2 ; i -= 5){

            total += i;


        }
        System.out.println(total);

        total = 0;

        for(int i = 1; i <= 96 ; i += 5) {
            total += i * i ;


        }
        System.out.println(total);

        total = 0 ;
        for(int i = 1;i <= 5 ; i ++){
            total += i * (i + 1);


        }
        System.out.println(total);
    }
}
