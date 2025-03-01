import java.util.*;

public class Array {
    public static void main(String[] args) {

        // // int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        // // marks[0] = 10;
        // // marks[1] = 20;
        // // marks[2] = 30;
        // // marks[3] = 40;
        // // marks[4] = 50;
        // // for (int i = 0; i < 5; i++) {
        // // System.out.println(marks[i]);// this prints garbage value}
        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // boolean found = false;
        // System.out.print("Enter the elements of array:");
        // for (int j = 0; j < number.length; j++) {

        // number[j] = sc.nextInt();
        // }
        // System.out.print("Enter the number to search for:");
        // int x = sc.nextInt();

        // for (int k = 0; k < number.length - 1; k++) {
        // if (number[k] == x) {
        // System.out.println(number[k]);
        // found = true;
        // break;
        // }
        // }
        // if (!found) {
        // System.out.print("Number not found.");
        // }
        // 2d Array
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] numberArray = new int[row][col];

        // intput
        System.out.print("Enter the elements of 2d array");
        for (int i = 0; i < row; i++) {
            for (int h = 0; h < col; h++) {
                numberArray[i][h] = sc.nextInt();
            }
        }

        // output
        System.out.println("Element to sear for:");
        int x = sc.nextInt();// elemet to search
        for (int q = 0; q < row; q++) {
            for (int w = 0; w < col; w++) {
                if (numberArray[q][w] == x) {
                    System.out.println("row : " + q + "," + "col :" + w);
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
