import java.util.*;
class Solution23{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter text: ");
      while (sc.hasNext()) {
         String input = sc.next();
         
         Stack<Character> st = new Stack<Character>();
         boolean isBalanced = true;
 
         for(int i = 0; i < input.length(); i++){
             char c = input.charAt(i); 
             if(c == '(' || c == '{' || c == '['){
                 st.push(c);
             }
             else if(c == ')' || c == '}' || c == ']'){
                 if(st.empty()) isBalanced = false;
                 else{
                    char lastIn = st.pop();
                    if(c == ')' && lastIn != '(') isBalanced = false;
                    else if(c == '}' && lastIn != '{') isBalanced = false;
                    else if(c == ']' && lastIn != '[') isBalanced = false;
                 }  
            }
         }
         if(!st.empty()) isBalanced = false; 
         System.out.println(isBalanced);  
      }  
   }
}
