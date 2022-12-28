class Over{
    String name ;
    int number;
    Over(String n , int b){
        this.name = n ;
        this.number = b ;
    }
    Over(){
        System.out.println("This is a New Constructor ");
    }
    Over(String name ){
        this.name = name ;
        System.out.println("This Is your name : " + name);
    }
    Over(int Number){
        this.number = Number ;
        System.out.println("Number : " + this.number);
    }

}

public class ConstructorOverloading_21 {
    public static void main(String[] args) {
        Over a = new Over("Aditya" , 213);
        System.out.println("Name : " + a.name + " Roll is : " + a.number );
        Over b = new Over();
        Over c = new Over("Aditya");
        Over d = new Over(324234);
    }
}
