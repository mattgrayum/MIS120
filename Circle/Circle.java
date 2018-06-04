
public class Circle{
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
   public double getRadius(){
      return radius;
   }
   public double getArea(){
      return radius * radius * Math.PI;
   }
}   
public class TestCircle{   
   public static void main(String[] args){
      Circle c = new Circle();
      System.out.println(c.getRadius());
   }
}