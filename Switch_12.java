import java.util.Scanner;

import javax.xml.transform.Source;

public class Switch_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,b ,c ,op ;
        System.out.println("\t\t\t\t\t<== Welcome To Calculator ==> \n");
        System.out.print("Enter First Number : ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Number for test of Cointinue ");
        System.out.println("4. Number for use of break ");
        System.out.print("Choose One of Above : ");
        op = sc.nextInt();
        switch(op){
            case 1: c = a + b;
            System.out.println(c);
            break;
            case 2: c = a - b;
            System.out.println(c);
            break;
            case 3: int temp;
            System.out.print("Enter Any Number ( UNDER 10 ) : ");
            temp = sc.nextInt();
            for(int i=0;i<11;i++){
                if(i==temp){
                    continue;
                }
                System.out.println(i);
            }
            System.out.println(temp + " is Not in the List ");
            break;
            case 4: int temp1;
            System.out.print("Enter Any Number ( UNDER 10 ) : ");
            temp1 = sc.nextInt();
            for(int i=0;i<11;i++){
                if(i==temp1){
                    break;
                }
                System.out.println(i);
            }
            System.out.println("List Is Printed till " + temp1);
            break;
            default : System.out.println("Error Choice !!");
        }
    }
}
