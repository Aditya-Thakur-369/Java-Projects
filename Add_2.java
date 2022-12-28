import java.util.Scanner;

public class Add_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  , b , c ;
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        c = a + b ;
        System.out.println("The Addition of " + a + " and " + b + " is " + c);
    }
}
