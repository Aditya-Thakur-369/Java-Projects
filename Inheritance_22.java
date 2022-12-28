class Car{
    String Color ;
    String Name ;
    void Car(String color , String name){
        System.out.println(" Color is : " + color + "\n Name is : " + name);
    }
}
class BMW extends Car{
    String Feature;
    void Feature(){
        System.out.println(" Features are : \n AC \n Leather Sets \n Top Speed 250 \n Balck In Color");
    }

}

public class Inheritance_22 {
    public static void main(String[] args) {
        BMW a = new BMW();
        a.Car("Blue","S class");
        a.Feature();

    }
}
