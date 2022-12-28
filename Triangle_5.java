import java.util.Scanner;

public class Triangle_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float b , h , a ;
        System.out.print("Enter Height : ");
        h = sc.nextFloat();
        System.out.print("Enter Breath : ");
        b = sc.nextFloat();
        a = ( b * h ) / 2 ;
        System.out.println("Area Of Triangle Is : " + a );
    }
}
