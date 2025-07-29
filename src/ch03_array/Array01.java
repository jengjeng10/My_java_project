package ch03_array;

public class Array01 {
    public static void main(String[] args) {

        String[] bt = new String[7];
        bt[0] = "진";
        bt[1] = "뷔";
        bt[2] = "정국";
        bt[3] = "rm";
        bt[4] = "지민";
        bt[5] = "슈가";
        bt[6] = "제이홉";

        System.out.println("배열 요소 출력하기");

        /*for (int i = 0; i < bt.length; i++) {

            System.out.print(bt[i]+", ");*/


        for (int i = 0; i < bt.length; i++) {

            {
                if (i != (bt.length -1)) {
                    System.out.print(bt[i]+", ");

                } else if(i == 6 )  {
                    System.out.println(bt[i]);

                }
            }
        }
    }
}