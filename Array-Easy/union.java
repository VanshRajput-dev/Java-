import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class union{

    public static int[] arrayUnion(int []nums1, int []nums2){

        Set<Integer> myset = new HashSet<>();
        int n = nums1.length;
        int k = nums2.length;
         

        for(int i = 0;i<n;i++){
            myset.add(nums1[i]);
        }

         for(int i = 0;i<k;i++){
            myset.add(nums2[i]);
        }
int []union = new int[myset.size()];
        int j = 0;

        for(int x:myset){
            union[j++] = x;
        }
return union;
        

    }
    public static void main(String[] args) {

        int [] nums1 = {1,1,3,4,5,5,6};
        int [] nums2 = {7,7,8,9,10,10};
        


int[] result = arrayUnion(nums1, nums2);

for(int i : result){
    System.out.print(i);
}
 
        
    }
}