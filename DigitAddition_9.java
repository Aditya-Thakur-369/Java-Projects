import java.util.Scanner;

public class DigitAddition_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 , rem  , num ;
        System.out.print("Enter Any Number : ");
        num = sc.nextInt();
        while(num!=0){
            rem = num % 10 ;
            sum = sum + rem ;
            num = num / 10 ;
        }
        System.out.println(sum);
        sc.close();
    }
}
