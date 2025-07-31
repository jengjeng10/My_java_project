package ch04_class;

public class ShapeArea {
    final double PI = 3.14;

    int area (int width, int height){
        int result ;
        result = width * height ;

        return result;
    }

    double area (int radius){
        double result ;
        result = radius * radius * PI ; //암시적 형변환

        return result;
    }
    int area (int top, int bottom, int width){
        int result ;
        result = (top + bottom) * width / 2;
        return result;
    }



}
