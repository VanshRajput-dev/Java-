import java.util.Scanner;

public class missing {

    static public int missingNumber(int[] nums) {
        int n = nums.length;
        int maxSum = (n * (n + 1) / 2);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return maxSum - sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
sc.close();
int result = missingNumber(nums);
System.out.println(result);

    }
}