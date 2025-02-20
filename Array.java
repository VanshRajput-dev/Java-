import java.util.*;

public class Array {
    public static void main(String[] args) {

        // int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        // marks[3] = 40;
        // marks[4] = 50;
        // for (int i = 0; i < 5; i++) {
        // System.out.println(marks[i]);// this prints garbage value}
        System.out.println("Enter the size of array:3");
        int size = sc.nextInt();
        int number[] = new int[size];
       
        
            for (int j = 0; j < number.length; j++) {
                System.out.print("Enter the elements of array:");
                number[j] = sc.nextInt();
            }
            System.out.println("Enter the number to search for:");
            int x = sc.nextInt();
            
            for (int k = 0; k < number.length; k++) {
                if (number[k] == x) {
                    System.out.println(k);
                } {
                    System.out.println("Number not found.");
                }
            }
            
        

    }

}
