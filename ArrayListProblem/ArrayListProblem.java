import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = in.nextInt();
            for(int j = 0; j < size; j++){
               list.add(in.nextInt());
            }
            map.put(i + 1, list);
        }
        int queries = in.nextInt();
        for(int i = 0; i < queries; i++){
            int lineNum = in.nextInt();
            int element = in.nextInt();
            ArrayList line = map.get(lineNum);
            if(element > line.size()){
               System.out.println("ERROR!");
            } 
            else{
               System.out.println(line.get(element - 1));
            }
        }
    }
}