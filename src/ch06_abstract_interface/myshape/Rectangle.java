package ch06_abstract_interface.myshape;

import java.sql.SQLOutput;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String linecolor, String fillcolor, double width,double height){
        super(linecolor,fillcolor);
        this.width = width;
        this.height = height;

    }

    @Override // 둘레 = 2.0 * (밑변 + 높이)
    public double CalcPerimeter() {
        return 2.0 * (width + height);
    }

    @Override
    public void display() {
        super.area = this.CalcArea();
        super.perimeter = this.CalcPerimeter();
        System.out.println("사각형 정보");
        System.out.println("면적 : "+super.area);
        System.out.println("둘레 : "+super.perimeter);
    }

    @Override
    public double CalcArea() {
        return this.width * this.height ;


    }
}
