import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student implements Comparable<Student>{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    public int compareTo(Student s){
        if((int)(this.getCgpa() * 100) == (int)(s.getCgpa() * 100))
            if(this.getFname().equals(s.getFname()))
                return this.getToken() - s.getToken();
            else return this.getFname().compareTo(s.getFname());
        else return (int)(s.getCgpa() * 100) - (int)(this.getCgpa() * 100); 
    }
}

public class PriorityQueueProblem {

    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        PriorityQueue<Student> pq = new PriorityQueue<Student>();
        //pq.add(new Student(35, "Shafaet", 3.7));
        // pq.add(new Student(42, "Ashley", 3.9));
//         pq.add(new Student(46, "Maria", 3.6));
//         pq.add(new Student(49, "Anik", 3.95));
//         pq.add(new Student(50, "Dan", 3.95));
//         Student stud = pq.poll();
//         for(Student stu: pq) System.out.println(stu.getFname());
        
        int totalEvents = Integer.parseInt(in.nextLine());
        
        while(totalEvents>0){
            String event = in.next();
            if(event.equals("ENTER")){
                String name = in.next();
                double cgpa = Double.parseDouble(in.next());
                int id = Integer.parseInt(in.next());
                
                pq.add(new Student(id, name, cgpa));  
            }
            else if(event.equals("SERVED")){
                Student servedStudent = pq.poll();
            }
            totalEvents--;  
        }
        
        if(pq.peek() == null) 
            System.out.println("EMPTY");
        else{
            int size = pq.size();
            for(int i = 0; i < size; i++){
               Student next = pq.poll();
               System.out.println(next.getFname());
            }
        }   
    }
}    