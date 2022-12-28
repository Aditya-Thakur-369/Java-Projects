class Const{
    String name ;
    int b ;
    Const(String A , int B){
        this.name = A ;
        this.b = B ;
    }
}
public class Constructor_20 {
    public static void main(String[] args) {
        Const a = new Const("Aditya", 22);
        System.out.println("Name : " + a.name + " And Roll No : " + a.b);
             
    }
}
