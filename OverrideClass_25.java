class A{
    void Show(){
        System.out.println("This Is First Class");
    }
}
class B extends A{
    void Show(){
        System.out.println("This is a Second Class ");
    }
}

public class OverrideClass_25 {
    public static void main(String[] args) {
        B a = new B();
        a.Show();
    }
}
