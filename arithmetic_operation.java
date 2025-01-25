import java.util.*;
class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string value:");
        String ch = in.nextLine();
        System.out.println("Enter a float/double value:");
        double d = in.nextDouble();
        System.out.println(d);
        System.out.println(ch);
        System.out.println("Enter two no's:");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Arithmetic operations:");
        System.out.println("ADD: "+(a+b));
        System.out.println("SUB: "+(a-b));
        System.out.println("MUL: "+(a*b));
        System.out.println("DIVIDE:  QUO: "+(a/b)+" REM: "+(a%b));
    }
}