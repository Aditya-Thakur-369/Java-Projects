import java.util.Scanner;

public class Prime_8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean count = false ;
        int num ;
        System.out.print("Enter Any Number : ");
        num = sc.nextInt();
        for(int i=2;i<=num/2;i++){
            if(i%num==0){
                count = true ;
                break ;
            }
        }
        if(!count){
            System.out.println("Prime Number ");
        }
        else{
            System.out.println("Not Prime Number ");
        }
    }
}
