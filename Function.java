import java.util.*;

public class Function {

    public static void PrintMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int SumOfTwoNumbers(int a, int b) {
        int sum = a + b;

        return sum;

    }

    public static int factorialNumber(int n) {
        if (n == 0 || n < 1) {
            System.out.println("invalid number");
        } else {
            int factoria = 1;

            for (int i = n; i >= 1; i--) {
                factoria = factoria * i;
            }
            return factoria;
        }
        return 0;
    }

    public static int Avg(int n1, int n2, int n3) {
        int result = (n1 + n2 + n3) / 3;
        System.out.print("Average :" + result);
        return 0;
    }

    public static int sumOfOddNumbers(int n) {
        int output = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                output += i;
            }

        }
        System.out.print(output);
        return 0;

    }

    public static int greatNumber(int n1, int n2) {
        if (n1 > n2) {
            System.out.println(n1);

        } else {
            System.out.println(n2);
        }
        return 0;
    }

    public static float cir(float r) {
        final float pi = 3.13f;

        float circumference = 2 * pi * r;
        return circumference;

    }

    public static void AgeCheck(int age) {
        if (age > 18) {
            System.out.print("Eligibl to vote");
        } else {
            System.out.print("Not Eligibl to vote");
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        // String name = sc.next();

        // PrintMyName(name);

        // sum of 2 numbers using function

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = SumOfTwoNumbers(a, b);
        // System.out.println(sum);

        // int res = factorialNumber(n);
        // System.out.println(res);
        // fuinto print avrage of 3 numbers

        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // Avg(n1, n2, n3);

        // int n = sc.nextInt();
        // sumOfOddNumbers(n);
        // float r = sc.nextFloat();
        // float result = cir(r);
        // int age = sc.nextInt();
        // AgeCheck(age);
        
        Scanner sc = new Scanner(System.in);
        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter 1 to countinue and 0 to end");
        int input = sc.nextInt();

        while (input == 1) {
            int number = sc.nextInt();
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Enter 1 to countinue and 0 to end");
            input = sc.nextInt();
        }

        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);
sc.close();
    }
}
