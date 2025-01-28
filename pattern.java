import java.util.*;
class pattern{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        int i,j,k;
        //Square
        for (i = 1; i <= a; i++) {
            for (j= 1; j <= a; j++) {
                if (i == 1 || i == a || j == 1 || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //triangle
        for ( i = 1; i <= a; i++) {
            for ( k = 1; k <= a - i; k++) { 
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) { 
                if (j == 1 || j == 2 * i - 1 || i == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
