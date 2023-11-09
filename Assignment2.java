import java.util.Scanner;
interface En{
  void Show();
}
class Ab implements En{
  String name;
     
   public  void Show(){
    System.out.println("enter name"); 
}}
class Bc extends Ab{
  void Input(){
 Scanner in =new Scanner(System.in);
 
 name =in.nextLine();
 System.out.println(name);
  in.close();
  }
  
}
public class Assignment2{
public static void main(String args[]){
Ab obj=new Ab();
Bc b =new Bc();
obj.Show();
b.Input();



}
}