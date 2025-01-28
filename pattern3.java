import java.util.*;
class pattern3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int i,j;
        //hourglass pattern
        for ( i = n; i >= 1; i--) {
            for ( j = 1; j <= n - i; j++){ System.out.print(" ");}
                for ( j = 1; j <= 2 * i - 1; j++) {System.out.print("*");}
            System.out.println();
        }
        for ( i = 2; i <= n; i++) {
            for ( j = 1; j <= n - i; j++) {System.out.print(" ");}
                for ( j = 1; j <= 2 * i - 1; j++) {System.out.print("*");}
            System.out.println();
        }
        //butterfly pattern
        for (i = 1; i <= n; i++) {
            for ( j = 1; j <= i; j++) System.out.print("*");
                for ( j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
                    for ( j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) System.out.print("*");
                for (j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
                    for ( j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }
}