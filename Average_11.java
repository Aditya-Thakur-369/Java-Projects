import java.util.Scanner;
// Each Cointain 30 marks as full marks
class Average{
    int maths;
    int science;
    int eng ;
    int chem ;
    
    void average(int maths , int science , int eng , int chem){
        int sum ;
        sum = maths + science + eng  + chem ;
        int ave = sum / 4 ;
        System.out.print("The Average of Marks is : " + ave);
    }

}
public class Average_11 {
    public static void main(String[] args) {
        Average a = new Average();
        a.average(21, 21, 24, 27);
    }
}
