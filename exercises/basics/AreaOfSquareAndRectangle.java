package basics;

public class AreaOfSquareAndRectangle {

    public static int area(int side){
        return side * side;
    }

    public static int area(int width, int height){
        return width * height;
    }

    public static void main(String[] args){

        System.out.println(area(5));
        System.out.println(area(4,6));
    }
}
