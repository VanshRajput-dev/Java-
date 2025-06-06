import java.util.*;


public class recursion {

   

    public static void print_name(int count){
        if (count < 5){
             System.out.print("Name");
             count++; 
             print_name(count);
        }


    }
    public static void main(String args[]){
        int count = 0;

 print_name(count);
    }
}

 
        
