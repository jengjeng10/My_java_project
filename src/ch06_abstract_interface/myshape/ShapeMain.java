package ch06_abstract_interface.myshape;

public class ShapeMain {
    public static void main(String[] args){
        //배열[] 타입 = {...}; 선 색깔 채우기 색깔 너비 높이

        Shape[] shape = {
            new Triangle("yellow","black",15.0,10.0),
            new Rectangle("red","green",20.0,10.0),
            new Circle("pink", "blue", 5.0 ,3.0 ,4.0)
        };
        for (int i = 0; i <shape.length; i++) {
                shape[i].display();
                shape[i].draw();
                System.out.println();
                    //사각형의 둘레 width +height * 2
        }
        System.out.println("==============================");
        System.out.println("추상 클래스는 불완전한 클래스이므로 객체 생성이 불가능합니다.");
        System.out.println("즉 new 키워드 오른쪽에 올 수 없습니다.");
        // Shape myshape = new Shape();
        //Anonymous Inner Type은 불완전한 메소드를 구체화 시키는 조건으로 객체 생성을 허락해주는 방식입니다.
        Shape sample01 = new Shape() {
            @Override
            public double CalcArea() {
                return 0;
            }

            @Override
            public double CalcPerimeter() {
                return 0;
            }

            @Override
            public void display() {
                System.out.println("호호");
            }
        };
        for (int i = 0; i < 3; i++) {
            sample01.display();
        }

        //추상 클래스는 참조 변수로는 사용 가능합니다.
        //추상클래스 객체 = new 구현체클래스()
        Shape sample02 = new Rectangle("blue","pink",10.0,15.0);
        sample02.display();
        sample02.draw();
    }
}
