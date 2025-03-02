import java.util.*;


public class string {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
  
        //catination 
        String char1 = "Vansh";
        String char2 = "Singh";
        String charFull = char1 +" " + char2;
        System.out.println(charFull); 
        //substrin
        System.out.println(charFull.substring(0,6));
        //length
        System.out.println(charFull.length());
        //comparTo
        //if c1>c2 return positver value
        //if c1<c2 return negative value 
        //if c1==c2 return 0
        if(char1.compareTo(char2)==0){
            System.out.println(charFull);
           } else{
                System.out.println("Not equal");
            }


sc.close();
    }
    
}
