package ch04_class;

public class ShapeAreaMain {
    public static void main(String [] args){
    ShapeArea obj = new ShapeArea();

        //메소드 오버로딩


        System.out.println("사각형의 면적 : "+obj.area(5,10));
        System.out.println("원의 면적 : "+obj.area(10));
        System.out.println("사다리꼴의 넒이 : "+obj.area(5,15,10));
    }
}
