package ch06_abstract_interface.myshape;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(String linecolor, String fillcolor, double width, double height){
        super(linecolor,fillcolor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double CalcPerimeter() {
        return 20.0;
    }

   /* @Override
    protected void draw() {
        System.out.println("하하");
    }*/

    @Override
    public void display() {
        super.area = this.CalcArea();
        super.perimeter= this.CalcPerimeter();
        System.out.println("삼각형 정보");
        System.out.println("면적 : "+super.area);
        System.out.println("둘레 : "+super.perimeter);
    }

    //Implementation : 구체화
    @Override //부모 클래스의 추상 메소드를 오버라이딩 했습니다
    public double CalcArea() { // 각 클래스는 각자의 맡은 역할을 여기에 구현하면 됩니다.
        return this.width * this.height / 2.0;




        }
    }

