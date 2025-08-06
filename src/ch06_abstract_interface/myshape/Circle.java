package ch06_abstract_interface.myshape;

public class Circle extends Shape {
    private double radius; // 반지름
    private double xpos; // x 좌표
    private double ypos; // y 좌표;

    public Circle(String linecolor, String fillcolor, double radius ,double xpos ,double ypos) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override  // 둘레 = 2.0 * 파이 * radius
    public double CalcPerimeter() {
     //   삼각형의 둘레 길이를 구하려면, 삼각 함수를 공부해야 됩니다.
        return 2.0 * 3.14 * radius ;
    }

    @Override
    public void display() {
        super.area = this.CalcArea();
        super.perimeter = this.CalcPerimeter();
        System.out.println("원 정보");
        System.out.println("면적 : "+super.area);
        System.out.println("둘레 : "+super.perimeter);
        String message ;
        message = "원 중심 : ("+ this.xpos + ", "+ this.ypos + ")";
        System.out.println(message);

    }

    @Override
    public double CalcArea() { //원의 면적
        return 3.14 * this.radius * this.radius ;




    }

}