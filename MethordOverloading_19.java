class Methord{
    void Sum(){
        int a = 20 ; 
        int b = 30 ;
        int c = a + b ;
        System.out.println(c);
    }
    int Sum(int a , int b){
        int c = a + b ;
        return c;
    }
}

public class MethordOverloading_19 {
    public static void main(String[] args) {
        Methord a = new Methord();
        a.Sum();
        System.out.println(a.Sum(2,3));
    }
}
