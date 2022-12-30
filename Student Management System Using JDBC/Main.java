import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
interface Student{
    static void AddStudent(){};
}
public class Main{
    static int id;
    static String name;
    static String email;
    static String fname;
    static int fnum;
    static int num;
    static String address;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t<-- Welcome To Student Management System --> \n\n");
        do{
            System.out.print("\033[H\033[2J");
            System.out.flush();
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Display Student");
        System.out.println("4. Update Student");
        System.out.println("5. Search Student");
        System.out.print("What's Your Choice --> ");
        int op = sc.nextInt();
        switch(op){
            case 1: AddStudent();
            break;
            case 2: Delete();
            break;
            case 3: Display();
            break;
            case 4: Update();
            break;
            case 5: Search();
            break;
            default : System.out.println("Invalid Choice !!!");
        }
    }while(true);
    }
    static void AddStudent(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
            PreparedStatement psmt = con.prepareStatement("Insert into Student values(?,?,?,?,?,?,?)");
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter Your ID : ");
                id = Integer.parseInt(bf.readLine());
                System.out.print("Enter Your Name : ");
                name = bf.readLine();
                System.out.print("Enter Your Email : ");
                email = bf.readLine();
                System.out.print("Enter Father's Name : ");
                fname = bf.readLine();
                System.out.print("Enter Father's Number : ");
                fnum = Integer.parseInt(bf.readLine());
                System.out.print("Enter Your Number : ");
                num = Integer.parseInt(bf.readLine());
                System.out.print("Enter You Address : ");
                address = bf.readLine();

                psmt.setInt(1, id);
                psmt.setString(2,name);
                psmt.setString(3,email);
                psmt.setString(4, fname);
                psmt.setInt(5, fnum);
                psmt.setInt(6, num);
                psmt.setString(7, address);

                int count = psmt.executeUpdate();
                if(count>0){
                    System.out.println("You Are Register");
                }else{
                    System.out.println("Sorry Something Went Wrong !!!");
                }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.print("DO YOU WANT ADD MORE [ YES / NO ] : ");
        String ch = sc.nextLine();
        if(ch.equalsIgnoreCase("Yes")){
            AddStudent();
        }

    }
    static void Delete(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        String value;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
            Statement smt = con.createStatement();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Student ID : ");
            value = bf.readLine();
            id = Integer.parseInt(value);
            int count = smt.executeUpdate("delete from student where sid = " + id);
            if(count>0){
                System.out.println("Student Deleted Successfully ");
            }else{
                System.out.println("Something Went Wrong");
            }

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.print("DO YOU WANT ADD MORE [ YES / NO ] : ");
        String ch = sc.nextLine();
        if(ch.equalsIgnoreCase("Yes")){
            Delete();
        }
    }
    static void Display(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("select * from student");
            System.out.println("ID  NAME    EMAIL   FATHER'S NAME   FATHER'S    NUMBER    NUMBER  ADDRESS");
            while(rs.next()){
                id = rs.getInt(1);
                name = rs.getString(2);
                email = rs.getString(3);
                fname = rs.getString(4);
                fnum = rs.getInt(5);
                num = rs.getInt(6);
                address = rs.getString(7);
                 
                System.out.printf("%-10d   %-10s  %-10s  %-10s  %-10d  %-10d  %-10s\n",id,name,email,fname,fnum,num,address);

            }
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.print("PRESS ENTER TO REACH MAIN MENU [ ENTER ] : ");
        String ch = sc.nextLine();
        if(ch.equalsIgnoreCase("Yes")){
            Display();
        }
    }
static void Update(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        String values;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
            Statement smt = con.createStatement();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter ID : ");
            values = bf.readLine();
            id = Integer.parseInt(values);
            System.out.print("Enter New Name : ");
            name = bf.readLine();
            System.out.print("Enter New Email : ");
            email = bf.readLine();
            System.out.print("Enter New Father's Name : ");
            fname = bf.readLine();
            System.out.print("Enter Father's Number : ");
            values = bf.readLine();
            fnum = Integer.parseInt(values);
            System.out.print("Enter New Number : ");
            values = bf.readLine();
            num = Integer.parseInt(values);
            System.out.print("Enter New Address : ");
            address = bf.readLine();

            int count = smt.executeUpdate("update student set sname = '" + name + "' , semail = '"+email+"' , fname = '"+fname+"' , fnumber = "+fnum+"  , snumber = "+num+" ,  address = '"+address+"' where sid = " + id );
            if(count>0){
                System.out.println("Student Updated Successfully ");
            }else{
                System.out.println("Something Went Wrong ");
            }

        }catch(Exception e){
            System.out.println(e);
        }
        System.out.print("DO YOU WANT TO UPDATE MORE [ YES ] : ");
        String ch = sc.nextLine();
        if(ch.equalsIgnoreCase("Yes")){
            Update();
        }
    }
    static void Search(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        String Value;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
            Statement smt = con.createStatement();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter ID : ");
            Value = bf.readLine();
            id = Integer.parseInt(Value);
            System.out.println("ID  NAME    EMAIL   FATHER'S NAME   FATHER'S    NUMBER    NUMBER    ADDRESS\n");
            ResultSet rs = smt.executeQuery("Select * from student where sid = " + id);
            while(rs.next()){
                id = rs.getInt(1);
                name = rs.getString(2);
                email = rs.getString(3);
                fname = rs.getString(4);
                fnum = rs.getInt(5);
                num = rs.getInt(6);
                address = rs.getString(7);
                 
                System.out.printf("%-10d   %-10s  %-10s  %-10s  %-10d  %-10d  %-10s\n",id,name,email,fname,fnum,num,address);

            } 
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.print("\nDO YOU WANT TO SEARCH AGAIN [ YES ]: ");
        String ch = sc.nextLine();
        if(ch.equalsIgnoreCase("Yes")){
            Search();
        }
    }
}