import java.util.Scanner;

public class Even_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.print("Enter Anu Number : ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("Number Is Even");
        }
        else{
            System.out.println("Number Is Odd");
        }
    }
}
