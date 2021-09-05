import java.util.Scanner;
public class day1{
public static void main(String[] args) {
 int roll;
 String name;
 Float marks;
 Scanner sc =new Scanner(System.in); 
 System.out.print("Enter the roll no: ");
 roll = sc.nextInt();
 System.out.println("Roll no: " + roll );
 System.out.print("Enter the name: ");
 sc.nextLine();
 name = sc.nextLine();
 System.out.println("name:"+ name );
 System.out.print("Enter the marks: ");
 marks= sc.nextFloat();
 System.out.println("marks:"+ marks );
} 
}