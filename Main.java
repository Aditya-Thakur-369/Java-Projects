
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.transform.Source;

class User {
    String name;
    String number;
    int roll;

    User(String Name, String Number, int Roll) {
        this.name = Name;
        this.number = Number;
        this.roll = Roll;
    }

    void Display() {
        System.out.println(" " + this.name + " \t\t " + this.number + " \t\t " + this.roll);

    }
} 
public class Main {
    
    static List<User> lists = new ArrayList<User>();
    static int roll;
    static String name;
    static String number;
    public static void main(String[] args) {
        int take = 0 ;
        System.out.print("\t\t\t\t <-- Welcome To Student Management System --> \n");
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Delete Student");
        System.out.println("4. Search Student");
        System.out.println("0. EXIT");
        System.out.print("Enter Your Choice : ");
        take = sc.nextInt();
        switch (take) {
            case 1:
                Student();
                break;
            case 2:
                display();
                break;
            case 3:
                delete();
                break;
            case 4:
                Search();
                break;
                default : System.out.println("Error Solution");
        }
        }while(take>0);
    }

    static void Student() {
        String numt;
        int temp;
        // int roll;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Name : ");
            name = sc.nextLine();
            System.out.print("Enter Number : ");
            numt = sc.nextLine();
            for(int m=0;m<=12;m++){
            if(numt.charAt(0) == '9' && numt.charAt(1) == '1' && numt.length() == 12 && numt.matches("[0-9]+")){
                number = numt;
                break;
            }
            else{
                System.out.print("The Number You Enter is Invalid \n Please Enter a Valid Number : ");
                numt = sc.nextLine();
            }
        }
            System.out.print("Enter Roll Number : ");
            int finder = sc.nextInt();
            for (int i = 0; i < lists.size(); i++) {
                if (finder == lists.get(i).roll) {
                    System.out.println("ALREADY IN RECORD");
                    System.out.print("Please Enter a  Valid Roll No : ");
                    finder = sc.nextInt();
                } else
                    roll = finder;
            }
            User s = new User(name, number, roll);
            lists.add(s);
            System.out.println("Student Success Registered");
    }

    static void Search() {
        Scanner sc = new Scanner(System.in);
        int tmp;
        int c = 0 ;
        System.out.print("Enter Roll Number : ");
        int finder = sc.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            if (finder == lists.get(i).roll) {
                System.out.println(" Name \t      Number \t     Roll Number");
                lists.get(i).Display();
                c++;
            }
            // === 
        }
        if(c>0){
            System.out.println("Found");
        }else{
            System.out.println("No Record Found ");
        }
    }

    static void display() {
        System.out.println(" Name \t  \t    Number \t  \t   Roll Number");
        for (int i = 0; i < lists.size(); i++) {
            lists.get(i).Display();
        }
    }
    static void delete() {
        System.out.println("\t\t\t\t<-- Delete Student --> ");
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int v = 0 - 1;
        int de;

        System.out.print("Enter Roll Number : ");
        int finder = sc.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            v++;
            if (finder == lists.get(i).roll) {
                System.out.println(" Name \t\t      Number \t\t     Roll Number");
                lists.get(i).Display();

                c++;
                break;
            }
        }
        if (c > 0) {
            System.out.println("Do you Want to Delete Student ( PRESS 0 ): ");
            de = sc.nextInt();
            if (de == 0) {
                lists.remove(v);
                System.out.println("Student Deleted");
            }
        } else {
            System.out.println("No Record Found ");
        }

    }
   
}