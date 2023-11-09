 import java.util.Scanner;//import for using Scanner input
 //decrale interface 'E'
 interface E{
   void display();
 }
 //create class 'A' and implement interface "E'
 class A implements E{
   double len;
      double he;
     public  void display(){
     System.out.println("enter length and height"); 
}}
//create class 'A' annd inherit from A 
 class B extends A{
   void Input(){
  Scanner in =new Scanner(System.in);
  
   len =in.nextInt();
   he =in.nextInt();
   in.close();
   }
   
}
//create class 'C' annd inherit from B 
class C extends B{
 double area(){
   return len*he;
 }

}
//create class 'D' annd inherit from C
class D  extends C  {
  public  double perimeter(){
   
      return (len+he)*2;
      
   }
}
//create Main class which have same name as file name
public class Assignment1{
  //creating main method
public static void main(String args[]){
//creating object for calling all method from all classes
  D obj =new D();
  //calling method
obj.display();
obj.Input();
System.out.println(obj.area());
System.out.println(obj.perimeter());





}
}