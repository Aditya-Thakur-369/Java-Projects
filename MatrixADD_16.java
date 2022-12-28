import java.util.Scanner;

public class MatrixADD_16 {
    public static void main(String[] args) {
        int[][] num1 = new int[2][2];
        int[][] num2 = new int[2][2];
        int[][] num3 = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter The Element of ( " + i + " ) and ( " + j + " ) : ");
                num1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter The Element of Second Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter The Element of ( " + i + " ) and ( " + j + " ) : ");
                num2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition Of Matrix");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num3[i][j] = num1[i][j] + num2[i][j];
                System.out.println("Addition Is : " + num3[i][j]);
            }
        }
    }
}
