package ch07_collection;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        // 잘못된 데이터를 받지 않기위해서 제네릭을 사용함
        // coffeeList.add(100);
        List<String> coffeeList = new ArrayList<String>();
        coffeeList.add("아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("에스프레소");
        coffeeList.add("마키야또");
        coffeeList.add("카페라떼");

        int idx = -1;
        String finddata = "카페라떼" ;
        idx = coffeeList.indexOf(finddata);
        System.out.println(finddata +"의 인덱스 번호 : "+ idx);

        idx = coffeeList.lastIndexOf(finddata);
        System.out.println(finddata +"의 인덱스 번호 : "+ idx);

        finddata = "카푸치노" ;
        idx = coffeeList.indexOf(finddata);
        System.out.println(finddata +"의 인덱스 번호 : "+ idx);

        // '카푸치노' 항목이 존재하지 않으면, 추가해 보세요

        if(coffeeList.indexOf(finddata) == -1) {
            coffeeList.add(2,"카푸치노");
        }


        idx = coffeeList.indexOf(finddata);
        System.out.println(finddata +"의 인덱스 번호 : "+ idx);

        for (String item:coffeeList){
            System.out.print(item+ "\t");
        }

        System.out.println();
        finddata = "콜드 브루" ;
        coffeeList.set(5,finddata);


        finddata = "카푸치노";
        coffeeList.remove(finddata);

        coffeeList.add(finddata);

        for(String item:coffeeList){
            System.out.println(item);
        }

        String item = coffeeList.get(3);
        System.out.println("특정 위치 요소 : "+item);

        System.out.println("일반 for 구문으로 요소 출력하기");
        for (int i = 0; i < coffeeList.size(); i++) {
            String data = coffeeList.get(i);
            System.out.println(data);
        }


        System.out.println("\n요소 크기 : " +coffeeList.size());


    }


}
