import java.util.*;
public class TestCircle{   
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      Circle circle1 = new Circle();
      System.out.println("The radius of circle1 is " + circle1.getRadius());
      System.out.print("Enter the radius of a circle: ");
      Circle circle2 = new Circle(in.nextDouble());
      System.out.printf("The radius of circle 2 is %8.2f\n", circle2.getRadius());
      System.out.printf("The diameter of circle %8.2f\n", circle2.getDiameter());
      System.out.printf("The area of circle 2 is %8.2f\n", circle2.getArea());
      System.out.printf("The perimeter of circle 2 is %8.2f\n", circle2.getPerimeter());
   }
}

class Circle{

   private double radius;
   
   public Circle(){
      radius = 1;
   }
   public Circle(double r){
      if(r <= 0){
         System.out.println("You must enter a positive number for radius.");
      } 
      else radius = r;  
   }
   public void setRadius(double r){
      radius = r;
   }
   public double getDiameter(){
      return 2 * radius;
   }
   public double getPerimeter(){
      return this.getDiameter() * Math.PI;
   }
   public double getRadius(){
      return radius;
   }
   public double getArea(){
      return radius * radius * Math.PI;
   }
}   
