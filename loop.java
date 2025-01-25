import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = in.nextInt();
        int d=-1,e=1,i=0,c,j;
        System.out.println("Fibonacci Series:");
        while(i<a-2){
            c = d+e;
            System.out.println(c);
            d = e;
            e = c;
            i++;
        }
        for(i=1;i<=a;i++){
            System.out.println("Multiplication table "+i+":");
            for(j=1;j<=10;j++){
                System.out.print(i+" * "+j+" = "+(i*j)+"\n");
            }
            System.out.println("\n");
        }
    }
}