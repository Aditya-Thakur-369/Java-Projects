class Animals{
    int legs;
    String color;
    boolean veg ;
    boolean Nonveg ;
    void Animals(int legs,String color , boolean veg , boolean Nonveg){
        System.out.println("Animal Legs : " + legs );
        System.out.println("Animal Color :" + color);
        System.out.println("Animal Type : " + veg);
        System.out.println("Animal Type : " + Nonveg);
    }
}
class Lion extends Animals{
    String name;
    String hairsize ;
    void Lion(String name , String hairsize){
        System.out.println("Name of Lion : " + name);
        System.out.println("Hair Size of Lion : " + hairsize);
    }
}
class Birds extends Animals{
    int legs ;
    String Foundincountry;
    void Birds(int legs , String Foundincountry)
    {
        System.out.println("Bird legs : " + legs);
        System.out.println("Birds Found in These Countrys : " + Foundincountry);
    }


}

public class hierarchical_23 {
    public static void main(String[] args) {
        Lion a = new Lion();
        a.Animals(4,"Yellow",false, true);
        a.Lion("Shera","long Hair");
        Birds b = new Birds();
        b.Animals(2,"Blue",true, false);
        b.Birds(2, "India");
    }
}

