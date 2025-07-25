package ch02_control_statement;

public class Multilf01 {
    public static void main(String[] args) {
        int temp = 24;
        String so ;



        if(temp >= 35){
            so = "폭염 경보";
        }else if(temp >= 30 ){
            so = "무더운 날씨";
        }else if(temp >= 20){
            so = "쾌적한 날씨";
        }else if(temp >= 10){
            so = "쌀쌀한 날씨";
        }else{
            so = "추운 날씨";

        }
        System.out.println(temp+"도는 "+so+" 입니다.");
    }
}
