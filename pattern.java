import java.util.*;
class pattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        int i,j,k;
        /**right-angled triangle */
        for (i = 1; i <= a; i++) { 
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /** pyramid */
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
                }
            System.out.println();
        }
        /** inerted right-angle triangle */
        for (i = 5; i >= 1; i--) { 
            for (j = 1; j <= i; j++) { 
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= a - i; j++) {        
                System.out.print(" ");
            }
            for (k= 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }   
        for (i = a - 1; i >= 1; i--) {
            for (j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for ( k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
