import java.util.Scanner;

public class Simple_Interest_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p , t , r ;
        double sp ;
        System.out.print("Enter Principle : ");
        p = sc.nextInt();
        System.out.print("Enter Time : ");
        t = sc.nextInt();
        System.out.print("Enter Rate : ");
        r = sc.nextInt();
        sp = ( p * t * r ) / 100 ;
        System.out.println("Simple Interest Will We : " + sp);
    }
}