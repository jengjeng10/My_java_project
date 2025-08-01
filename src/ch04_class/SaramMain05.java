package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        // 타입[] 배열명 = new 타입[요소개수];
        int[] arr = new int[3];
        Saram05[] saram = new Saram05[2]; // 배열 정의

        saram[0] = new Saram05("이순신",180.5,75.0,"농구","AB"); // 0번째 객체 생성

        saram[1] = new Saram05("김유신",180.2,70.0,"0"); // 1번쨰 객체 생성


        for (int i = 0; i < saram.length; i++) {
            saram[i].display();
        }

                //가독성을 늘리기위해 중괄호안을 엔터를 침
        //타입[] 배열명 = 중괄호 해당 배열의 내용을 직접 초기화 하는 방법
        Saram05[] mylist = {
                new Saram05("박영희",150.5,55.0,"수영","B"), // 0번째 객체 생성
                new Saram05("최진철",180.2,66.0,"A") // 1번쨰 객체 생성
        } ;

        for (int i = 0; i < mylist.length; i++) {
            mylist[i].display();

        }


    }
}
