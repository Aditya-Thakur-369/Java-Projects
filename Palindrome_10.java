import java.util.*;

import javax.xml.transform.SourceLocator;
public class Palindrome_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 , rem  , num , ori ;
        System.out.print("Enter Any Number : ");
        num = sc.nextInt();
        ori = num ;
        while(num!=0){
            rem = num % 10 ;
            sum = ( sum * 10 ) + rem ;
            num = num / 10 ;
        }
        if(ori == sum)
        System.out.println("Palindrome Number ");
        else
        System.out.println("Not a Palindrome Number");
        sc.close();
    }
}

