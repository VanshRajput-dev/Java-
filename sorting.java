import java.util.*;

public class sorting {

    public static void printArray(int arr[]) {

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + " \n");
        }

    }
    public static void main(String args[]){





 //bubble sort 

 int arr[] = {9,6,4,3};

 for(int i =0;i<arr.length-1;i++){
    for(int j = 0;j<arr.length-1-i;j++){
        if(arr[j]> arr[j+1]){

            int tem = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = tem;
        }
 
    }
 }

 

//selection sort



    }
}
