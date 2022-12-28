import java.util.Scanner;
class Area{
    int Height;
    int width;
    int area(int w , int h){
        int area;
        area = w * h ;
        return area;
    }
}

public class Rectangle_6 {
    public static void main(String[] args) {
        Area a = new Area();
        System.out.println("Area of Rectangle is : " + a.area(2 ,3 ));
    }
}
