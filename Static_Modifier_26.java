class Operation{
    int add(int a  , int b){
        return a + b ;
    }
    static int sub(int a  , int b ){
        return a - b ;
    }
}

public class Static_Modifier_26 {
    public static void main(String[] args) {
        Operation a = new Operation();
        System.out.println("The Addition of 2 and 2 is : " + a.add(2, 2));
        System.out.println("The Subtraction of 4 and 2 is : " + Operation.sub(4, 2));
    }
}
