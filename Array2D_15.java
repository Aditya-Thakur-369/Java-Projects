import java.util.Scanner;

public class Array2D_15 {
    public static void main(String[] args) {
        int[][] num = new int[3][3] ;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.print ("Enter Value of : ( " + i + " ) and ( "+ j +") : ");
            Scanner sc= new Scanner(System.in);
            num[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
            System.out.println("Values Are : " + num[i][j]);
        }
    }
    }
}
