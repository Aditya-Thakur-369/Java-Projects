class Car{
    String name ;
    String Manufacturedin;
    String color;
    int Wheels ;
    void Car(String name , String Manufacturedin , String color, int Wheels ){
        System.out.println("Name : " + name);
        System.out.println("Manufactured In : " + Manufacturedin);
        System.out.println("Color : " + color);
        System.out.println("Wheels : " + Wheels);
    }
}
class SuperCar extends Car{
    int sets;
    int Wheelsize;
    void SuperCar(int sets , int Wheelsize){
        System.out.println("Sets : " + sets);
        System.out.println("Wheela Size : " + Wheelsize);
    }
}
class CityCar extends SuperCar{
    int topSpeed;
    boolean automatic = false;
    String interiorColor;
    void CityCar(int topSpeed , boolean automatic , String interiorColor ){
        System.out.println("Top Speed : " + topSpeed);
        System.out.println("Automatic Car : " + automatic);
        System.out.println("Interior color : " + interiorColor);
    }


}
public class Multiple_24 {
    public static void main(String[] args) {
        CityCar a  = new CityCar();
        a.Car("Swift","India","Blue",4);
        a.SuperCar(4,22);
        a.CityCar(170,true, "Lether Red");
    }
}
