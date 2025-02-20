public class pattern {
    public static void main(String[] args) {
    
          
         // butterfly pattern
          int n = 4;
          int i;
          
          for ( i = 1; i <= n; i++) {
          for (int j = 1; j <= i; j++) {
          System.out.print("*");
          }
          int space = 2*(n-i);
          for(int j = 1 ; j<=space;j++){
          System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
          System.out.print("*");
          }
          System.out.println();
          }
          
          for(i=4;i>=1;i--){
          
          for(int j = 1; j<= i;j++){
          System.out.print("*");
          }
          int space = 2*(n-i);
          for(int j = 1 ; j<=space;j++){
          System.out.print(" ");
          }
          for (int j = 1; j <= i; j++) {
          System.out.print("*");
          }
          System.out.println();
          
          }
        
        // solid rohmbus
       
        for ( i = 1; i <= n; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");

            }
 
            for(int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }


 // NUMBER PYRAMID

 


for( i = 1;i<=n;i++){
    for(int j = 1;j<n-i;j++){
        System.out.print(" ");
    }

    for(int j = 1;j<=i;j++){
        System.out.print(i+ " ");
    }
System.out.println();
}
 
// plaindrome pattern

 
for( i = 1; i<=n;i++){
    //space
    for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
    }
for (int j = i;j>=1;j--){
    System.out.print(j);
}

for(int j = 2; j<=i;j++){
    System.out.print(j);
}
 
System.out.println();
}

 
//diamond pattern

 
 
for ( i = 1; i<=n;i++){
    for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
    }
 
    for(int j = 1;j<=2*i-1;j++){
        System.out.print("*");

    }
System.out.println();
}

for ( i = n; i>=1;i--){
    for(int j = 1;j<=n-i;j++){
        System.out.print(" ");
    }

    for(int j = 1;j<=2*i-1;j++){
        System.out.print("*");

    }

System.out.println();

}

 

    }
}







 