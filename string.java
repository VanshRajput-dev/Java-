import java.util.*;

public class string {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // catination
        String char1 = "Vansh";
        String char2 = "Singh";
        String charFull = char1 + " " + char2;
        System.out.println(charFull);
        // substrin
        System.out.println(charFull.substring(0, 6));
        // length
        System.out.println(charFull.length());
        // comparTo
        // if c1>c2 return positver value
        // if c1<c2 return negative value
        // if c1==c2 return 0
        if (char1.compareTo(char2) == 0) {
            System.out.println(charFull);
        } else {
            System.out.println("Not equal");
        }

        // string builder

        StringBuilder name = new StringBuilder("Vansh");

        System.out.println(name.charAt(0));

        // setchar function
        name.setCharAt(0, 'r');
        System.out.println(name);

        // insert char at the specified index

        name.insert(2, 'n');
        System.out.println(name);

        // delet the extra n
        name.delete(2, 3);
        System.out.println(name);

        // we can also append in string builder append simplly adds to existing string
        // and the catination in noraml creats new string where something is added
        name.append(" singh");
        System.out.println(name);

        // Reverse String

        StringBuilder str = new StringBuilder("Baldwin");

        for (int i = 0; i < str.length() / 2;i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);

        }
        System.out.println(str);
        sc.close();

        // operators 
    }

}
